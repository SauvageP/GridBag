package gridbag;

import javax.swing.*;
import java.awt.*;

/**
 * Created by perryrgabriel on 10/10/14.
 */

public class GridBagLayoutTest {
    public static void main (String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FontFrame frame = new FontFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("GridBagLayoutTest");
                frame.setVisible(true);
            }
        });
    }
}
