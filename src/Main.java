import javax.swing.*;
import java.net.URL;

public class Main {

    static URL imageUrl = ClassLoader.getSystemResource("troll.png");
    static ImageIcon image = new ImageIcon(imageUrl);

    public static void main(String args[]) {
//        for (int i = 0; i < 5; i++) {
        while (true) {
            threadage thread1 = new threadage();
            thread1.start();
        }
       /* for (int i = 0; i < 10; i++) {
            //while(true) {

        }*/
    }
}

class threadage extends Thread {

    @Override
    public void run() {
//        for (int i = 0; i < 20; i++) {
        while (true) {
            JDialog frame = new JDialog();
            frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            frame.add(new JLabel(Main.image));
            frame.pack();
            frame.setVisible(true);
            frame.setLocation((int) Math.floor(Math.random() * 1920), (int) Math.floor(Math.random() * 1080));
            frame.setSize((int) Math.floor(Math.random() * 300 + 100), (int) Math.floor(Math.random() * 200 + 100));
            frame.setAlwaysOnTop(true);
        }
    }
}
