//package ui;
//
//import javax.swing.*;
//import javax.swing.border.EmptyBorder;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//
//public class Guiv2 extends JFrame implements ActionListener {
//    private JLabel enterName;
//    private JTextField name;
//    private JButton click;
//    private String storeName = "";
//
//    public void initialize(){
//        setLayout(null);
//        setSize(300,250);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        enterName = new JLabel ("Enter Your Name:");
//        click = new JButton("Click");
//        name = new JTextField();
//        enterName.setBounds(60,30,120,30);
//        name.setBounds(80,60,130,30);
//        click.setBounds(100,190,60,30);
//        click.addActionListener(this);
//        add(click);
//        add(name);
//        add(enterName);
//}
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == click){
//            storeName = name.getText();
//    }
//}
//}
