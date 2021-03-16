import javax.swing.*;
import java.awt.*;
import java.util.Random;

class application {
    JFrame frame = new JFrame();
    Container container = frame.getContentPane();
    SpringLayout layout = new SpringLayout();

    Random random = new Random();

    // управление
    // горизонтальные кнопки
    JButton B1L = new JButton();
    JButton B1R = new JButton();
    JButton B2L = new JButton();
    JButton B2R = new JButton();
    JButton B3L = new JButton();
    JButton B3R = new JButton();
    // вертикальные кнопки
    JButton B4U = new JButton();
    JButton B4D = new JButton();
    JButton B5U = new JButton();
    JButton B5D = new JButton();
    JButton B6U = new JButton();
    JButton B6D = new JButton();

    // элементы
    // 1-3
    JButton B00 = new JButton();
    JButton B01 = new JButton();
    JButton B02 = new JButton();
    // 4-6
    JButton B10 = new JButton();
    JButton B11 = new JButton();
    JButton B12 = new JButton();
    // 6-9
    JButton B20 = new JButton();
    JButton B21 = new JButton();
    JButton B22 = new JButton();

    JButton SET_RANDOM = new JButton();
    JButton AUTO_START = new JButton();
    JButton AUTO_STOP = new JButton();
    JButton RESET_PREVIOUS_RANDOM = new JButton();

    JLabel labelCounter = new JLabel();
    JLabel labelSteps = new JLabel();
    JLabel messageCounter = new JLabel();

    JTextArea textArea = new JTextArea(7,21);

    // цвет
    Color red = new Color(255, 118, 118);
    Color yellow = new Color(255, 216, 127);
    Color blue = new Color(128, 173, 255);
    Color temp = new Color(212, 212, 212);

    Font font = new Font("Serif", Font.BOLD, 22);
    Font font2 = new Font("Serif", Font.PLAIN, 14);

    Color [][] matrix = {{red,red,red}, {yellow,yellow,yellow}, {blue,blue,blue}};
    Color [][] savedRandomMatrix;

    String log;

    void generateMatrix() {
        for (int i = 0; i < random.nextInt(100); i++ ) {
            int random_number = random.nextInt(11);
            System.out.println(random_number + " ");
            try { Thread.sleep(10); } catch (Exception e) { /*error*/ }
            switch (random_number) {
                case 0:
                    act_B4U();
                    break;
                case 1:
                    act_B5U();
                    break;
                case 2:
                    act_B6U();
                    break;
                case 3:
                    act_B4D();
                    break;
                case 4:
                    act_B5D();
                    break;
                case 5:
                    act_B6D();
                    break;
                case 6:
                    act_B1L();
                    break;
                case 7:
                    act_B1R();
                    break;
                case 8:
                    act_B2L();
                    break;
                case 9:
                    act_B2R();
                    break;
                case 10:
                    act_B3L();
                    break;
                case 11:
                    act_B3R();
                    break;
                default:
            }
        }

        savedRandomMatrix = new Color[][] {
                {B00.getBackground(), B01.getBackground(), B02.getBackground()},
                {B10.getBackground(), B11.getBackground(), B12.getBackground()},
                {B20.getBackground(), B21.getBackground(), B22.getBackground()}
        };

        matrix[0][0] = savedRandomMatrix[0][0];
        matrix[0][1] = savedRandomMatrix[0][1];
        matrix[0][2] = savedRandomMatrix[0][2];

        matrix[1][0] = savedRandomMatrix[1][0];
        matrix[1][1] = savedRandomMatrix[1][1];
        matrix[1][2] = savedRandomMatrix[1][2];

        matrix[2][0] = savedRandomMatrix[2][0];
        matrix[2][1] = savedRandomMatrix[2][1];
        matrix[2][2] = savedRandomMatrix[2][2];

        messageCounter.setText("Перемешано!");
        textArea.setText("Тут будут записаны ходы. ");
        log = "";
    }

    boolean auto_rolling = true;

    void update() {

        // верхняя линия
        B4U.setText("4U");
        B4U.setFocusPainted(false);
        B4U.setPreferredSize(new Dimension(50, 50));
        container.add(B4U);
        layout.putConstraint(SpringLayout.WEST, B4U, 60, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B4U, 10, SpringLayout.NORTH, container);

        //add_button("name", "4U",50,50,50,0);
        B5U.setText("5U");
        B5U.setFocusPainted(false);
        B5U.setPreferredSize(new Dimension(50, 50));
        container.add(B5U);
        layout.putConstraint(SpringLayout.WEST, B5U, 110, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B5U, 10, SpringLayout.NORTH, container);

        B6U.setText("6U");
        B6U.setFocusPainted(false);
        B6U.setPreferredSize(new Dimension(50, 50));
        container.add(B6U);
        layout.putConstraint(SpringLayout.WEST, B6U, 160, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B6U, 10, SpringLayout.NORTH, container);

        // 1 линия
        B1L.setText("1L");
        B1L.setFocusPainted(false);
        B1L.setPreferredSize(new Dimension(50, 50));
        container.add(B1L);
        layout.putConstraint(SpringLayout.WEST, B1L, 10, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B1L, 60, SpringLayout.NORTH, container);

        B00.setText("");
        B00.setFocusPainted(false);
        B00.setBackground(matrix[0][0]);
        B00.setPreferredSize(new Dimension(50, 50));
        container.add(B00);
        layout.putConstraint(SpringLayout.WEST, B00, 60, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B00, 60, SpringLayout.NORTH, container);

        B01.setText("");
        B01.setFocusPainted(false);
        B01.setBackground(matrix[0][1]);
        B01.setPreferredSize(new Dimension(50, 50));
        container.add(B01);
        layout.putConstraint(SpringLayout.WEST, B01, 110, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B01, 60, SpringLayout.NORTH, container);

        B02.setText("");
        B02.setFocusPainted(false);
        B02.setBackground(matrix[0][2]);
        B02.setPreferredSize(new Dimension(50, 50));
        container.add(B02);
        layout.putConstraint(SpringLayout.WEST, B02, 160, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B02, 60, SpringLayout.NORTH, container);

        B1R.setText("1R");
        B1R.setFocusPainted(false);
        B1R.setPreferredSize(new Dimension(50, 50));
        container.add(B1R);
        layout.putConstraint(SpringLayout.WEST, B1R, 210, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B1R, 60, SpringLayout.NORTH, container);


        // 2 линия
        B2L.setText("2L");
        B2L.setFocusPainted(false);
        B2L.setPreferredSize(new Dimension(50, 50));
        container.add(B2L);
        layout.putConstraint(SpringLayout.WEST, B2L, 10, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B2L, 110, SpringLayout.NORTH, container);

        B10.setText("");
        B10.setFocusPainted(false);
        B10.setBackground(matrix[1][0]);
        B10.setPreferredSize(new Dimension(50, 50));
        container.add(B10);
        layout.putConstraint(SpringLayout.WEST, B10, 60, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B10, 110, SpringLayout.NORTH, container);

        B11.setText("");
        B11.setFocusPainted(false);
        B11.setBackground(matrix[1][1]);
        B11.setPreferredSize(new Dimension(50, 50));
        container.add(B11);
        layout.putConstraint(SpringLayout.WEST, B11, 110, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B11, 110, SpringLayout.NORTH, container);

        B12.setText("");
        B12.setFocusPainted(false);
        B12.setBackground(matrix[1][2]);
        B12.setPreferredSize(new Dimension(50, 50));
        container.add(B12);
        layout.putConstraint(SpringLayout.WEST, B12, 160, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B12, 110, SpringLayout.NORTH, container);

        B2R.setText("2R");
        B2R.setFocusPainted(false);
        B2R.setPreferredSize(new Dimension(50, 50));
        container.add(B2R);
        layout.putConstraint(SpringLayout.WEST, B2R, 210, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B2R, 110, SpringLayout.NORTH, container);


        // 3 линия
        B3L.setText("3L");
        B3L.setFocusPainted(false);
        B3L.setPreferredSize(new Dimension(50, 50));
        container.add(B3L);
        layout.putConstraint(SpringLayout.WEST, B3L, 10, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B3L, 160, SpringLayout.NORTH, container);

        B20.setText("");
        B20.setFocusPainted(false);
        B20.setBackground(matrix[2][0]);
        B20.setPreferredSize(new Dimension(50, 50));
        container.add(B20);
        layout.putConstraint(SpringLayout.WEST, B20, 60, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B20, 160, SpringLayout.NORTH, container);

        B21.setText("");
        B21.setFocusPainted(false);
        B21.setBackground(matrix[2][1]);
        B21.setPreferredSize(new Dimension(50, 50));
        container.add(B21);
        layout.putConstraint(SpringLayout.WEST, B21, 110, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B21, 160, SpringLayout.NORTH, container);

        B22.setText("");
        B22.setFocusPainted(false);
        B22.setBackground(matrix[2][2]);
        B22.setPreferredSize(new Dimension(50, 50));
        container.add(B22);
        layout.putConstraint(SpringLayout.WEST, B22, 160, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B22, 160, SpringLayout.NORTH, container);

        B3R.setText("3R");
        B3R.setFocusPainted(false);
        B3R.setPreferredSize(new Dimension(50, 50));
        container.add(B3R);
        layout.putConstraint(SpringLayout.WEST, B3R, 210, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B3R, 160, SpringLayout.NORTH, container);


        // нижняя линия
        B4D.setText("4D");
        B4D.setFocusPainted(false);
        B4D.setPreferredSize(new Dimension(50, 50));
        container.add(B4D);
        layout.putConstraint(SpringLayout.WEST, B4D, 60, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B4D, 210, SpringLayout.NORTH, container);

        B5D.setText("5D");
        B5D.setFocusPainted(false);
        B5D.setPreferredSize(new Dimension(50, 50));
        container.add(B5D);
        layout.putConstraint(SpringLayout.WEST, B5D, 110, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B5D, 210, SpringLayout.NORTH, container);

        B6D.setText("6D");
        B6D.setFocusPainted(false);
        B6D.setPreferredSize(new Dimension(50, 50));
        container.add(B6D);
        layout.putConstraint(SpringLayout.WEST, B6D, 160, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, B6D, 210, SpringLayout.NORTH, container);



        AUTO_START.setText("AU");
        AUTO_START.setFocusPainted(false);
        AUTO_START.setPreferredSize(new Dimension(50, 50));
        container.add(AUTO_START);
        layout.putConstraint(SpringLayout.WEST, AUTO_START, 10, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, AUTO_START, 10, SpringLayout.NORTH, container);

        AUTO_STOP.setText("ST");
        AUTO_STOP.setFocusPainted(false);
        AUTO_STOP.setPreferredSize(new Dimension(50, 50));
        //container.add(AUTO_STOP);
        layout.putConstraint(SpringLayout.WEST, AUTO_STOP, 210, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, AUTO_STOP, 210, SpringLayout.NORTH, container);

        SET_RANDOM.setText("RN");
        SET_RANDOM.setFocusPainted(false);
        SET_RANDOM.setPreferredSize(new Dimension(50, 50));
        container.add(SET_RANDOM);
        layout.putConstraint(SpringLayout.WEST, SET_RANDOM, 210, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, SET_RANDOM, 10, SpringLayout.NORTH, container);


        RESET_PREVIOUS_RANDOM.setText("RS");
        RESET_PREVIOUS_RANDOM.setFocusPainted(false);
        RESET_PREVIOUS_RANDOM.setPreferredSize(new Dimension(50, 50));
        container.add(RESET_PREVIOUS_RANDOM);
        layout.putConstraint(SpringLayout.WEST, RESET_PREVIOUS_RANDOM, 210, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, RESET_PREVIOUS_RANDOM, 210, SpringLayout.NORTH, container);





        labelCounter.setText("0");
        labelCounter.setFont(font);
        //container.add(labelCounter);
        layout.putConstraint(SpringLayout.WEST, labelCounter, 100, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, labelCounter, 280, SpringLayout.NORTH, container);

        labelSteps.setText("Steps:");
        labelSteps.setFont(font);
        //container.add(labelSteps);
        layout.putConstraint(SpringLayout.WEST, labelSteps, 15, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, labelSteps, 280, SpringLayout.NORTH, container);

        messageCounter.setText("");
        messageCounter.setFont(font);
        container.add(messageCounter);
        layout.putConstraint(SpringLayout.WEST, messageCounter, 10, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, messageCounter, 280, SpringLayout.NORTH, container);

        textArea.setText("Ходы: ");
        //textArea.setFont(font);

        textArea.setBackground(new Color(238, 238, 238, 255));
        textArea.setFont(font2);
        //textArea.setBorder(BorderFactory.createCompoundBorder());
        textArea.setLineWrap(true);
        container.add(textArea);
        layout.putConstraint(SpringLayout.WEST, textArea, 12, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, textArea, 325, SpringLayout.NORTH, container);

        //textArea

    }

    void window() {
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setBounds(0,0,286,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        container.setLayout(layout);
        update();
    }

    void change_color(int a, int b) {
        Color color = matrix[a][b];
        if (color == red) {
            color = yellow;
        } else if (color == yellow) {
            color = blue;
        } else if (color == blue) {
            color = red;
        }
        matrix[a][b] = color;
        update();
    }

    void colors() {
        B00.addActionListener(e -> { change_color(0,0); });
        B01.addActionListener(e -> { change_color(0,1); });
        B02.addActionListener(e -> { change_color(0,2); });
        B10.addActionListener(e -> { change_color(1,0); });
        B11.addActionListener(e -> { change_color(1,1); });
        B12.addActionListener(e -> { change_color(1,2); });
        B20.addActionListener(e -> { change_color(2,0); });
        B21.addActionListener(e -> { change_color(2,1); });
        B22.addActionListener(e -> { change_color(2,2); });
    }

    void act_B4U() {
        temp = matrix[0][0];
        matrix[0][0] = matrix[1][0];
        matrix[1][0] = matrix[2][0];
        matrix[2][0] = temp;
        update();
        stepCounter++;
        messageCounter.setText("Решаем руками...");
        log = log + "4U, ";
        textArea.append(log);
    }

    void act_B5U() {
        temp = matrix[0][1];
        matrix[0][1] = matrix[1][1];
        matrix[1][1] = matrix[2][1];
        matrix[2][1] = temp;
        update();
        stepCounter++;
        messageCounter.setText("Решаем руками...");
        log = log + "5U, ";
        textArea.append(log);
    }

    void act_B6U() {
        temp = matrix[0][2];
        matrix[0][2] = matrix[1][2];
        matrix[1][2] = matrix[2][2];
        matrix[2][2] = temp;
        update();
        stepCounter++;
        messageCounter.setText("Решаем руками...");
        log = log + "6U, ";
        textArea.append(log);
    }

    void act_B4D() {
        temp = matrix[2][0];
        matrix[2][0] = matrix[1][0];
        matrix[1][0] = matrix[0][0];
        matrix[0][0] = temp;
        update();
        stepCounter++;
        messageCounter.setText("Решаем руками...");
        log = log + "4D, ";
        textArea.append(log);
    }

    void act_B5D() {
        temp = matrix[2][1];
        matrix[2][1] = matrix[1][1];
        matrix[1][1] = matrix[0][1];
        matrix[0][1] = temp;
        update();
        stepCounter++;
        messageCounter.setText("Решаем руками...");
        log = log + "5D, ";
        textArea.append(log);
    }

    void act_B6D() {
        temp = matrix[2][2];
        matrix[2][2] = matrix[1][2];
        matrix[1][2] = matrix[0][2];
        matrix[0][2] = temp;
        update();
        stepCounter++;
        messageCounter.setText("Решаем руками...");
        log = log + "6D, ";
        textArea.append(log);
    }

    void act_B1L() {
        temp = matrix[0][0];
        matrix[0][0] = matrix[0][1];
        matrix[0][1] = matrix[0][2];
        matrix[0][2] = temp;
        update();
        stepCounter++;
        messageCounter.setText("Решаем руками...");
        log = log + "1L, ";
        textArea.append(log);
    }

    void act_B1R() {
        temp = matrix[0][2];
        matrix[0][2] = matrix[0][1];
        matrix[0][1] = matrix[0][0];
        matrix[0][0] = temp;
        update();
        stepCounter++;
        messageCounter.setText("Решаем руками...");
        log = log + "1R, ";
        textArea.append(log);
    }

    void act_B2L() {
        temp = matrix[1][0];
        matrix[1][0] = matrix[1][1];
        matrix[1][1] = matrix[1][2];
        matrix[1][2] = temp;
        update();
        stepCounter++;
        messageCounter.setText("Решаем руками...");
        log = log + "2L, ";
        textArea.append(log);
    }

    void act_B2R() {
        temp = matrix[1][2];
        matrix[1][2] = matrix[1][1];
        matrix[1][1] = matrix[1][0];
        matrix[1][0] = temp;
        update();
        stepCounter++;
        messageCounter.setText("Решаем руками...");
        log = log + "2R, ";
        textArea.append(log);
    }

    void act_B3L() {
        temp = matrix[2][0];
        matrix[2][0] = matrix[2][1];
        matrix[2][1] = matrix[2][2];
        matrix[2][2] = temp;
        update();
        stepCounter++;
        messageCounter.setText("Решаем руками...");
        log = log + "3L, ";
        textArea.append(log);
    }

    void act_B3R() {
        temp = matrix[2][2];
        matrix[2][2] = matrix[2][1];
        matrix[2][1] = matrix[2][0];
        matrix[2][0] = temp;
        update();
        stepCounter++;
        messageCounter.setText("Решаем руками...");
        log = log + "3R, ";
        textArea.append(log);
    }

    int stepCounter = 0;

    void auto_roll() {
        messageCounter.setText(null);
        auto_rolling = true;
        stepCounter = 0;
        log = "";

        while (auto_rolling == true) {

            Random random = new Random();
            int random_number = random.nextInt(11);
            System.out.print(random_number + " ");
            if (stepCounter % 17 == 0) { System.out.println(); }
            // try { Thread.sleep(1); } catch (Exception e) { System.out.println("err");}
            switch (random_number) {
                case 0:
                    act_B4U();
                    break;
                case 1:
                    act_B5U();
                    break;
                case 2:
                    act_B6U();
                    break;
                case 3:
                    act_B4D();
                    break;
                case 4:
                    act_B5D();
                    break;
                case 5:
                    act_B6D();
                    break;
                case 6:
                    act_B1L();
                    break;
                case 7:
                    act_B1R();
                    break;
                case 8:
                    act_B2L();
                    break;
                case 9:
                    act_B2R();
                    break;
                case 10:
                    act_B3L();
                    break;
                case 11:
                    act_B3R();
                    break;
                default:
                    System.out.print("error?");
            }

            if (matrix[0][0] == matrix[0][1] && matrix[0][1] == matrix[0][2] &&
                matrix[1][0] == matrix[1][1] && matrix[1][1] == matrix[1][2] &&
                matrix[2][0] == matrix[2][1] && matrix[2][1] == matrix[2][2] ||
                matrix[0][0] == matrix[1][0] && matrix[1][0] == matrix[2][0] &&
                matrix[0][1] == matrix[1][1] && matrix[1][1] == matrix[2][1] &&
                matrix[0][2] == matrix[1][2] && matrix[1][2] == matrix[2][2] ) {

                //if (stepCounter <= 10) { auto_rolling = false; } else { resetPreviousRandom(); }
                auto_rolling = false;
                messageCounter.setText("Порешано!");
                String st;

                if (stepCounter % 10 == 1) { st = "шаг"; } else
                if (stepCounter % 10 == 2 ||
                    stepCounter % 10 == 3 ||
                    stepCounter % 10 == 4 ) { st = "шага"; } else { st = "шагов"; }
                textArea.setText("Ну худо-бедно порешалось... \nЗа " + stepCounter  + " " + st + ":\n\n" + log);
            }
        }
    }


    void resetPreviousRandom() {

        //RESET_PREVIOUS_RANDOM.setBackground(savedRandomMatrix[0][0]);

        matrix[0][0] = savedRandomMatrix[0][0];
        matrix[0][1] = savedRandomMatrix[0][1];
        matrix[0][2] = savedRandomMatrix[0][2];

        matrix[1][0] = savedRandomMatrix[1][0];
        matrix[1][1] = savedRandomMatrix[1][1];
        matrix[1][2] = savedRandomMatrix[1][2];

        matrix[2][0] = savedRandomMatrix[2][0];
        matrix[2][1] = savedRandomMatrix[2][1];
        matrix[2][2] = savedRandomMatrix[2][2];

        update();

        messageCounter.setText("Восстановлено!");
        textArea.setText("");

    }


    void actions() {
        B4U.addActionListener(e -> act_B4U());
        B5U.addActionListener(e -> act_B5U());
        B6U.addActionListener(e -> act_B6U());
        B4D.addActionListener(e -> act_B4D());
        B5D.addActionListener(e -> act_B5D());
        B6D.addActionListener(e -> act_B6D());
        B1L.addActionListener(e -> act_B1L());
        B1R.addActionListener(e -> act_B1R());
        B2L.addActionListener(e -> act_B2L());
        B2R.addActionListener(e -> act_B2R());
        B3L.addActionListener(e -> act_B3L());
        B3R.addActionListener(e -> act_B3R());
        AUTO_START.addActionListener(e -> auto_roll());
        SET_RANDOM.addActionListener(e -> { generateMatrix(); log = ""; });
        RESET_PREVIOUS_RANDOM.addActionListener(e -> resetPreviousRandom());

    }

    void randNumExp() {
        while (auto_rolling == true) {
            stepCounter++;
            Random random = new Random();
            int random_number = random.nextInt(11);
            System.out.println(random_number + " ");
            try { Thread.sleep(20); } catch (Exception e) { /* error */ }
            switch (random_number) {
                case 0:
                    act_B4U();
                    break;
            }
        }
    }
}

public class ChroniconCrystals {
    public static void main(String[] args) throws InterruptedException {
        application application = new application();
        application.window();
        application.generateMatrix();
        application.actions();
        //application.colors();
        //application.auto_roll();
    }
}
