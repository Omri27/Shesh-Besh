package sheshbesh;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

public class Dice extends GameObject{
    
    private int value;
    
    public Dice(){
        
    }
    
    public int getValue(){
        
        return value;
    }
    
    public int roll(){
        
        Random randGen = new Random();
    
        return value = randGen.nextInt(6) + 1;
    }
    
}
