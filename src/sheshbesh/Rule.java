package sheshbesh;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public abstract class Rule {
    
    protected boolean ruleFlag;
    protected Slot targetSlot;
    protected Slot sourceSlot;
    
    public Rule(){
        ruleFlag = false;
    }
    
    public Rule(Slot source, Slot target){
        targetSlot = target;
        sourceSlot = source;
        ruleFlag = false;
    }
    
   abstract void ruleCondition();
   
   public void setSource(Slot s){
       sourceSlot = s;
   }
   public void setTarget(Slot s){
       targetSlot = s;
   }
   public boolean getRuleFlag(){
       return ruleFlag;
   }

}
