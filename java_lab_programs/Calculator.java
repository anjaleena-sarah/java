import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    private JButton add, sub, mul, div, equal, clear;
    private JPanel panel;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;
 
    public Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(300, 50));
        textField.setEditable(false);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*"); // Corrected multiplication button
        div = new JButton("/");
        equal = new JButton("=");

        b1.addActionListener(this);
        panel.add(b1);
        b2.addActionListener(this);
        panel.add(b2);
        b3.addActionListener(this);
        panel.add(b3);
        add.addActionListener(this);
        panel.add(add);
        b4.addActionListener(this);
        panel.add(b4);
        b5.addActionListener(this);
        panel.add(b5);
        b6.addActionListener(this);
        panel.add(b6);
        sub.addActionListener(this);
        panel.add(sub);
        b7.addActionListener(this);
        panel.add(b7);
        b8.addActionListener(this);
        panel.add(b8);
        b9.addActionListener(this);
        panel.add(b9);
        mul.addActionListener(this);
        panel.add(mul);
        b0.addActionListener(this);
        panel.add(b0);
        div.addActionListener(this);
        panel.add(div);
        equal.addActionListener(this);
        panel.add(equal);

        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
            textField.setText(textField.getText() + command);
        } else if (command.charAt(0) == '=') {
            num2 = Double.parseDouble(textField.getText());
            try {
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            throw new ArithmeticException("Cannot divide by zero");
                        }
                        result = num1 / num2;
                        break;
                }
                textField.setText(String.valueOf(result));
            } catch (ArithmeticException ex) {
                textField.setText("Error: " + ex.getMessage());
            }
        } else {
            num1 = Double.parseDouble(textField.getText());
            operator = command.charAt(0);
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
