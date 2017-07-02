package sheshbesh;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class HitRule extends Rule{
      
    public HitRule(){
        super();
    }
    
    public HitRule(Slot source, Slot target){
        
        super(source, target);
        this.ruleCondition();
    }
    
    @Override
    public void ruleCondition(){
        
        if(targetSlot.getSlotColor()!= null){
            if(targetSlot.getSlotColor() == sourceSlot.getSlotColor() || targetSlot.checkerStack.size()!= 1)// if safe cannot hit the checker,
                ruleFlag = false;      // else we can hit it.
            else
                ruleFlag = true;
        }else 
            ruleFlag = true;
       
    }
}
