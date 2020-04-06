package JavaBijspijkerCursus;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class  Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char userInput;

        //OPDRACHT 4.1
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
                System.out.println("De letter " + userInput + " staat op de 2-toets. \n\n");
            } else if (userInput >= 'D' && userInput < 'G') {
                System.out.println("De letter " + userInput + " staat op de 3-toets. \n\n");
            } else if (userInput >= 'G' && userInput < 'J') {
                System.out.println("De letter " + userInput + " staat op de 4-toets. \n\n");
            } else if (userInput >= 'J' && userInput < 'M') {
                System.out.println("De letter " + userInput + " staat op de 5-toets. \n\n");
            } else if (userInput >= 'M' && userInput < 'P') {
                System.out.println("De letter " + userInput + " staat op de 6-toets. \n\n");
            } else if (userInput >= 'P' && userInput < 'T') {
                System.out.println("De letter " + userInput + " staat op de 7-toets. \n\n");
            } else if (userInput >= 'T' && userInput < 'W') {
                System.out.println("De letter " + userInput + " staat op de 8-toets. \n\n ");
            } else if (userInput >= 'W') {
                System.out.println("De letter " + userInput + " staat op de 9-toets. \n\n");
            }
        }

        //OPDRACHT 4.5
        Scanner enter = new Scanner(System.in);
        System.out.println("Opdracht 4.5 \n");
        System.out.print("Druk op Enter voor een willekeurige letter: ");
        enter.nextLine();
        int random = (int) (Math.random() *27 + 0);
        char randomChar = (char) (random + 'A');
        System.out.println("Uw willekeurige letter is " + randomChar + "\n\n");

        //OPDRACHT 4.6
        System.out.println("Opdracht 4.6 \n");
        System.out.print("Typ een String: ");
        String userInputString = scanner.nextLine();
        int length = userInputString.length();
        char firstLetter = userInputString.charAt(0);
        char lastLetter = userInputString.charAt(userInputString.length() - 1);
        System.out.println("De lengte van " + userInputString + " is " + length + ". \n\n");
        System.out.println("Het eerste karakter is " + firstLetter + ". \n\n");
        System.out.println("Het laatste karakter is " + lastLetter + ". \n\n" );


        //OPDRACHT 4.7
        System.out.println("Opdracht 4.7 \n");
        System.out.print("Land 1 ");
        String land1 = scanner.nextLine();
        System.out.print("Land 2 ");
        String land2 = scanner.nextLine();
        System.out.print("Land 3 ");
        String land3 = scanner.nextLine();
        String[] landen = {land1, land2, land3,};
        Arrays.sort(landen);
        System.out.println(Arrays.toString(landen));




    }
}



