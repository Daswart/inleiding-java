package JavaBijspijkerCursus;

import java.util.Random;
import java.util.Scanner;

public class raadspel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welkom bij het Raadspel");
        System.out.println("     **********\n");
        System.out.print("Voer een int in tussen de 1 en 10: ");
        int randomgetal = new Random().nextInt(10) +1;
        int inputGetal = scanner.nextInt();
        int aantalX = 0;
        aantalX++;

        while (randomgetal != inputGetal ){
            System.out.println("");
            System.out.println("Probeer het nog een x...");
            System.out.print("Voer een int in tussen de 1 en de 10: ");
            inputGetal = scanner.nextInt();
            aantalX++;

        }
        System.out.println("Je hebt gewonnen na " + aantalX + " keer raden");
    }
}
