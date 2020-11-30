package Fundamentals;


import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) {
//        helloUser();
//        reversInput();
//        numbersRandom();

//        sumOfIntNUmbers();

        month();



    }

    public static void helloUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, please type your name");
        System.out.println("Hello " +  in.next());
    }
    public static void reversInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please type string for reverse: ");
            StringBuffer reverseString = new StringBuffer(in.nextLine());
            System.out.println("Reversed string " + reverseString.reverse().toString());
            in.close();
    }
    public static void numbersRandom(){
        int start_number = 1;
        int finish_number = 99;
        for (int i = 0; i < 35; i++) {
            int random_number1 = start_number + (int) (Math.random() * finish_number);
            System.out.print(" " + random_number1);
        }
    }
    public static void sumOfIntNUmbers(){
        Scanner in = new Scanner(System.in);
            int number_1 = in.nextInt();
            int number_2 = in.nextInt();
            System.out.println("Mutli= " + (number_1 * number_2));
            System.out.println("Sum= " + (number_1 + number_2));
    }
    public static void month(){
        Map<Integer, String> month = new HashMap<Integer, String>();
        month.put(1,"January");
        month.put(2,"February");
        month.put(3,"March");
        month.put(4,"April");
        month.put(5,"May");
        month.put(6,"June");
        month.put(7,"July");
        month.put(8,"August");
        month.put(9,"August");
        month.put(10,"October");
        month.put(11,"November");
        month.put(12,"December");
        System.out.println("Type number of the : ");
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            System.out.println(n<=12?"Your month " +month.get(n):"Month with "+n+" is absent");
        } catch (InputMismatchException e) {
            System.out.println("Input is not a number");
        }








    }
}

