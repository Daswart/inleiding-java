package JavaBijspijkerCursus;

import java.nio.channels.Channel;
import java.util.Scanner;

public class Television {
    private int channel = 1;
    private int volumeLevel = 1;
    private boolean power = false;
    static Scanner myScanner = new Scanner(System.in);
    static int userChoice = 0;


    public static void main(String[] args) {


        Television myFirstTelevision = new Television();

        myFirstTelevision.turnOff();

        while (myFirstTelevision.power = true) {
            myFirstTelevision.printMenu();
            System.out.print("\nMaak uw keuze: ");
            userChoice = myScanner.nextInt();
            switch (userChoice) {
                case 1:
                    myFirstTelevision.turnOn();
                    break;
                case 2:
                    myFirstTelevision.turnOff();
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

    public void turnOn() {
        power = true;
        System.out.println("\nDe TV staat nu aan.");

    }

    public void turnOff() {
        power = false;
        System.out.println("TV is off");
    }

    public void setChannel(int newChannel) {
        if (power && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;

        }
    }

    public void setVolume(int newVolumelevel) {
        if (power && newVolumelevel >= 1 && newVolumelevel <= 7) {
            volumeLevel = newVolumelevel;
            System.out.println("Volumelevel = " + volumeLevel);
        }

    }

    public void channelUp() {
        if (power && channel < 120) {
            channel++;
            System.out.println("De TV Staat nu op " + channel);

        }
    }

    public void channelDown() {
        if (power && channel > 1) {
            channel--;
            System.out.println("Channel = " + channel);
        } else {
            System.out.println("Channel = " + channel + "." + " Can't go lower!");
        }
    }

    public void volumeUp() {
        if (power && volumeLevel < 120) {
            volumeLevel++;
            System.out.println("Volume = " + volumeLevel);

        }


    }

    public void volumeDown() {
        if (power && volumeLevel > 0) {
            volumeLevel--;
            System.out.println("Volume = " + volumeLevel);
        } else {
            System.out.println("Volumelevel =");
        }

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