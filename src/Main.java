import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JLabel loginPrompt;
    private JLabel emailLabel;
    private JLabel passwordLabel;
    private JLabel confirmPasswordLabel;

    JTextField emailText;
    JPasswordField passwordText;
    JPasswordField confirmPasswordText;
    JButton loginButton;
    JLabel output;

    public Main() {
        panel = new JPanel();
        panel.setLayout(null);
        frame = new JFrame();
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setTitle("SMART GAS METER");

        loginPrompt = new JLabel("Create new account");
        loginPrompt.setBounds(200, 10, 200, 25);
        panel.add(loginPrompt);

        emailLabel = new JLabel("email address");
        emailLabel.setBounds(100, 50, 100, 25);
        panel.add(emailLabel);

        emailText = new JTextField(20);
        emailText.setBounds(220, 50, 165, 25);
        panel.add(emailText);

        passwordLabel = new JLabel("password");
        passwordLabel.setBounds(100, 100, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(220, 100, 165, 25);
        panel.add(passwordText);

        confirmPasswordLabel = new JLabel("confirm password");
        confirmPasswordLabel.setBounds(100, 150, 200, 25);
        panel.add(confirmPasswordLabel);

        confirmPasswordText = new JPasswordField(20);
        confirmPasswordText.setBounds(220, 150, 165, 25);
        panel.add(confirmPasswordText);

        loginButton = new JButton("login");
        loginButton.setBounds(200, 210, 80, 25);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        output = new JLabel("");
        output.setBounds(170, 260, 300, 25);
        panel.add(output);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    public static boolean isValidEmail(final String email) {
        String EMAIL_PATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        output.setText("");
        String email = emailText.getText();
        String password = passwordText.getText();
        String confirmPassword = confirmPasswordText.getText();
        if(!isValidEmail(email)){
            output.setText("Invalid email: use name@domain.extension");
        } else if(!password.equals(confirmPassword)){
            output.setText("Passwords do not match");
        } else {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("");
            } catch (Exception ex){
                output.setText("Error connecting to database");
            }
        }


//        new HomePage(email.split("@")[0]);

    }
}
