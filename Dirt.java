import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 1/20/2016.
 */
public class Dirt extends JFrame {

    DirtBox dirtBox;

    public Dirt(){

        initDirt();
    }

    public void initDirt(){

        dirtBox = new DirtBox();
        add(dirtBox);

        setSize(585, 585);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Dirt");
    }

    public static void main(String[] args){

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Dirt ex = new Dirt();
                ex.setVisible(true);
            }
        });
    }
}
