package JavaBijspijkerCursus;

import java.util.Scanner;


public class Main4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //OPDRACHT 4.1
        System.out.println("Opdracht 4.1\n");
        System.out.print("Van welk karakter wil je de ASCII waarde weten? ");
        char userInput =  scanner.nextLine().charAt(0);
        int ascii = userInput;
        System.out.println("De ASCII waarde van het karakter " + userInput + " is " + ascii + "\n\n");

        //OPDRACHT 4.2
        System.out.println("Opdracht 4.2 \n");
        System.out.print("Van welk karakter wil je weten of het een getal of letter is? ");
        userInput = scanner.nextLine().charAt(0);
        if(Character.isLetter(userInput)){
            System.out.println("De " + userInput +  " is een letter \n\n");

        }
        else if (Character.isDigit(userInput)){
            System.out.println("De " + userInput +  " is een cijfer \n\n");
        }
        else {
            System.out.println("Het karakter is geen letter of cijfer \n\n");
        }

        //OPDRACHT 4.3
        System.out.println("Opdracht 4.3 \n");
        System.out.print("Van welke letter wil je weten of het een klinker is? ");
       userInput = scanner.nextLine().charAt(0);

        if(Character.isLetter(userInput))
        switch (userInput){
               case 'a':
               case 'A':
               case 'e':
               case 'E':
               case 'i':
               case 'I':
               case 'o':
               case 'O':
               case 'u':
               case 'U':
                   System.out.println("De " + userInput + " is een klinker");
                   break;
               default:
                   System.out.println("De " + userInput + " is een medeklinker" );



           }
        else {
            System.out.println("Het karakter is geen letter");
        }




        }

}
