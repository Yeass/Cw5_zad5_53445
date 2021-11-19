package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myObj = new Scanner(System.in);

        System.out.print("Wpisz slowo, aby sprawdzic czy jest palindromem: ");
        String tekst1 = myObj.nextLine();
        tekst1.toLowerCase();

        String rev = new StringBuffer(tekst1).reverse().toString();
        System.out.println("Odwrocone slowo: " + rev);

        boolean palin = (tekst1.equals(rev));
        if (palin == true){
            System.out.println("Podane slowo jest palindromem!");
        }else{
            System.out.println("Podane slowo nie jest palindromem!");
        }
    }
}
