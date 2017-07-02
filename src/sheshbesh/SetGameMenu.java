package sheshbesh;

import java.awt.*;
import javax.swing.*;

public class SetGameMenu extends javax.swing.JPanel {

    private JPanel mainPanel;
    private JFrame mainFrame;

    GamePanel gamePanel;


    public SetGameMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstUserNameLabel = new javax.swing.JLabel();
        firstUserNameText = new javax.swing.JTextField();

        secondUserNameLabel = new javax.swing.JLabel();
        secondUserNameText = new javax.swing.JTextField();

        playButton = new javax.swing.JButton();

        firstPasswordLabel = new JLabel();
        firstPasswordText = new JPasswordField();

        secondPasswordLabel = new JLabel();
        secondPasswordText = new JPasswordField();

        back = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(248, 255, 184));

        firstUserNameLabel.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        firstUserNameLabel.setText("Player1 UserName:");
        firstPasswordLabel.setText("Player1 Password:");
        firstPasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 25));

        firstUserNameText.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        firstUserNameText.setForeground(new java.awt.Color(103, 125, 250));
        firstUserNameText.setToolTipText("");


        secondUserNameLabel.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        secondUserNameLabel.setText("Player2 UserName:");
        secondPasswordLabel.setText("Player2 Password:");
        secondPasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 25));

        secondUserNameText.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        secondUserNameText.setForeground(new java.awt.Color(103, 125, 250));
        secondUserNameText.setToolTipText("");


        playButton.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        playButton.setText("PLAY!");
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playButton.setFocusPainted(false);
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });


        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setText("Back");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setFocusPainted(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });



        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));


        this.setLayout(null);

        back.setBounds(5,5,100,30);
        this.add(back);

        titleLabel=new javax.swing.JLabel("Create a Game");
        titleLabel.setFont(new Font("Dialog", Font.ITALIC, 24));
        titleLabel.setBounds(500,20,400,40);
        this.add(titleLabel);

        firstUserNameLabel.setBounds(50,80,250,40);
        this.add(firstUserNameLabel);

        firstUserNameText.setBounds(300,80,150,40);
        this.add(firstUserNameText);

        firstPasswordLabel.setBounds(50,150,250,40);
        this.add(firstPasswordLabel);

        firstPasswordText.setBounds(300,150,150,40);
        this.add(firstPasswordText);

        int x = 500;

        secondUserNameLabel.setBounds(50 + x,80,250,40);
        this.add(secondUserNameLabel);

        secondUserNameText.setBounds(300 + x ,80,150,40);
        this.add(secondUserNameText);

        secondPasswordLabel.setBounds(50 + x,150,250,40);
        this.add(secondPasswordLabel);

        secondPasswordText.setBounds(300 + x,150,150,40);
        this.add(secondPasswordText);

        playButton.setBounds(500,300,120,30);
        this.add(playButton);


    }// </editor-fold>//GEN-END:initComponents


    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

        mainFrame.setContentPane(mainPanel);
        mainFrame.invalidate();
        mainFrame.validate();
    }//GEN-LAST:event_backActionPerformed






    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed


        String firstUserName = firstUserNameText.getText();
        String secondUserName = secondUserNameText.getText();
        String firstPassword = firstPasswordText.getText();
        String secondPassword = secondPasswordText.getText();





        if(firstUserName.isEmpty() || secondUserName.isEmpty() || firstPassword.isEmpty() || secondPassword.isEmpty()){
            JOptionPane.showMessageDialog(this.mainFrame,"Please fill username and password for each user!");

        }
        else{

            if(SQLiteJDBC.login(firstUserName,firstPassword) && SQLiteJDBC.login(secondUserName,secondPassword))
            {
                gamePanel = new GamePanel(this,firstUserName,secondUserName);

                // gamePanel.setPlayerNames(firstUserName, secondUserName);

                //gamePanel.updateCurrentRound(round);

                gamePanel.setMainMenu(mainPanel);
                gamePanel.setMainFrame(mainFrame);

                mainFrame.setContentPane(gamePanel);
                mainFrame.setSize(new Dimension(1280,1000));
                mainFrame.invalidate();
                mainFrame.validate();
            }
            else{
                JOptionPane.showMessageDialog(this.mainFrame,"Invalid username/password!");
            }

        }


    }//GEN-LAST:event_playButtonActionPerformed

    public void setMainMenu(JPanel mainPanel){
        this.mainPanel =  mainPanel;
    }

    public void setMainFrame(JFrame mainFrame){
        this.mainFrame = mainFrame;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel firstUserNameLabel;
    private javax.swing.JLabel secondUserNameLabel;
    private javax.swing.JTextField secondUserNameText;
    private javax.swing.JTextField firstUserNameText;
    private javax.swing.JLabel firstPasswordLabel;
    private javax.swing.JLabel secondPasswordLabel;
    private JPasswordField firstPasswordText;
    private JPasswordField secondPasswordText;
    private JLabel titleLabel;


    // End of variables declaration//GEN-END:variables
}
