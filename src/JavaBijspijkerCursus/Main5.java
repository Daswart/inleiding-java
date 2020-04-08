package JavaBijspijkerCursus;

import java.util.Scanner;

public class Main5 {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);



        //OPDRACHT 5.1;
        System.out.println("Opdracht 5.1");
        System.out.print("Wat is je toetscijfer? ");
        double cijfer = scanner.nextDouble();


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
        System.out.println("Tot ziens!");

        //NIEUWE VERSIE
        /*boolean proceed = true;
        while (proceed){
            System.out.print("Wat is je toetscijfer? ");
            double cijfer = scanner.nextDouble();
            if(cijfer < -1){
                System.out.println("Tot Ziens!");
                proceed = false;

            }
            else if(cijfer >= 5.5){
                System.out.println("Je hebt een voldoende! \n");
            }
            else {
                System.out.println("Helaas, je hebt een onvoldoende. \n");
            }

        }*/



    }


}

