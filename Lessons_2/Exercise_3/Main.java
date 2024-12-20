package Exercise_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number between 50 and 300 : ");
        int a = scanner.nextInt();
        while (true){
            if (a>=50&&a<=300){
                System.out.println("The number you typed in was : " + a);
                break;
            }else {
                System.out.println("Oops, that number wasn't between 50 and 300, try again:");
                a = scanner.nextInt();
            }

        }
    }
}
