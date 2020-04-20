package JavaBijspijkerCursus;


import java.util.Arrays;

public class Main7 {
    public static void main(String[] args) {

        // OPDRACHT 7.1;
        System.out.println("Opdracht 7.1 \n");
        System.out.println("Hier komen 100 worpen met een dobbelsteen \n");
        //aanmaken array
        int[] dobbelsteenWorpen = new int[100];

        //vullen van de array (100 x want er zijn 100 vakjes) met randomgetallen van 1 t/m 6
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 6 + 1);
            dobbelsteenWorpen[i] = random;
        }
        //uitprinten van de waardes.
        int counter = 1;
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

    }

}

