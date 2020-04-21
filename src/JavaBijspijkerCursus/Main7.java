package JavaBijspijkerCursus;


import java.util.Arrays;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner mijnScanner = new Scanner(System.in);
        int counter = 1;

        // OPDRACHT 7.1;
        System.out.println("Opdracht 7.1 \n");
        System.out.println("Hier komen 100 worpen met een dobbelsteen: \n");
        //aanmaken array
        int[] dobbelsteenWorpen = new int[100];

        //vullen van de array (100 x want er zijn 100 vakjes) met randomgetallen van 1 t/m 6
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 6 + 1);
            dobbelsteenWorpen[i] = random;
        }
        //uitprinten van de waardes.

        for (int worp : dobbelsteenWorpen) {
            System.out.print(worp + " ");
            if (counter % 10 == 0) {
                System.out.println();

            }
            counter++;
            if (counter == 101) {
                System.out.println("\n");
            }
        }

        //OPDRACHT 7.2
        System.out.println("Opdracht 7.2 \n");
        System.out.print("Geef me 9 integers: ");
        int[] getallen = new int[9];
        for (int i = 0; i < 9; i++) {
            getallen[i] = mijnScanner.nextInt();

        }
        System.out.println("Daar komen ze, in omgekeerde volgorde: ");
        for (int i = 8; i >= 0; i--) {
            System.out.print(getallen[i] + " ");

        }
        System.out.println("\n\n");

        //OPDRACHT 7.3
        System.out.println("Opdracht 7.3 \n");
        System.out.println("Geef me nu 10 doubles, dan bereken ik het gemiddelde en tel ik hoeveel cijfers hoger zijn: ");
        double[] userInput = new double[10];
        for (int i = 0; i < 10; i++) {
            userInput[i] = mijnScanner.nextDouble();
        }
        double optelsom = 0;
        for (double waarde : userInput) {
            optelsom = optelsom + waarde;
        }
        double gemiddelde = optelsom / 10;
        System.out.println("Het gemiddelde is " + gemiddelde);

        counter = 0;
        for (double waarde : userInput) {
            if (waarde > gemiddelde) {
                counter++;

            }

        }
        System.out.println("Het aantaal doubles boven het gemiddelde is: " + counter);
    }


}



