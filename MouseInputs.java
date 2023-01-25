import java.awt.event.*;

public class MouseInputs implements MouseListener, MouseMotionListener {

    private Panel panel;
    public MouseInputs(Panel panel){
        this.panel = panel;
    }

    public void mouseDragged(MouseEvent e) {
        
    }

    public void mouseMoved(MouseEvent e) {
        
    }

    public void mouseClicked(MouseEvent e) {
        int current = 0;
        int x = 0;
        int y = 0;

        while(panel.rects[current][0] >= 0 && panel.rects[current][1] >= 0){
            current++;
        } 
        x = (e.getX() / panel.gridSize) * panel.gridSize;
        y = (e.getY() / panel.gridSize) * panel.gridSize;

        panel.rects[current][0] = x;
        panel.rects[current][1] = y;

        System.out.println(panel.rects[current][0] + ", " + panel.rects[current][1]);
    }

    public void mousePressed(MouseEvent e) {
        
    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {
        
    }

    public void mouseExited(MouseEvent e) {
        
    }
    
}
