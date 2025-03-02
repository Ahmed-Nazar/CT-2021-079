package Q_07;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

        String title = sdf.format(date);

        window.setVisible(true);
        window.setSize(400,500);
        window.setTitle(title);
    }
}
