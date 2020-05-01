package ExtraOpdrachten;

import java.security.spec.RSAOtherPrimeInfo;

public class Starter {
    public static void main(String[] args) {
        System.out.println("String Array:");
        //aanmaken van een (en vullen van) een Array van het type String.
        String[] autoMerken = {"Volvo", "Opel", "Kia", "Renault"}; // Array autoMerken is gevuld met 4 strings.

        //uitprinten van de string die zich op een bepaalde indexwaarde bevind.
        System.out.println("\nMijn vader rijdt een " + autoMerken[0] + "."); // index 0 = Volvo
        System.out.println("Ik rijd een " + autoMerken[1] + "."); // index 1 = Opel
        System.out.println("Niemand van ons rijdt een " + autoMerken[2] + ".\n\n"); // index 2 = Kia


        System.out.println("For-each loop: \n");
        //voor elke woord (string) dat in autoMerken staat doe dan wat in de methode staat.
        // 1 keer is autoMerk index 0
        // 2 keer 1
        // 3 keer 2.
        // de for-each loop gaat net zo lang door tot ie aan het eind van de arrray is.
        for(String autoMerk: autoMerken){
            System.out.println("Voor elke:\t " + autoMerk); //print autoMerk (in dit geval 3)

        }

        //for loop (tellende lus)
        System.out.println("\n\nfor loop (tellende lus):\n ");
        for(int autoMerk = 0; autoMerk < autoMerken.length; autoMerk++){
            System.out.println("tellende:\t" + autoMerken[autoMerk]);

        }

    }
}
