import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HomePage {
    private JFrame frame;
    private JPanel panel;
    private JLabel welcomeText;

    public HomePage(String name) {
        panel = new JPanel();
        panel.setLayout(null);
        frame = new JFrame();
        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setTitle("SMART GAS METER");

        welcomeText = new JLabel("Welcome " + name);
        welcomeText.setBounds(20, 20, 150, 25);
        frame.add(welcomeText);

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new HomePage("user");
    }
}
