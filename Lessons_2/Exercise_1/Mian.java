package Exercise_1;

import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        System.out.println("Type a number between 50 and 300");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a>=50&&a<=300) {
            System.out.println("yes!");
        }else {
            System.out.println("no!");
        }
    }
}
