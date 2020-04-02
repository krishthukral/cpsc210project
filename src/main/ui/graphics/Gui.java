//package ui;
//
//import model.TodoList;
//
//import javax.swing.*;
//import javax.swing.border.EmptyBorder;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Gui extends JFrame implements ActionListener {
//    private JLabel label = new JLabel("");
//    private JTextField field = new JTextField("");
//    private int height = 30;
//    private int width = 500;
//    private int ycoordinate = 150;
//    private String displayText = "";
//    private JTextField textDisplayed = new JTextField(0);
//    TodoList todoList = new TodoList();
//    //private JFrame  = new JFrame("");
//
//    public void initialize() {
////        setDefaultCloseOperation(EXIT_ON_CLOSE);
////       setPreferredSize(new Dimension(500, 500));
////        ((JPanel) getContentPane()).setBorder(new EmptyBorder(50, 13, 13, 13) );
////        setLayout(new FlowLayout());
////        JButton btn = new JButton("Add Task");
////        btn.setActionCommand("myButton");
////        btn.addActionListener(this); // Sets "this" object as an action listener for btn
////        // so that when the btn is clicked,
////        // this.actionPerformed(ActionEvent e) will be called.
////        // You could also set a different object, if you wanted
////        // a different object to respond to the button click
////        label = new JLabel("What is your first and last name?");
//        //      field = new JTextField(20);
//        //    add(field);
////        add(btn);
////        add(label);
////        pack();
////        setLocationRelativeTo(null);
////        setVisible(true);
////        setResizable(false);
//
//        //    this = new JFrame("Position");
////        this.setVisible(true);
//        this.setPreferredSize(new Dimension(500, 1000));
//        this.setResizable(true);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//
//        JPanel panel = new JPanel();
//        //.setLayout(null);
//
//
//        textDisplayed = new JTextField("Input a task");
//
//        //String text = jt.getText();
//
//        //     textDisplayed.setVisible(false);
//        panel.add(textDisplayed);
//
//
//        JButton add = new JButton("Add Task");
//        add.setBounds(0, ycoordinate, width, height);
//        add.setActionCommand("addTask");
//        add.addActionListener(this);
////        add(field);
////        add(btn);
////        add(label);
////        //=.get(0);
//////
//        panel.add(add);
//        panel.add(label);
//
//        JButton remove = new JButton("Remove Task");
//        remove.setBounds(0, ycoordinate + (30 * 1), width, height);
//        panel.add(remove);
//
//        JButton view = new JButton("View Tasks");
//        view.setBounds(0, ycoordinate + (30 * 2), width, height);
//
//        panel.add(view);
//
//        JButton number = new JButton("Number of tasks");
//        number.setBounds(0, ycoordinate + (30 * 3), width, height);
//        panel.add(number);
//
//        JButton save = new JButton("Save Tasks");
//        save.setBounds(0, ycoordinate + (30 * 4), width, height);
//        panel.add(save);
//
//        JProgressBar pb = new JProgressBar();
//        pb.setValue(50);
//        pb.setBounds(200, ycoordinate + (30 * 5), width, height);
//        panel.add(pb);
//
////        this.add(panel);
//        //add.addActionListener(new Action());
//        this.pack();
//        setVisible(true);
////        setLocationRelativeTo(null);
//        this.add(panel);
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
////        JFrame frame2 = new JFrame("Clicked");
////        frame2.setVisible(true);
////        frame2.setSize(200, 200);
////        JLabel label = new JLabel("You clicked me!");
////        JPanel panel  = new JPanel();
////        frame2.add(panel);
////        panel.add(label);
//
//        System.out.println("inside the action listener for addTask");
//        if (e.getActionCommand().equals("addTask")) {
//            todoList.addTask(textDisplayed.getText());
//            System.out.println(todoList.getTask(0).getDescription());
//            textDisplayed.setVisible(true);
//            System.out.println("inside the action listener for addTas221qek");
//            label.setText(field.getText());
//            textDisplayed.setVisible(true);
//            this.repaint(0, 0, ycoordinate, width, height);
//
//        }
//    }
//}