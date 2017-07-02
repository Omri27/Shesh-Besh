package sheshbesh;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class SafeRule extends Rule{

    public SafeRule(){
        super();
    } 
    public SafeRule(Slot source, Slot target){
        
        super(source, target);
        this.ruleCondition();
    }
    
    @Override
    public void ruleCondition(){
        
        if(targetSlot.getSlotColor()!= null){
            if(targetSlot.getSlotColor() == sourceSlot.getSlotColor() || targetSlot.checkerStack.size() < 2 )
                ruleFlag = true;
            else
                ruleFlag = false;      
        }else
            ruleFlag = true;
     
    }
}
