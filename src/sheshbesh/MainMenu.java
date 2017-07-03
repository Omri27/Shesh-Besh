package sheshbesh;

import javax.swing.*;

public class MainMenu extends javax.swing.JFrame {

    private JPanel panel;

    public MainMenu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        createGame = new javax.swing.JButton();
        signUp = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        leaderBoards = new JButton();
        backgammonGame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Backgammon Game");
        setLocation(new java.awt.Point(350, 200));

        mainPanel.setBackground(new java.awt.Color(153, 205, 155));
        mainPanel.setPreferredSize(new java.awt.Dimension(1158, 598));

        signUp.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        signUp.setText("Sign Up");
        signUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUp.setFocusPainted(false);
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });

        leaderBoards.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        leaderBoards.setText("Leader Boards");
        leaderBoards.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leaderBoards.setFocusPainted(false);
        leaderBoards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaderBoardsActionPerformed(evt);
            }
        });

        createGame.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        createGame.setText("Create a Game");
        createGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createGame.setFocusPainted(false);
        createGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createGameActionPerformed(evt);
            }
        });




        exit.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        exit.setText("Exit");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setFocusPainted(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });



        backgammonGame.setFont(new java.awt.Font("Lithos Pro Regular", 0, 50)); // NOI18N
        backgammonGame.setText("Backgammon Game");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(474, 474, 474)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(createGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(signUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(leaderBoards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addContainerGap(322, Short.MAX_VALUE)
                                .addComponent(backgammonGame)
                                .addGap(303, 303, 303))
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(backgammonGame, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(createGame)
                                .addGap(18, 18, 18)
                                .addComponent(signUp)
                                .addGap(18, 18, 18)
                                .addComponent(leaderBoards)
                                .addGap(18, 18, 18)
                                .addComponent(exit)
                                .addContainerGap(138, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createGameActionPerformed

        SetGameMenu setGame = new SetGameMenu();

        setGame.setMainMenu(mainPanel);
        setGame.setMainFrame(this);

        this.setContentPane(setGame);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_createGameActionPerformed

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerforme
        SignUpForm signUpForm = new SignUpForm();

        signUpForm.setVisible(true);
    }//GEN-LAST:event_signUpActionPerforme


    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void leaderBoardsActionPerformed(java.awt.event.ActionEvent evt){
        LeaderBoards leaderBoards = new LeaderBoards();
        leaderBoards.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgammonGame;
    private javax.swing.JButton createGame;
    private javax.swing.JButton signUp;
    private javax.swing.JButton exit;
    private JButton leaderBoards;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
