package JavaBijspijkerCursus;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner mijnScanner = new Scanner(System.in);

        //OPDRACHT 6.1
        System.out.println("Opdracht 6.1 \n");
        printZinnetje();

        //OPDRACHT 6.2
        System.out.println("Opdracht 6.2 \n");
        System.out.print("Welk zinnetje moet ik printen? ");
        String userInput = mijnScanner.nextLine();
        printZinnetje(userInput);
        System.out.println("\n");

        //OPDRACHT 6.3
        int getal1 = (int) (Math.random() * 10 + 1);
        int getal2 = (int) (Math.random() * 10 + 1);

        int product = berekenProduct(getal1, getal2);
        System.out.println("Opdracht 6.3 \n");
        System.out.println("Het product van " + getal1 + " en " + getal2 + " is " + product + "\n\n");

        //OPDRACHT 6.4
        System.out.println("opdracht 6.4 \n");
        System.out.println("We gaan 2 getallen vermenigvuldigen.");
        System.out.print("Wat is het eerste getal? ");
        getal1 = mijnScanner.nextInt();
        System.out.print("Wat is het tweede getal? ");
        getal2 = mijnScanner.nextInt();
        product = berekenProduct(getal1, getal2);
        System.out.println("Het product van " + getal1 + " en " + getal2 + " = " + product + " \n\n");

        //OPDRACHT 6.5
        System.out.println("Opdracht 6.5 \n");
        System.out.print("Van welk getal wil je de dag weten? ");
        int dag = mijnScanner.nextInt();

        //Optionele while-loop hoort niet bij de opdracht.
        while (dag <= 0 || dag >= 8) {// wanneer er geen geldig getal (dus geen getal tussen 0 en 8) wordt ingevoerd, wordt onderstaande code uitgevoerd.
            System.out.print("Vul een geldig getal in: "); //Gebruiker kan opnieuw een getal intypen.
            dag = mijnScanner.nextInt(); // invoer gebruiker wordt opgeslagen in variabele dag.
        }
        bepaalDag(dag);

        //OPDRACHT 6.6
        System.out.println("opdracht 6.6 \n");
        System.out.print("Van welk getal wil je weten of het een even getal is: ");
        getal1 = mijnScanner.nextInt();
        boolean evengetal = isEvenGetal(getal1);
        if (evengetal){
            System.out.println("Het getal " + getal1 + " is een even getal");
        }
        else{
            System.out.println("Het getal " + getal1 + " is geen even getal");
        }


    }
    //ZELFGEMAAKT METHODES

    // METHODE OPDRACHT 1
    public static void printZinnetje() {
        System.out.println("Hello world \n\n");
    }

    //METHODE OPDRACHT 2
    public static void printZinnetje(String zinnetje) {
        System.out.println(zinnetje + ".");
    }

    //METHODE OPDRACHT 3 en 4
    public static int berekenProduct(int getal1, int getal2) {
        return getal1 * getal2;
    }

    //METHODE OPDRACHT 5
    public static int bepaalDag(int dagnummer) {


        switch (dagnummer) {
            case 1:
                System.out.println("Bij nummer " + dagnummer + " hoort de weekdag maandag. \n\n");
                break;
            case 2:
                System.out.println("Bij nummer " + dagnummer + " hoort de weekdag dinsdag. \n\n");
                break;
            case 3:
                System.out.println("Bij nummer " + dagnummer + " hoort de weekdag woensdag. \n\n");
                break;
            case 4:
                System.out.println("Bij nummer " + dagnummer + " hoort de weekdag donderdag. \n\n");
                break;
            case 5:
                System.out.println("Bij nummer " + dagnummer + " hoort de weekdag vrijdag. \n\n");
                break;
            case 6:
                System.out.println("Bij nummer " + dagnummer + " hoort de weekdag zaterdag. \n\n");
                break;
            case 7:
                System.out.println("Bij nummer " + dagnummer + " hoort de weekdag zondag. \n\n");
                break;

        }
        return dagnummer;

    }

    //Methode opdracht 6
    public static boolean isEvenGetal(int getal){
        return getal % 2 == 0;


    }
    //werkt dit daan kun jij dit ook zien??




}







