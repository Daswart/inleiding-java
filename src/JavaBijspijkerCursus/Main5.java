package JavaBijspijkerCursus;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double cijfer;


        //OPDRACHT 5.1;
        /*System.out.println("Opdracht 5.1");
        System.out.print("Wat is je toetscijfer? ");
        cijfer = scanner.nextDouble();


        while (cijfer >= 0 && cijfer < 10.1){
            if (cijfer < 5.5 ){
                System.out.println("Helaas, je hebt een onvoldoende.");
                System.out.print("Wat is je toetscijfer? ");
                cijfer = scanner.nextDouble();
            }
            else if(cijfer <= 10 ){
                System.out.println("Je hebt een voldoende!");
                System.out.print("Wat is je toetscijfer? ");
                cijfer = scanner.nextDouble();
            }


            }
        System.out.println("Tot ziens!");*/

        //NIEUWE VERSIE
        System.out.println("Opdracht 5.1 \n");
        boolean proceed = true;
        while (proceed){
            System.out.print("Wat is je toetscijfer? ");
             cijfer = scanner.nextDouble();
            if(cijfer <= -1 ){
                System.out.println("Tot Ziens! \n\n ");
                proceed = false;
            }
            else if(cijfer >= 5.5 && cijfer <= 10){
                System.out.println("Je hebt een voldoende! \n");

            } else if( cijfer > 10){
                System.out.println("Dit cijfer is te hoog. Typ een cijfer van 10 of lager. \n");
            }
            else {
                System.out.println("Helaas, je hebt een onvoldoende. \n");
            }

        }

        //OPDRACHT 5.2
        System.out.println("Opdracht 5.2 \n" );
        System.out.println("Je moet 5 sommen oplossen.\nOm te slagen moet je tenminste 3 antwoorden goed hebben.");
        System.out.println("********");
        int aantalX = 0;
        int aantalGoed = 0;
        int aantalFout = 0;
        int randomGetal1 = (int) (Math.random() * 109 +1);
        int randomGetal2 = (int) (Math.random() * 100 +1);
        int antwoord = randomGetal1 + randomGetal2;
        System.out.print("Hoeveel is " + randomGetal1 + " + " + randomGetal2 + "? ");
        int userInput = scanner.nextInt();
        aantalX++;
        proceed = true;
        while(proceed){
            if(userInput == antwoord){ // Wanneer het antwoord van de gebruiker gelijk is aan het goede antwoord
                    aantalGoed++;
                    System.out.println("Het antwoord is goed! \n");
                    randomGetal1 = (int) (Math.random() * 100 +1);
                    randomGetal2 = (int) (Math.random() * 100 +1);
                    System.out.print("Hoeveel is " + randomGetal1 + " + " + randomGetal2 + "? " );
                    userInput = scanner.nextInt();
                    aantalX++;
                    antwoord = randomGetal1 + randomGetal2;
            }
            else { // Wanneer de gebruiker een fout antwoord heeft gegeven
                aantalFout++;
                System.out.println("Het antwoord is fout!");
                System.out.println("Het antwoord had moeten zijn: " + antwoord + "\n");
                randomGetal1 = (int) (Math.random() * 100 +1);
                randomGetal2 = (int) (Math.random() * 100 +1);
                System.out.print("Hoeveel is " + randomGetal1 + " + " + randomGetal2 + "? ");
                userInput = scanner.nextInt();
                aantalX++;
                antwoord = randomGetal1 + randomGetal2;

            }
            //laatste som is opglost en een goed antwoord is gegeven
            if( aantalX  == 10 && userInput == antwoord){
                if (aantalFout > aantalGoed){  //als er meer antwoorden fout dan goed zijn
                    System.out.println("Het antwoord is goed! \n");
                    System.out.println("je hebt " + aantalX + " keer gespeeld.");
                    System.out.println( "je hebt er " + aantalGoed + " goed" + " en " + aantalFout + " fout.");
                    System.out.println("Probeer het nog een keer!\n\n");
                    proceed = false;
                }
                else if (aantalGoed > aantalFout){  //als er meer antwoorden goed dan fout zijn
                    System.out.println("Het antwoord is goed! \n");
                    System.out.println("je hebt " + aantalX + " keer gespeeld.");
                    System.out.println( "je hebt er " + aantalGoed + " goed" + " en " + aantalFout + " fout.");
                    System.out.println("Je bent geslaagd!\n\n");
                    proceed = false;
                }
                else{ //als er evenveel vragen goed en fout zijn
                    System.out.println("Het antwoord is goed! \n");
                    System.out.println("je hebt " + aantalX + " keer gespeeld.");
                    System.out.println( "je hebt er " + aantalGoed + " goed" + " en " + aantalFout + " fout.");
                    System.out.println("Je bent geslaagd! \n\n");
                    proceed = false;
                }
            }
            //laatste som is opgelost en een fout antwoord is gegeven
            if (aantalX == 10 && userInput != antwoord){
                aantalFout++;
                if(aantalFout > aantalGoed){ //als er meer antwoorden fout dan goed zijn
                    System.out.println("Het antwoord is fout." );
                    System.out.println("Het antwoord had moeten zijn: " + antwoord + "\n");
                    System.out.println("je hebt " + aantalX + " keer gespeeld.");
                    System.out.println( "je hebt er " + aantalGoed + " goed" + " en " + aantalFout + " fout.");
                    System.out.println("Probeer het nog een keer! \n\n");
                    proceed = false;
                }
                else if(aantalGoed > aantalFout){ //als er meer antwoorden goed dan fout zijn
                    System.out.println("Het antwoord is fout." );
                    System.out.println("Het antwoord had moeten zijn: " + antwoord + "\n");
                    System.out.println("je hebt " + aantalX + " keer gespeeld.");
                    System.out.println( "je hebt er " + aantalGoed + " goed" + " en " + aantalFout + " fout.");
                    System.out.println("Je bent geslaagd! \n\n");
                    proceed = false;
                }
                else{ //als er evenveel vragen goed en fout zijn
                    System.out.println("Het antwoord is fout." );
                    System.out.println("Het antwoord had moeten zijn: " + antwoord + "\n");
                    System.out.println("je hebt " + aantalX + " keer gespeeld.");
                    System.out.println( "je hebt er " + aantalGoed + " goed" + " en " + aantalFout + " fout.");
                    System.out.println("Je bent geslaagd \n\n!");
                    proceed = false;
                }

            }

        }

        //OPDRACHT 5.3
        System.out.println("opdracht 5.3 \n");

        for (int i = 1; i <= 10 ; i++) {
            int product = i * 7;
            System.out.println(i +  " x 7 = " + product + "\n");

        }

        //OPDRACHT 5.4
        /*System.out.println("Opdracht 5.4 \n");
        System.out.print("Getal 1: ");
        int getal1 = scanner.nextInt();
        System.out.print("Getal 2: ");
        int getal2 = scanner.nextInt();
        System.out.print("Getal 3: ");
        int getal3 = scanner.nextInt();
        System.out.print("Getal 4: ");
        int getal4 = scanner.nextInt();
        System.out.print("Getal 5: ");
        int getal5 = scanner.nextInt();
        int[] getallen = {getal1, getal2, getal3, getal4, getal5};
        Arrays.sort(getallen);
        System.out.println("Het laagste getal is = " + getallen[0] + "\n");*/

        //Opdracht 5.4 (Nieuwe Versie)
        System.out.println("Opdracht 5.4 \n");
        int laagsteGetal = 0;
        for (int i = 0; i < 5; i++){
            System.out.print("Typ een getal: ");
            userInput = scanner.nextInt();
            if (i == 0){
                laagsteGetal = userInput;
            }
            else {
                if (userInput < laagsteGetal) {
                    laagsteGetal = userInput;
                }
            }
        }
        System.out.println("Het laagste getal wat je hebt getypt: " + laagsteGetal);

        //OPDRACHT 5.5
        System.out.println("Opdracht 5.5 \n");
        Double hoogsteCijfer = 0.0;
        String student = "onbekend";
        scanner.nextLine();
        for(int i = 1 ; i < 6; i++){
            System.out.print("Hoe heet de " + i + "e student? ");
            String naam = scanner.nextLine();
            System.out.print("Wat was zijn/haar cijfer? ");
            cijfer = scanner.nextDouble();
            scanner.nextLine();
            if(i == 0 ){
                hoogsteCijfer = cijfer;
                student = naam;
            }
            else{
                if(cijfer > hoogsteCijfer){
                    hoogsteCijfer = cijfer;
                    student = naam;
                    }
                }

            }
        System.out.println("");
        System.out.println("Het hoogste cijfer is behaald door " + student + ".");
        System.out.println("Hij/zij had een " + hoogsteCijfer + ".");

        //OPDRACHT 5.6;

        for (int i = 0; i < 100; i++){
            if(i % 5 == 0){
                System.out.println(i + " = deelbaar door 100");
            }

        }

        //OPDRACHT 5.7
        System.out.println(" Opdracht 5.7");
        proceed = true;
        int count = 0;
        while (proceed) {
            int kwadraat = count * count;
            if (kwadraat <= 1000) {
                System.out.println("de som van " + count + " x " + count + " = " + kwadraat + ".");
                count++;

            }
            else{
                proceed = false;
            }

        }


    }


}











