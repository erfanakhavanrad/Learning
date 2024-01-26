package broCode.snake;

import javax.swing.*;
import java.awt.*;

//@NoArgsConstructor
public class GameFrame extends JFrame {

    public GameFrame() throws HeadlessException {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
