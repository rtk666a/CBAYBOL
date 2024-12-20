package Exercise_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Check(scanner.nextInt()));
    }

    public static String Check(int a){
        if (a >= 50&& a<=300){
            return "The number you typed in was:" +a;
        }else {
            return "The number you typed in was: null";
        }

    }
}
