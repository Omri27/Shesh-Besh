package sheshbesh;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Player {
    
    private String playerName;
    private CheckerSet checkerSet;
    private int score;
    
    public Player(){
        score = 0;
        checkerSet = null;
        playerName = "sheshbesh.Player";
    }
    
    public Player(String playerName, CheckerSet set){
        this.playerName = playerName;
        this.checkerSet = set;
        score = 0;
    }
    
    public void setCheckerColor(Colors color){       
        checkerSet.setColorID(color);    
    }

    public int getScore(){
        return score;
    }
    public String getName(){
        return playerName;
    }

}
