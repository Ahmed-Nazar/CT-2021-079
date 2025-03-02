package Q_06;

import javax.swing.*;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Title:");
        String title = scanner.next();
        System.out.println("Enter Height:");
        int height = scanner.nextInt();
        System.out.println("Enter Width:");
        int width = scanner.nextInt();

        JFrame window = new JFrame();
        window.setVisible(true);
        window.setSize(width,height);
        window.setTitle(title+" ");
    }
}
