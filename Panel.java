import javax.swing.JPanel;
import java.awt.*;

public class Panel extends JPanel{
    
    private MouseInputs mouseInputs;
    
    int gridSize;

    int[][] rects;

    public Panel(int gridSize){
        mouseInputs = new MouseInputs(this);

        this.gridSize = gridSize;

        this.rects = new int[gridSize*gridSize][2];
        for (int i = 0; i < rects.length; i++) {
            rects[i][0] = -1;
            rects[i][1] = -1;
        }

        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.magenta);

        for(int i = 0; i < this.getWidth(); i+=gridSize){
            g.drawLine(i, 0, i, this.getHeight());
            for(int j = 0; j < this.getHeight(); j+=gridSize){
                g.drawLine(0, j, this.getWidth(), j);
            }
        }
        
        for (int[] rect : rects) {
            if(rect[0] >= 0 && rect[1] >= 0)
                g.fillRect(rect[0], rect[1], gridSize, gridSize);
        }

        this.repaint();
    }
}
