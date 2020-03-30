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

        //OPDRACHT 3.4
        System.out.println("Opdracht 3.4 \n ");
        int random6 = (int) (Math.random() *13 + 0);
        switch (random6){
            case 1:
                System.out.println("Het random getal is 1 en dat is de maand januari");
                break;
            case 2:
                System.out.println("Het random getal is 2 en dat is de maand februari");
                break;
            case 3:
                System.out.println("Het random getal is 3 en dat is de maand maart");
                break;
            case 4:
                System.out.println("Het random getal is 4 en dat is de maand april");
                break;
            case 5:
                System.out.println("Het random getal is 5 en dat is de maand mei");
                break;
            case 6:
                System.out.println("Het random getal is 6 en dat is de maand juni");
                break;
            case 7:
                System.out.println("Het random getal is 7 en dat is de maand juli");
                break;
            case 8:
                System.out.println("Het random getal is 8 en dat is de maand augustus");
                break;
            case 9:
                System.out.println("Het random getal is 9 en dat is de maand september");
                break;
            case 10:
                System.out.println("Het random getal is 10 en dat is de maand oktober");
                break;
            case 11:
                System.out.println("Het random getal is 11 en dat is de maand november");
                break;
            case 12:
                System.out.println("Het random getal is 12 en dat is de maand december");
                break;
        }





    }



}
