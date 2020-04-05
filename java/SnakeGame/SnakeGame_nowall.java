import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import java.io.IOException;

class snake {
	int x, y, L;
	int[] tailx, taily;

	snake(int W, int H) {
		x = W/2;
		y = H/2;
		L = 0;
		tailx = new int[W*H];
		taily = new int[W*H];
	}

	void eatfood() {
		this.L += 1;
	}
}

class map {
	int height;
	int width;
	map(int W, int H){
		height = H;
		width = W;
	}
}

class food {
	int x;
	int y;

	void reset(int W, int H, snake s) {
		this.x = (int) (Math.random() * W + 1);
		this.y = (int) (Math.random() * H);
	
		if ((this.x == s.x) && (this.y == s.y)) {
			s.eatfood();
			reset(W, H, s);
		}
		
		if (s.L > 0) {
			boolean Food_on_tail = false;
			for (int i = 0; i < s.L; i++) {
				if ((this.x == s.tailx[i]) && (this.y == s.taily[i]))
					Food_on_tail = true;
			}
			if (Food_on_tail)
			{
				s.eatfood();
				reset(W, H, s);
			}		
		}
	}

	food(int W, int H) {
		this.x = (int) (Math.random() * W + 1);
		this.y = (int) (Math.random() * H);
	}

}

public class SnakeGame_nowall extends JFrame {

	static char dir = '0';
	static char Predir = '0';
	static int score = 0;
	static boolean GameOver = false;
	static int Width = 20; 
	static int Height = 16;
	static int Speed = 0;
	
	public static void main(String... arg) throws IOException, InterruptedException {
		
		
		new SnakeGame_nowall();
		snake S = new snake(Width, Height);
		map M = new map(Width, Height);
		food F = new food(Width, Height);
		
		
		while (!GameOver) {
			CleanScreen();
			Update(S, F, M, dir, Width, Height);
			Draw(S, M, F, GameOver);
			Speed = UpdateSpeed(score);
			}

	}
	
	public static int UpdateSpeed(int score) throws InterruptedException {
		if((270 - score)>100) {
			Thread.sleep(270 - score);
			return (int) (score/(1.7));
		}else {
			Thread.sleep(100);
			return 100;
		}
		
		

	}

	public static void Update(snake s, food f, map m, char dir, int W, int H) {

		if (s.L > 0) {
			
			for (int i = s.L - 1; i >= 1; i--) {
				
				s.tailx[i] = s.tailx[i - 1];
				s.taily[i] = s.taily[i - 1];
			}
			
			s.tailx[0] = s.x;
			s.taily[0] = s.y;
		}
		
		
		
		if(((dir =='s')&&(Predir == 'w'))||((dir =='w')&&(Predir == 's'))||((dir =='a')&&(Predir == 'd'))||((dir =='d')&&(Predir == 'a'))) {
			dir = Predir;
		}
		switch (dir) {
		case 'w':
			s.y -= 1;
			break;
		case 's':
			s.y += 1;
			break;
		case 'a':
			s.x -= 1;
			break;
		case 'd':
			s.x += 1;
			break;
		}
		Predir = dir;
		
		if ((s.x == 0) || (s.x == m.width + 1) || (s.y == -1) || (s.y == m.height)) {
			
			if (s.x == 0) {
				s.x = m.width;
			} else if (s.x == m.width + 1) {
				s.x = 1;
			} else if (s.y == -1) {
				s.y = m.height - 1;
			} else { // s.y = m.height
				s.y = 0;
			}
		}
		
		for (int i = 0; i < s.L; i++) {
			if ((s.x == s.tailx[i]) && (s.y == s.taily[i])) {
				GameOver = true;
			}
		}
		
		if ((s.x == f.x) && (s.y == f.y)) {
			f.reset(W, H, s);
			s.eatfood();
			score += 10;
		}

	}

	public static void CleanScreen() throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();// 清除螢幕
	}

	public static void Draw(snake s, map m, food f, boolean Gameover) {
		int W = m.width;
		int H = m.height;
		int snake_x = s.x;
		int snake_y = s.y;
		int food_x = f.x;
		int food_y = f.y;
		for (int i = 0; i < W + 2; i++)
			System.out.printf("#");
		System.out.printf("\n");

		
		if (!Gameover) {
			
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W + 2; j++) {
					if (j == 0) {
						System.out.printf("#");
					} else if (j == W + 1) {
						System.out.printf("#");
					} else if ((i == food_y) && (j == food_x)) {
						System.out.printf("F");
					} else if ((i == snake_y) && (j == snake_x)) {
						System.out.printf("Q");
					} else if (s.L > 0) {
						boolean is_tail = false;
						for (int k = 0; k < s.L; k++) {
							if ((s.tailx[k] == j) && (s.taily[k] == i)) {
								System.out.printf("O");
								is_tail = true;
								break;
							}
						}
						if (!is_tail)
							System.out.printf(" ");
					} else {
						System.out.printf(" ");
					}
				}
				System.out.printf("\n");
			}
		} else {
			
			for (int i = 0; i < H; i++) {
				if (i != H / 2) {
					for (int j = 0; j < W + 2; j++) {
						if (j == 0) {
							System.out.printf("#");
						} else if (j == W + 1) {
							System.out.printf("#");
						} else {
							System.out.printf(" ");
						}
					}
					System.out.printf("\n");
				} else {

					System.out.printf("#");
					for (int j = 0; j < (W - 10) / 2; j++) {
						System.out.printf(" ");
					}
					System.out.printf("GAME OVER!");
					for (int j = 0; j < (W - 10) / 2; j++) {
						System.out.printf(" ");
					}
					if (W % 2 != 0)
						System.out.printf(" ");
					System.out.printf("#\n");
				}
			}

		}

		for (int i = 0; i < W + 2; i++)
			System.out.printf("#");
		System.out.printf("\n");
		System.out.println("Score : " + score);
		System.out.println("Speed : " + Speed + "%");
	}

	public SnakeGame_nowall() {
		this.setSize(250, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("監聽鍵盤輸入");
		this.setVisible(true);
		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				dir = e.getKeyChar();				
			}
		});
	}
}