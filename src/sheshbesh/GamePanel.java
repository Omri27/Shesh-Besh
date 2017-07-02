package sheshbesh;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class GamePanel extends javax.swing.JPanel {

    private JPanel mainPanel;
    private JFrame mainFrame;
    private String playerID1, playerID2;
    private SetGameMenu setGameMenu1;


    public GamePanel(SetGameMenu sgm, String playerName1, String playerName2) {
        this.setGameMenu1 = sgm;
        this.playerID1 = playerName1;
        this.playerID2 = playerName2;
        initComponents();
        setPlayerLabels(playerName1,playerName2);

    }

    private void initComponents() {

        rollBtn = new javax.swing.JButton();
        playerIDLabel1 = new javax.swing.JLabel();
        playerIDLabel2 = new javax.swing.JLabel();
        dice1Label = new javax.swing.JLabel();
        dice2Label = new javax.swing.JLabel();
        die1ValueLabel = new javax.swing.JLabel();
        die2ValueLabel = new javax.swing.JLabel();
        player1ScrLabel = new javax.swing.JLabel();
        hyphenLabel = new javax.swing.JLabel();
        player2ScrLabel = new javax.swing.JLabel();

        setBackground(java.awt.SystemColor.activeCaption);
        setMaximumSize(new java.awt.Dimension(1280, 1000));
        setMinimumSize(new java.awt.Dimension(1280, 1000));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 1000));
        setRequestFocusEnabled(false);

        rollBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rollBtn.setText("Roll!");
        rollBtn.setFocusPainted(false);
        rollBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollBtnActionPerformed(evt);
            }
        });

        playerIDLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N

        playerIDLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N

        dice1Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dice1Label.setText("sheshbesh.Dice 1:");

        dice2Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dice2Label.setText("sheshbesh.Dice 2:");

        hyphenLabel.setText("-");

        setDiceText();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(playerIDLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(playerIDLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dice1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(die1ValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dice2Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(die2ValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(116, 116, 116)
                .addComponent(rollBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rollBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dice1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(die1ValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dice2Label)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(die2ValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(1, 1, 1)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(playerIDLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(playerIDLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rollBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollBtnActionPerformed

    }//GEN-LAST:event_rollBtnActionPerformed

    public void setMainMenu(JPanel mainPanel){      
       this.mainPanel =  mainPanel;
    }
    
    public void setMainFrame(JFrame mainFrame){
        this.mainFrame = mainFrame;
    }
    
    public void setPlayerLabels(String player1, String player2){

        this.playerIDLabel1.setText(player1);
        this.playerIDLabel2.setText(player2);

    }

    public JFrame getMainFrame(){
        return mainFrame;
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }
    
    public String getPlayerID1(){
        return playerID1;
    }
    
    public String getPlayerID2(){
        return playerID2;
    }
    
    public void setDiceText(){
        this.die1ValueLabel.setText("" + boardPanel1.getDice1());
        this.die2ValueLabel.setText("" + boardPanel1.getDice2());
        
        repaint();
        revalidate();
    }
    public void setRoll(boolean a){
        rollBtn.setEnabled(a);
    }
    




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private BoardPanel boardPanel1;
    private javax.swing.JLabel dice1Label;
    private javax.swing.JLabel die1ValueLabel;
    private javax.swing.JLabel dice2Label;
    private javax.swing.JLabel die2ValueLabel;
    private javax.swing.JLabel hyphenLabel;
    private javax.swing.JLabel player1ScrLabel;
    private javax.swing.JLabel player2ScrLabel;
    private javax.swing.JLabel playerIDLabel1;
    private javax.swing.JLabel playerIDLabel2;
    private javax.swing.JButton rollBtn;


    // End of variables declaration//GEN-END:variables
}
