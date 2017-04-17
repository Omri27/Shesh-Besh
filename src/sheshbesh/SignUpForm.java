package sheshbesh;

import javax.swing.*;
import java.awt.*;


public class SignUpForm extends JFrame {

    public SignUpForm() {
        initComponents();
    }
    private void initComponents() {
        mainPanel = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        passWordLabel = new javax.swing.JLabel();
        userNameText = new JTextField();
        passwordText =  new JPasswordField();
        titleLabel = new JLabel();
        submitBtn = new JButton();
        submitBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.setFocusPainted(false);
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        userNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        userNameLabel.setText("User Name:");

        passWordLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        passWordLabel.setText("Password:");



        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("sheshbesh.Backgammon Game");
        setLocation(new java.awt.Point(350, 200));
        mainPanel.setPreferredSize(new Dimension(600,400));
        setResizable(false);

        mainPanel.setLayout(null);

        titleLabel=new javax.swing.JLabel("Sign Up Form");
        titleLabel.setFont(new Font("Dialog", Font.ITALIC, 24));
        titleLabel.setBounds(250,20,400,40);
        mainPanel.add(titleLabel);

        userNameLabel.setBounds(100,80,150,40);
        mainPanel.add(userNameLabel);

        passwordText.setBounds(300,140,180,30);
        mainPanel.add(passwordText);

        userNameText.setBounds(300,80,180,30);
        mainPanel.add(userNameText);

        passWordLabel.setBounds(100,140,150,40);
        mainPanel.add(passWordLabel);

        submitBtn.setBounds(250,200,150,30);
        mainPanel.add(submitBtn);


        this.add(mainPanel);
        pack();
    }

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollBtnActionPerformed

        String username = userNameText.getText();
        String password = passwordText.getText();


        if (username.isEmpty() || password.isEmpty())
            JOptionPane.showMessageDialog(this, "Please provide a username and a password");
        else {
            int answer = SQLiteJDBC.signUp(username, password);
            switch (answer) {
                case 2:
                    JOptionPane.showMessageDialog(this, "User Name already exists!");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(this, "Signed Up successfully");

                    break;
            }


        }//GEN-LAST:event_rollBtnActionPerformed

    }
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel passWordLabel;
    private javax.swing.JLabel titleLabel;
    private JButton submitBtn;
    private JTextField userNameText;
    private JPasswordField passwordText;
    private JPanel mainPanel;
}
