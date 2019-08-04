import javax.swing.*;
import java.net.URL;

public class Main {

    public static void main(String args[]) {
        //for (int i = 0; i < 10; i++) {
            while(true) {
            JDialog frame = new JDialog();
            frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            URL imageUrl = ClassLoader.getSystemResource("troll.png");
            ImageIcon image = new ImageIcon(imageUrl);
            JLabel label = new JLabel(image);
            frame.add(label);
            frame.pack();
            frame.setVisible(true);
            frame.setLocation((int) Math.floor(Math.random() * 1920), (int) Math.floor(Math.random() * 1080));
            frame.setSize((int) Math.floor(Math.random() * 300 + 100), (int) Math.floor(Math.random() * 200 + 100));
            frame.setAlwaysOnTop(true);
        }
    }
}
