import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 1/20/2016.
 */
public class DirtBox extends JPanel {

    private DirtyDirt dirtyDirt;

    public DirtBox(){

        initDirtBox();
    }

    public void initDirtBox(){

        setDoubleBuffered(true);
        setFocusable(true);

        dirtyDirt = new DirtyDirt();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g){

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(dirtyDirt.getImage(), 0, 0, this);
    }
}
