package Q_04;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_04 {
    public static void main(String[] args) {

        Date date = new Date();
        JFrame window = new JFrame();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");

        String title = sdf.format(date);

        window.setSize(800,600);
        window.setTitle(title);
        window.setVisible(true);
    }
}
