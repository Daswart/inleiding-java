package JavaBijspijkerCursus;

import java.util.Scanner;

public class Main2 {

    public  static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //OEFENING 2.1
        System.out.println("Oefening 2.1 \n");
        System.out.print("Typ het aantal mijlen: ");
        double mijlen = scanner.nextDouble();
        double kilometers = mijlen * 1.6;
        int tussenstap = (int)(kilometers *10);
        kilometers = (double)tussenstap/10;

        System.out.println(mijlen + " mijlen is " + kilometers + " kilometer \n\n");

        //OEFENING 2.2
        System.out.println("Oefening 2.2 \n");
        System.out.print("Hoeveel jaar oud ben je? ");
        int leeftijd = scanner.nextInt();
        int leeftijdInMinuten = leeftijd * 365 * 24 * 60;
        System.out.print("Hoeveel maanden komen daar nog bij? ");
        int aantalMaanden = scanner.nextInt();
        int aantalMinuten = aantalMaanden * 30 * 24 * 60;
        leeftijdInMinuten = aantalMinuten + leeftijdInMinuten;
        System.out.println("Je bent nu ongeveer " + leeftijdInMinuten +" minuten oud \n\n");

        //OEFENING 2.3
        System.out.println("Oefening 2.3\n");
        System.out.print("Typ het startbedrag: ");
        double startbedrag = scanner.nextDouble();
        System.out.print("Typ het rentepercentage: ");
        double rentepercentage = scanner.nextDouble();
        double rente = rentepercentage / 100 * startbedrag ;
        double totaalbedrag = rente + startbedrag;
        System.out.println("De rente is " + rente + " en het totaalbedrag is " + totaalbedrag + "\n\n");

        //OEFENING 2.4
        System.out.println("Oefening 2.4 \n");
        System.out.print("Typ een getal tussen 10 en 100: ");
        int userInput = scanner.nextInt();

        if (userInput > 10 && userInput < 100) {
            int getal1 = userInput - 2;
            int getal2 = userInput - 1;
            int getal3 = userInput + 1;
            int getal4 = userInput + 2;
            System.out.println(getal1 + " - " + getal2 + " - " + userInput + " - " + getal3 + " - " + getal4 + "\n\n");
        }
        else {
            System.out.println("Helaas, het getal dat je hebt getypt ligt niet tussen de 10 en de 100. Typ een getal dat tussen de 10 en de 100 ligt.\n\n");
        }


        //OEFENING 2.5
        System.out.println("Oefening 2.5 \n");
        System.out.print("Typ een getal tussen 0 en 1000: ");
        userInput = scanner.nextInt();

        if(userInput < 1000 && userInput >= 100){

            int laatsteGetal = userInput % 10;
            userInput = userInput / 10;

            int middelsteGetal = userInput % 10;
            userInput = userInput / 10;

            int eerstGetal = userInput;

            int product = eerstGetal * middelsteGetal * laatsteGetal;
            System.out.println("De vermenigvuldig van de cijfers luidt: " + eerstGetal + " x " + middelsteGetal + " x " + laatsteGetal +
                    " = " + product);
        }
        else if (userInput >= 10 && userInput < 100){

            int laatsteGetal = userInput % 10;
            userInput = userInput / 10;

            int eersteGetal = userInput;

            int product = eersteGetal * laatsteGetal;
            System.out.println("De vermenigvuldig van de cijfers luidt: " + eersteGetal + " x " + laatsteGetal + " = " + product);
        }
        else if(userInput < 10 && userInput > 0){

            System.out.println("De vermenigvuldig van de cijfers luidt: " + userInput + " = " + userInput);
        }
        else{

            System.out.println("Helaas, het getal dat je hebt getypt ligt niet tussen de 0 en de 1000. Typ een getal dat tussen de 0 en de 1000 ligt.");

        }



    }

}
