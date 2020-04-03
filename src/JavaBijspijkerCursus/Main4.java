package JavaBijspijkerCursus;

import java.util.Random;
import java.util.Scanner;


public class  Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char userInput;

        /*//OPDRACHT 4.1
        System.out.println("Opdracht 4.1\n");
        System.out.print("Van welk karakter wil je de ASCII waarde weten? ");
        userInput = scanner.nextLine().charAt(0);
        int ascii = userInput;
        System.out.println("De ASCII waarde van het karakter " + userInput + " is " + ascii + "\n\n");

        //OPDRACHT 4.2
        System.out.println("Opdracht 4.2 \n");
        System.out.print("Van welk karakter wil je weten of het een getal of letter is? ");
        userInput = scanner.nextLine().charAt(0);
        if (Character.isLetter(userInput)) {
            System.out.println("De " + userInput + " is een letter \n\n");

        } else if (Character.isDigit(userInput)) {
            System.out.println("De " + userInput + " is een cijfer \n\n");
        } else {
            System.out.println("Het karakter is geen letter of cijfer \n\n");
        }

        //OPDRACHT 4.3
        System.out.println("Opdracht 4.3 \n");
        System.out.print("Van welke letter wil je weten of het een klinker is? ");
        userInput = scanner.nextLine().charAt(0);

        if (Character.isLetter(userInput))
            switch (userInput) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    System.out.println("De " + userInput + " is een klinker\n\n");
                    break;
                default:
                    System.out.println("De " + userInput + " is een medeklinker \n\n");


            }
        else {
            System.out.println("Het karakter is geen letter \n\n ");
        }

        //OPDRACHT 4.4
        System.out.println("Opdracht 4.4 \n");
        System.out.print("Van welke letter wil je het waar het op T9 zit? ");
        userInput = scanner.nextLine().toUpperCase().charAt(0);
        if (Character.isLetter(userInput)) {
            if (userInput >= 'A' && userInput < 'D') {
                System.out.println("De letter " + userInput + " staat op de 2-toets.");
            } else if (userInput >= 'D' && userInput < 'G') {
                System.out.println("De letter " + userInput + " staat op de 3-toets.");
            } else if (userInput >= 'G' && userInput < 'J') {
                System.out.println("De letter " + userInput + " staat op de 4-toets.");
            } else if (userInput >= 'J' && userInput < 'M') {
                System.out.println("De letter " + userInput + " staat op de 5-toets.");
            } else if (userInput >= 'M' && userInput < 'P') {
                System.out.println("De letter " + userInput + " staat op de 6-toets.");
            } else if (userInput >= 'P' && userInput < 'T') {
                System.out.println("De letter " + userInput + " staat op de 7-toets.");
            } else if (userInput >= 'T' && userInput < 'W') {
                System.out.println("De letter " + userInput + " staat op de 8-toets.");
            } else if (userInput >= 'W') {
                System.out.println("De letter " + userInput + " staat op de 9-toets.");
            }
        }*/

        //OPDRACHT 4.5
        Scanner enter = new Scanner(System.in);
        System.out.println("Opdracht 4.5 \n");
        System.out.print("Druk op Enter voor een willekeurige letter: ");
        enter.nextLine();
        int random = (int) (Math.random() *27 + 0);
        char randomChar = (char) (random + 'A');
        System.out.println("Uw willekeurige letter is " + randomChar + "\n");

        //OPDRACHT 4.6
        System.out.println("Typ een String: ");
        userInput = scanner.nextLine().charAt(0);
        System.out.println(userInput);


    }
}



