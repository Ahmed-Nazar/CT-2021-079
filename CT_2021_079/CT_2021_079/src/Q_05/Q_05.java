package Q_05;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_05 {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");

        String heading = sdf.format(date);

        window.setVisible(true);
        window.setSize(500,300);
        window.setTitle(heading);
    }
}
