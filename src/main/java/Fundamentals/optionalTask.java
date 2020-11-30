package Fundamentals;

import org.openqa.selenium.Keys;

import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.*;


public class optionalTask {
    public static void main(String[] args) {
//        shortAndLongNumber();
        shortLongNumberFromBiggerToSmallest();
    }



    public static void shortAndLongNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type numbers using space button");
        String line = input.nextLine();
        String longNumber = "", shortNumber = line;
        for (String n : line.split(" ")) {
            if (n.length() > longNumber.length()) longNumber = n;
            if (n.length() < shortNumber.length()) shortNumber = n;
        }
        System.out.println("The longest number is: '" + longNumber + "'"+ " "+ "NUmber length is "+longNumber.length());
        System.out.println("The shortest number is: '" + shortNumber + "'"+ " "+ "NUmber length is "+shortNumber.length());





    }
    public static void shortLongNumberFromBiggerToSmallest() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        System.out.println("Please type numbers when you finish please type 'e' and press Enter key ");
        while (sc.hasNextInt()){ Collections.addAll(list,sc.nextInt());}
        Collections.sort(list);
        System.out.println("Sorted list from smallest to biggest "+list);
        Collections.reverse(list);
        System.out.println("Sorted list from biggest  to smallest "+list);






    }


    }


