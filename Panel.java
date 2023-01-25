import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Random;

public class Panel extends JPanel{
    
    Random rand = new Random();

    public Panel(){
        
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        try{
            g.drawRect(rand.nextInt(1500),rand.nextInt(800),100,100);
            this.repaint();
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
