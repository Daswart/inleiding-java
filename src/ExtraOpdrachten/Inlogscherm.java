package ExtraOpdrachten;


import java.util.Scanner;

public class Inlogscherm {

    public static void main(String[] args) {

        Scanner mijnScanner = new Scanner(System.in);
        boolean proceed = true;

        System.out.print("Gebruikersnaam: ");
        String gebruikersnaam = mijnScanner.nextLine();
        while (proceed) {
            if (gebruikersnaam.equals("Daan")) {
                System.out.print("Wachtwoord: ");
                String wachtwoord = mijnScanner.nextLine();


                if (wachtwoord.equals("Swart")) {
                    System.out.println("U bent ingelogd");
                    proceed = false;
                } else {
                    System.out.println("Onjuist wachtwoord");
                    System.out.println("");




                }


            }
            else{
                System.out.println("Onbekende gebruiker.");
                System.out.print("Gebruikersnaam: ");
                gebruikersnaam = mijnScanner.nextLine();
            }
        }


    }
}



