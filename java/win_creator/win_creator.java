import javax.swing.*;
import java.awt.*;

class application {
    JFrame frame = new JFrame();
    JButton button = new JButton();

    Container container = frame.getContentPane(); //SpringLayout #1
    SpringLayout layout = new SpringLayout(); //SpringLayout #2

    application() {
        System.out.println("win creator 1.0");
    }

    void window() {
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(0,0,600,300);
        frame.setLocationRelativeTo(null);

        container.setLayout(layout); //SpringLayout #3

        container.add(button); //SpringLayout add button #1
        layout.putConstraint(SpringLayout.WEST, button, 165, SpringLayout.WEST, container); //SpringLayout add button #2
        layout.putConstraint(SpringLayout.NORTH, button, 25, SpringLayout.NORTH, container); //SpringLayout add button #3

        button.setText("choose color");
        button.setPreferredSize(new Dimension(250,200));
        button.setFocusPainted(false);
    }

    void popup_choose() {
        JFrame popup_frame = new JFrame();
        Container popup_container = popup_frame.getContentPane();
        SpringLayout popup_layout = new SpringLayout();
        popup_container.setLayout(popup_layout);

        popup_frame.setVisible(true);
        popup_frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        popup_frame.setResizable(false);
        popup_frame.setBounds(0,0,166,89);
        popup_frame.setLocationRelativeTo(null);

        JButton popup_button_red = new JButton();
        popup_button_red.setPreferredSize(new Dimension(50,50));
        popup_button_red.setBackground(Color.RED);

        JButton popup_button_yellow = new JButton();
        popup_button_yellow.setPreferredSize(new Dimension(50,50));
        popup_button_yellow.setBackground(Color.YELLOW);

        JButton popup_button_green = new JButton();
        popup_button_green.setPreferredSize(new Dimension(50,50));
        popup_button_green.setBackground(Color.GREEN);

        popup_container.add(popup_button_red);
        popup_layout.putConstraint(SpringLayout.WEST, popup_button_red, 0, SpringLayout.WEST, popup_container);

        popup_container.add(popup_button_yellow);
        popup_layout.putConstraint(SpringLayout.WEST, popup_button_yellow, 50, SpringLayout.WEST, popup_container);

        popup_container.add(popup_button_green);
        popup_layout.putConstraint(SpringLayout.WEST, popup_button_green, 100, SpringLayout.WEST, popup_container);

        popup_button_red.addActionListener(e -> {
            button.setBackground(Color.RED);
            popup_frame.dispose();
        });

        popup_button_yellow.addActionListener(e -> {
            button.setBackground(Color.YELLOW);
            popup_frame.dispose();
        });

        popup_button_green.addActionListener(e -> {
            button.setBackground(Color.GREEN);
            popup_frame.dispose();
        });

    }

    void actions() {
        button.addActionListener(e -> {
            popup_choose();
        });
    }

}

public class win_creator {
    public static void main(String[] args) {
        application application = new application();
        application.window();
        application.actions();
    }
}
