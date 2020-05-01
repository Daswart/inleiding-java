package ExtraOpdrachten;

import java.util.Scanner;

public class Methodes {
    public static Scanner myScanner = new Scanner(System.in);
    public static int aantal = 0;
    public static int prijs = 2;
    public static int totaalprijs = 0;


    public static void main(String[] args) {
        System.out.print("Hoevel bierflesjes wil je bestellen? ");
        aantal = myScanner.nextInt();
        totaalprijs = (prijs * aantal);
        printBon();
        System.out.println();


    }
    public static void printBon() {
        System.out.println("\nBierfles " + aantal + "\t€2");
        System.out.println("=================");
        System.out.println("Totaal:");
        System.out.println("€" + totaalprijs);
    }
}
