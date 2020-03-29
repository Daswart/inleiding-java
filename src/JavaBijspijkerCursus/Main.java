package JavaBijspijkerCursus;



public class Main {

    public static void main(String[] args){

        //OEFENING 1.1
        System.out.println("Oefening 1\n");
        System.out.println("Java is Object Georiënteerd");
        System.out.println("Java is strongly typed");
        System.out.println("Java is geen JavaScript\n\n");

        //OEFENING 1.2
        System.out.println("Oefening 2\n");
        System.out.println("Java is geweldig!");
        System.out.println("Java is geweldig!");
        System.out.println("Java is geweldig!");
        System.out.println("Java is geweldig!");
        System.out.println("Java is geweldig!");
        System.out.println("Java is geweldig!\n\n");

        //OEFENING 1.3
        System.out.println("Oefening 3\n");
        System.out.println("a\ta^2\ta^3\ta^4");
        System.out.println("1\t1\t1\t1");
        System.out.println("2\t4\t8\t16");
        System.out.println("3\t9\t27\t81");
        System.out.println("4\t16\t64\t256\n\n");

        //oude versie
        /*System.out.println(" a " + "  a^2 "  + " a^3 " + " a^4 ");
        System.out.println(" 1 " + "  1 "  + "   1 " + "   1 ");
        System.out.println(" 2 " + "  4 "  + "   8 " + "   4 ");
        System.out.println(" 3 " + "  9 "  + "   27 " + "  81 ");
        System.out.println(" 4 " + "  16 "  + "  64 " + "  256\n\n");*/

        //OEFENING 1.4
        System.out.println("Oefening 4\n");
        System.out.println((7.5 * 6.5 - 4.5 * 3) / (47.5 * 5.5) +"\n\n");

        //OEFENING 1.5
        System.out.println("Oefening 5\n");
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 +"\n\n") ;

        //OEFENING 1.6
        System.out.println("Oefening 6\n");
        double benaderingVanPi = 4. * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9
                - 1.0 / 11 + 1.0 / 13);
        System.out.println(benaderingVanPi + "\n\n");

        //OUDE VERSIE
        /*System.out.println(4.0 * (1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0
                - 1.0 / 11.0 + 1.0 / 13.0) + "\n\n");*/

        //OEFENING 1.7
        System.out.println("Oefening 7\n");
        double straal = 6.5;
        double pi = 3.14159;
        double oppervlakte = straal * straal * pi;
        double omtrek = 2 * straal * pi;
        System.out.println("oppervlakte = " + oppervlakte);
        System.out.println("omtrek = " + omtrek + "\n\n");


        //OEFENING 1.8
        double lengte = 5.3;
        double breedte = 8.6;

        oppervlakte = lengte * breedte;
        omtrek = 2 * (lengte + breedte);

        System.out.println("Oefening 8\n");
        System.out.println("oppervlakte = " + oppervlakte);
        System.out.println("omtrek = " + omtrek +"\n\n");


    }

}
