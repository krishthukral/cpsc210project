//package ui;
//
//import javafx.scene.text.Text;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Login implements ActionListener {
//    private static JLabel success;
//    private static JTextField userText;
//    private static JPasswordField passwordText;
//
//
//    public static void main(String[] args) {
//        JPanel panel = new JPanel();
//        JFrame frame = new JFrame();
//        frame.setSize(350, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//        frame.add(panel);
//        panel.setLayout(null);
//
//        JLabel label = new JLabel("User");
//        label.setBounds(10, 20, 80, 25);
//        panel.add(label);
//
//        JLabel password = new JLabel("Password");
//        password.setBounds(10, 50, 80, 25);
//        panel.add(password);
//
//
//        userText = new JTextField();
//        userText.setBounds(100, 20, 165, 25);
//        panel.add(userText);
//        userText.requestFocus();
//
//
//        passwordText = new JPasswordField();
//        passwordText.setBounds(100, 50, 165, 25);
//        panel.add(passwordText);
//        passwordText.requestFocus();
//
//        JButton button = new JButton("Login");
//        button.setBounds(10, 80, 80, 25);
//        button.addActionListener(new Login());
//        panel.add(button);
//        button.requestFocus();
//
//        success = new JLabel("");
//        success.setBounds(10, 110, 300, 25);
//        panel.add(success);
//        success.requestFocus();
//        frame.setVisible(true);
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//        String user = userText.getText();
//        String password = passwordText.getText();
//        if (user.equals("a") && password.equals("b")) {
//            success.setText("Login successful!");
//            Guiv3 g = new Guiv3();
//
//        }
//    }
//}
