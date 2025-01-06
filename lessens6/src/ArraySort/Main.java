package ArraySort;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        Person[] people = new Person[4];

        people[1] = new Person("Aybol Bagdar" , 100);
        people[0] = new Person("Zhansya Bagdar" , 20);
        people[2] = new Person("Curry Law" , 10);
        people[3] = new Person("Margin Top" , 900);


        System.out.println("before the sort");
        for (Person p : people) {
            System.out.println(p.name);
        }
        System.out.println("after the sort!!! ");

        Arrays.sort(people);

        for (Person p: people) {
            System.out.println(p.name);
        }



    }
}
