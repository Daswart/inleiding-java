package JavaBijspijkerCursus;

import java.util.Arrays;
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
            System.out.println("Dit klopt niet! Het antwoord = " + antwoord + ".\n\n" );
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
            System.out.println("Dit klopt niet! Het antwoord = " + antwoord + ".\n\n" );
        }

        //OPDRACHT 3.3
        Scanner s = new Scanner(System.in);
        System.out.println("Opdracht 3.3\n");
        System.out.println("Druk op Enter");
        s.nextLine();
        int random6 = (int) (Math.random() *13 + 0);
        switch (random6){
            case 1:
                System.out.println("Het random getal is 1 en dat is de maand januari.");
                break;
            case 2:
                System.out.println("Het random getal is 2 en dat is de maand februari.");
                break;
            case 3:
                System.out.println("Het random getal is 3 en dat is de maand maart.");
                break;
            case 4:
                System.out.println("Het random getal is 4 en dat is de maand april.");
                break;
            case 5:
                System.out.println("Het random getal is 5 en dat is de maand mei.");
                break;
            case 6:
                System.out.println("Het random getal is 6 en dat is de maand juni. ");
                break;
            case 7:
                System.out.println("Het random getal is 7 en dat is de maand juli.");
                break;
            case 8:
                System.out.println("Het random getal is 8 en dat is de maand augustus.");
                break;
            case 9:
                System.out.println("Het random getal is 9 en dat is de maand september.");
                break;
            case 10:
                System.out.println("Het random getal is 10 en dat is de maand oktober.");
                break;
            case 11:
                System.out.println("Het random getal is 11 en dat is de maand november.");
                break;
            case 12:
                System.out.println("Het random getal is 12 en dat is de maand december.");
                break;
        }

        System.out.println("Druk op Enter voor de volgende opdracht.. \n");
        s.nextLine();

        //OPDRACHT 3.4
        System.out.println("Opdracht 3.4 \n");
        System.out.print("Welke weekdag is het vandaag?( 1 = ma / 2 = di / 3 = wo / 4 = do / 5 = vr / 6 = za / 7 = zo) ");
        int weekdag = scanner.nextInt();
        System.out.print("En van hoeveel dagen in de toekomst wil je de weekdag berekenen? ");
        int dagenVooruit = scanner.nextInt();
        int resultaat = weekdag + dagenVooruit;
        if (resultaat > 7){
            resultaat = resultaat % 7;
        }


        String[] weekdagen = {"onbekend", "maadag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag", "zondag"};
        System.out.println("Vandaag is het " + weekdagen[weekdag] + " en over " + dagenVooruit + " dagen is het " + weekdagen[resultaat] + ".\n\n" );

        //OPDRACHT 3.5
        System.out.println("Opdracht 3.5 \n");
        System.out.print("Wat is uw gewicht (kg)? ");
        double gewicht = scanner.nextDouble();
        System.out.print("Wat is uw lengte (m)? ");
        double lengte = scanner.nextDouble();
        double uitkomst = gewicht / (lengte * lengte);
        int tussenstap = (int)(uitkomst * 100);
        double bmi = (double)tussenstap / 100;
        if(bmi < 18.5 ){
            System.out.println("Uw BMI is " + bmi);
            System.out.println("Als u minstens 20 jaar bent betekent dit dat u ondergewicht hebt. Probeer aan te komen.\n\n");
        }
        else if(bmi == 18.5 || bmi < 25){
            System.out.println("Uw BMI is " + bmi);
            System.out.println("Als u minstens 20 jaar bent betekent dit dat u een normaal gewicht hebt. Probeer op gewicht te blijven. \n\n");
        }
        else if(bmi == 25 || bmi < 30){
            System.out.println("Uw BMI is " + bmi);
            System.out.println("Als u minstens 20 jaar bent betekent dit dat u overgewicht hebt. Probeer af te vallen. \n\n");
        }
        else if(bmi > 30){
            System.out.println("Uw BMI is " + bmi);
            System.out.println("Als u minstens 20 jaar bent betekent dit dat u zwaar overgewicht hebt. Probeer onder begeleiding af te vallen. \n\n");
        }

        //Opdracht 3.6
        System.out.println("Opdracht 3.6 \n");
        System.out.print("Getal 1: ");
        int getal1 = scanner.nextInt();
        System.out.print("Getal 2: ");
        int getal2 = scanner.nextInt();
        System.out.print("Getal 3: ");
        int getal3 = scanner.nextInt();
        int[] getallen = {getal1, getal2, getal3};
        Arrays.sort(getallen);
        System.out.println("Van klein naar groot: " + getallen[0] + " - " + getallen[1] + " - " + getallen[2]);




        }

}
