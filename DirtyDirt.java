import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 1/20/2016.
 */
public class DirtyDirt {

    private Image image;

    public DirtyDirt(){

        initDirtyDirt();
    }

    public void initDirtyDirt(){

        ImageIcon ii = new ImageIcon("dirt.jpeg");
        image = ii.getImage();
    }

    public Image getImage(){
        return image;
    }
}
