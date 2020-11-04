import javax.swing.*;
import java.awt.*;

public class roulette_wheel {
    JFrame _frame = new JFrame();
    JPanel _panel = new JPanel();
    JLabel _label = new JLabel();
    JLabel _number = new JLabel();
    JTextArea _text = new JTextArea();
    JButton _button = new JButton();
    JButton _reset = new JButton();

    void window () {
        _label.setText("Введите число (0-36):");
        _number.setText("?");
        _number.setFont(_number.getFont().deriveFont(180.0f));

        _text.setRows(1);
        _text.setColumns(20);

        _button.setText("Поехали!");
        _button.setPreferredSize(new Dimension(222,25));

        _reset.setText("Повторить?");
        _reset.setPreferredSize(new Dimension(222,25));
        _reset.setVisible(false);

        //_panel.setLayout();
        _panel.add(_label);
        _panel.add(_text);
        _panel.add(_button);
        _panel.add(_number);
        _panel.add(_reset);

        _frame.setBounds(0,0,320,400);
        _frame.setResizable(false);
        _frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        _frame.setLocationRelativeTo(null);
        _frame.setTitle("Рулетка там все дела...");
        _frame.add(_panel);
        _frame.setVisible(true);
    }

    private void actions () {
        _button.addActionListener(_act -> {
            String _var = _text.getText();
            try {
                int _int = Integer.parseInt(_var);
                if ((_int < 0) || (_int >36)) {
                    JOptionPane.showMessageDialog(null,"Число должно быть от 0 до 36!");
                } else {
                    _label.setVisible(false);
                    _text.setVisible(false);
                    _button.setVisible(false);
                    _reset.setVisible(true);
                    _number.setText(_var);
                    _text.setText(null);

                    if (_int == 0) {
                        _number.setForeground(Color.green);
                    } else {
                        if ((_int >= 1) && (_int <= 10) || (_int >= 19) && (_int <= 28)) {
                            switch (_int % 2) {
                                case 0:
                                    _number.setForeground(Color.black);
                                    break;
                                case 1:
                                    _number.setForeground(Color.red);
                                    break;
                            }
                            //_panel.setBackground(Color.green);
                        } else if ((_int >= 11) && (_int <= 18) || (_int >= 29) && (_int <= 36)) {
                            switch (_int % 2) {
                                case 0:
                                    _number.setForeground(Color.red);
                                    break;
                                case 1:
                                    _number.setForeground(Color.black);
                                    break;
                            }
                        }
                    }

                    //_panel.setBackground(Color.red);
                }
            } catch (Exception _err) {
                JOptionPane.showMessageDialog(null,"Вы ввели строку, а не число!");
            }
        });

        _reset.addActionListener(_act -> {
            _panel.setBackground(null);
            _button.setVisible(true);
            _reset.setVisible(false);
            _number.setText("?");
            _label.setVisible(true);
            _text.setVisible(true);
            _number.setForeground(null);
        });
    }

    public static void main (String[]args) {
        roulette_wheel app = new roulette_wheel();
        app.window();
        app.actions();
    }
}
