import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JLabel loginPrompt;
    private JLabel emailLabel;
    private JLabel passwordLabel;

    JTextField emailText;
    JPasswordField passwordText;
    JButton loginButton;
    JLabel output;

    public Login() {
        panel = new JPanel();
        panel.setLayout(null);
        frame = new JFrame();
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setTitle("SMART GAS METER");

        loginPrompt = new JLabel("Log in to your account");
        loginPrompt.setBounds(150, 10, 200, 25);
        panel.add(loginPrompt);

        emailLabel = new JLabel("email address");
        emailLabel.setBounds(100, 50, 100, 25);
        panel.add(emailLabel);

        emailText = new JTextField(20);
        emailText.setBounds(200, 50, 165, 25);
        panel.add(emailText);

        passwordLabel = new JLabel("password");
        passwordLabel.setBounds(100, 100, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(200, 100, 165, 25);
        panel.add(passwordText);

        loginButton = new JButton("login");
        loginButton.setBounds(200, 180, 80, 25);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        output = new JLabel("");
        output.setBounds(200, 150, 150, 25);
        panel.add(output);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String email = emailText.getText();
        String password = passwordText.getText();

        switch (email) {
            case "logan@gas.com" :
            case "sonya@gas.com":
            case "emma@gas.com":
            case "shanice@gas.com":
                output.setText("Welcome");
                new HomePage(email.split("@")[0]);
                break;
            default:
                output.setText("No account found");

        }
    }
}
