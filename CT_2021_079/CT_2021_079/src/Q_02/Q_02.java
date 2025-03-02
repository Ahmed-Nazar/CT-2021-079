package Q_02;

import javax.swing.*;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your First Name:");
        String firstname = scanner.next();
        System.out.println("Enter Your Last Name:");
        String lastname = scanner.next();

        JFrame window = new JFrame();
        window.setTitle(firstname+" "+lastname);
        window.setSize(800,600);
        window.setVisible(true);
    }

}
