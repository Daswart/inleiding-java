package JavaBijspijkerCursus;

import java.util.Scanner;

public class Television {
    private int channel = 1;
    private int volumeLevel = 1;
    private boolean power = false;


    public static void main(String[] args) {

        Television myFirstTelevision = new Television();



    }

    public void turnOn() {
        power = true;
        System.out.println("Tv is aan");

    }

    public void turnOff() {
        power = false;
        System.out.println("tv is uit");
    }

    public void setChannel(int newChannel) {
        if (power && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;

        }
    }

    public void setVolume(int newVolumelevel) {
        if (power && newVolumelevel >= 1 && newVolumelevel <= 7) {
            volumeLevel = newVolumelevel;
            System.out.println("het volume staat nu op" + volumeLevel);
        }

    }

    public void channelUp() {
        if (power && channel < 120) {
            channel++;
        }
    }

    public void channelDown() {
        if (power && channel > 1) {
            channel--;
        }
    }

    public void volumeUp() {
        if (power && volumeLevel < 120) {
            volumeLevel++;
        }


    }

    public void volumeDown() {
        if(power && volumeLevel > 0){
            volumeLevel--;
        }

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