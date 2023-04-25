package characterstream3;

import java.util.Scanner;

public class LAB6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String s = input.nextLine();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.print("Enter Height: ");
        double height = input.nextDouble();
        System.out.println(s);
        System.out.println(age);
        System.out.println(height);
    }
}
