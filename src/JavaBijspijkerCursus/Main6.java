package JavaBijspijkerCursus;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //OPDRACHT 6.1
        System.out.println("Opdracht 6.1 \n");
        printZinnetje();

        //OPDRACHT 6.2
        System.out.println("Opdracht 6.2 \n");
        System.out.print("Welk zinnetje moet ik printen? ");
        String userInput = scanner.nextLine();
        printZinnetje(userInput);
        System.out.println();

        //OPDRACHT 6.3
        int getal1 = (int) (Math.random() * 10 + 1);
        int getal2 = (int) (Math.random() * 10 + 1);

        int product = berekenProduct(getal1, getal2);
        System.out.println("Opdracht 6.3 \n");
        System.out.println("Het product van " + getal1 + " en " + getal2 + " is " + product);


    }

    //Zelfgemaakte Methodes
    public static void printZinnetje() {
        System.out.println("Hello world \n\n");

    }

    public static void printZinnetje(String zinnetje) {
        System.out.println(zinnetje + ".");

    }

    public static int berekenProduct(int getal1, int getal2){
        return getal1 * getal2;


    }



}

