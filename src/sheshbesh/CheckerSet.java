package sheshbesh;

import java.util.ArrayList;

public class CheckerSet extends GameObject{
    
    private BoardPanel panel;
    private String listID;
    private final ArrayList<Checker> checkerSet;
    private Colors colorID;
    
    public CheckerSet(){
        
        checkerSet = new ArrayList<Checker>(15);
        
        for(int i = 0; i<15; i++){
            Checker chkr = new Checker();
            
            checkerSet.add(chkr);

            chkr.setColorID(colorID);
        }
        
    }
    public CheckerSet(Colors colorID, BoardPanel panel){
        this.colorID = colorID;
        this.panel = panel;
        checkerSet = new ArrayList<Checker>(15);
        
        for(int i = 0; i<15; i++){
            Checker chkr = new Checker(colorID,panel);
            
            checkerSet.add(chkr);

            chkr.setColorID(colorID);
        }
        
    }
    
    public ArrayList<Checker> getCheckerList(){
        return checkerSet;
    }
    public void setColorID(Colors color){
        colorID = color;
    }

}
