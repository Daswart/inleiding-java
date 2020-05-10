package JavaBijspijkerCursus;

import java.nio.channels.Channel;
import java.util.Scanner;

public class Television {
    private int channel = 1;
    private int volumeLevel = 1;
    private boolean power = false;
    static boolean proceed = true;
    static Scanner myScanner = new Scanner(System.in);
    static int userChoice = 0;


    public static void main(String[] args) {


        Television myFirstTelevision = new Television();

     while (proceed) {

         while (!myFirstTelevision.power) {
             myFirstTelevision.TVuit();
             userChoice = myScanner.nextInt();
             switch (userChoice) {
                 case 1:
                     myFirstTelevision.turnOn();
                     break;
                 case 2:
                     myFirstTelevision.turnOff();
                     break;
                 case 3:
                     System.exit(0);
                     break;

             }
         }
         while (myFirstTelevision.power) {
             myFirstTelevision.printMenu();
             System.out.print("\nMaak uw keuze: ");
             userChoice = myScanner.nextInt();
             switch (userChoice) {
                 case 1:
                     myFirstTelevision.turnOn();

                     break;
                 case 2:
                     myFirstTelevision.turnOff();
                     break;
                 case 3:
                     myFirstTelevision.channelUp();
                     break;
                 case 4:
                     myFirstTelevision.channelDown();
                     break;
                 case 5:
                     myFirstTelevision.volumeUp();
                     break;
                 case 6:
                     myFirstTelevision.volumeDown();
                     break;
                 case 7:
                     System.exit(0);


             }


         }

     }
    }

    public void TVuit() {
        System.out.println("\n1. ON");
        System.out.println("2. OFF");
        System.out.println("3. EXIT");
        System.out.print("Druk op 1 om de TV aan te zetten: ");

    }

    public void turnOn() {
        power = true;
        System.out.println("\nDe TV staat nu aan.");
        System.out.println("De TV staat nu op 1.");
        System.out.println("Het volume staat nu op 1.");

    }

    public void turnOff() {
        power = false;
        System.out.println("TV is uit.");
        volumeLevel = 1;
        channel = 1;

    }

    public void setChannel(int newChannel) {
        if (power && newChannel >= 1 && newChannel <= 10) {
            channel = newChannel;

        }
    }

    public void setVolume(int newVolumelevel) {
        if (power && newVolumelevel >= 1 && newVolumelevel <= 20) {
            volumeLevel = newVolumelevel;
            System.out.println("Volumelevel = " + volumeLevel +  ".");
        }

    }

    public void channelUp() {
        if (power && channel < 10) {
            channel++;
            System.out.println("De TV staat nu op " + channel +  ".");
        } else {
                System.out.println("De TV staat nu op " + channel + "." + " Er bestaat geen kanaal hoger is dan 10!");

        }
        System.out.println("Het volume staat op " + volumeLevel + ".");
    }

    public void channelDown() {
        if (power && channel > 1) {
            channel--;
            System.out.println("De TV staat nu op " + channel +  ".");
        } else {
            System.out.println("De TV staat nu op " + channel + "." + " Er bestaat geen kanaal lager dan 1!");
        }
        System.out.println("Het volume staat op " + volumeLevel + ".");
    }

    public void volumeUp() {
        if (power && volumeLevel < 20) {
            volumeLevel++;
            System.out.println("Het volume staat nu op " + volumeLevel +  ".");
        } else {
            System.out.println("Het volume staat nu op " + volumeLevel + "." + " Het volume kan niet hoger dan 20!");
        }
        System.out.println("TV staat op " + channel + ".");
        }




    public void volumeDown() {
        if (power && volumeLevel > 1) {
            volumeLevel--;
            System.out.println("Het volume staat nu op " + volumeLevel +  ".");
         } else {
        System.out.println("Het volume staat nu op " + volumeLevel + "." + " Het volume kan niet langer dan 1!");
        }
        System.out.println("TV staat op " + channel + ".");

    }

    public void printMenu() {
        System.out.println("\n1. ON");
        System.out.println("2. OFF");
        System.out.println("3. CHANNEL UP");
        System.out.println("4. CHANNEL DOWN");
        System.out.println("5. VOLUME UP");
        System.out.println("6. VOLUME DOWN");
        System.out.println("7. EXIT");
    }
}


//MOGELIJK NOG TE GEBRUIKEN CODE (DAAN LEZEN)
/*Scanner myScanner = new Scanner(System.in);

        System.out.println("TV is uit");
                System.out.print("Typ 1 als je de tv wilt aan zetten: ");
                int userinput = myScanner.next().charAt(0);
                if(userinput == 43){
                turnOn();
                }
                else{
                turnOff();
                }*/