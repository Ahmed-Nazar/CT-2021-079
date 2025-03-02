package Q_03;

import javax.swing.*;
import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your First Name:");
        String firstname = scanner.next();
        System.out.println("Enter Your Middle Name:");
        String middlename = scanner.next();
        System.out.println("Enter Your Last Name:");
        String lastname = scanner.next();

        String initial = middlename.substring(0,1);

        JFrame window = new JFrame();
        window.setTitle(firstname + " " + initial + ". " + lastname);
        window.setSize(800, 600);
        window.setVisible(true);
    }
}
