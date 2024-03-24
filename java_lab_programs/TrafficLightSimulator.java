import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightSimulator extends JFrame implements ActionListener {
    private JRadioButton redButton;
    private JRadioButton yellowButton;
    private JRadioButton greenButton;
    private JPanel lightPanel;

    public TrafficLightSimulator() {
        setTitle("Traffic Light Simulator");
        setSize(200, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(redButton);
        panel.add(yellowButton);
        panel.add(greenButton);

        lightPanel = new JPanel();
        lightPanel.setBackground(Color.DARK_GRAY);
        lightPanel.setPreferredSize(new Dimension(150, 300));

        add(panel, BorderLayout.WEST);
        add(lightPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        lightPanel.setBackground(Color.DARK_GRAY);

        if (e.getSource() == redButton) {
            showMessage("Red light is on.");
            lightPanel.setBackground(Color.RED);
        } else if (e.getSource() == yellowButton) {
            showMessage("Yellow light is on.");
            lightPanel.setBackground(Color.YELLOW);
        } else if (e.getSource() == greenButton) {
            showMessage("Green light is on.");
            lightPanel.setBackground(Color.GREEN);
        }
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        new TrafficLightSimulator();
    }
}