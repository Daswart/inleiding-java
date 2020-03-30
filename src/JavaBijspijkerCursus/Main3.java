package JavaBijspijkerCursus;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //OPDRACHT 3.1
        System.out.println("Opracht 3.1 \n");
        int random1 = (int) (Math.random() * 100 + 1);
        int random2 = (int) (Math.random() * 100 + 1);
        System.out.println("Hoeveel is " + random1 + " + " + random2 + "?");
        int antwoord = random1 + random2;
        System.out.print("Typ hier het antwoord: ");
        int userInput = scanner.nextInt();
        if(userInput == antwoord ){
            System.out.println("Klopt!");
            System.out.println("De som van " + random1 + " + " + random2 + " is inderdaad " + userInput + ". \n\n");

        }
        else{
            System.out.println("Dit klopt niet! Het antwoord = " + antwoord + "\n\n" );
        }

        //OPDRACHT 3.2
        System.out.println("Opdracht 3.2 \n ");
        int random3 = (int) (Math.random() *100 + 1);
        int random4 = (int) (Math.random() *100 + 1);
        int random5 = (int) (Math.random() *100 + 1);
        System.out.println("Hoeveel is " + random3 + " + " + random4 + " + " + random5 + "?");
        antwoord = random3 + random4 + random5;
        System.out.print("Type hier het antwoord: ");
        userInput = scanner.nextInt();
        if(userInput == antwoord ){
            System.out.println("Klopt!");
            System.out.println("De som van " + random3 + " + " + random4 + " + " + random5 +" is inderdaad " + userInput + ". \n\n");

        }
        else{
            System.out.println("Dit klopt niet! Het antwoord = " + antwoord + "\n\n" );
        }

    }



}
