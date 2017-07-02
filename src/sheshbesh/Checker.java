package sheshbesh;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Checker extends GameObject{
    
    private BufferedImage image;
    private BoardPanel panel;
    private Colors colorID;
    private Color color;
    private boolean hitFlag;
    private boolean bearOffFlag;
    public final int diameter = 50;  
    
    public Checker(){
        super();
        
        try {
           image = ImageIO.read(getClass().getResource("/images/checkerBlack.png"));
        } catch (IOException e) {
           System.out.println("file error");
        }
    }
    
    public Checker(Colors color, BoardPanel panel){
        
        this.color = Color.GREEN;
        this.panel = panel; 
        colorID = color;
        String pngPath;
        if(colorID == Colors.WHITE)
            pngPath = "/images/checkerWhite.png";
        else
            pngPath = "/images/checkerblack.png";
        try {
          image = ImageIO.read(getClass().getResource(pngPath));
            
        } catch (IOException e) {
           System.out.println("file error");
        }
        //this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkerBlack.jpg")));
    
    }
    
    public void mouseActions(){
        addMouseListener(new MouseAdapter(){
            public void mouseDragged(MouseEvent e){
                setColor(Color.RED);
                setPosition(e.getX(),e.getY());
            }
        });
    }
    
    public void setPosition(int x, int y){
        positionX = x;
        positionY = y;
        repaint();
        panel.repaint();
        revalidate();
        
    }
    
    public Colors getColorID(){
        return colorID;
    }
    
    public void setColorID(Colors colorID){
        this.colorID = colorID;
    }
    
    public void setColor(Color a){
        color=a;
    }

    public void paintComponent(Graphics g){     
        g.drawImage(image, positionX, positionY, null);
    }
}
