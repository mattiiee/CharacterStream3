package characterstream3;

import java.io.*;
import java.util.Scanner;

public class LAB5 {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        try {
            System.out.print("Enter Text: ");
            String s = input.readLine();
            System.out.println(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
