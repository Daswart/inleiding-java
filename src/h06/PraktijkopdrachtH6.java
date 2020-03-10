package h06;

import java.applet.Applet;
import java.awt.*;

public class PraktijkopdrachtH6 extends Applet {
       double cijfer1;
       double cijfer2;
       double cijfer3;
       double gemiddelde;
       int convertInt;
       double convertDouble;

public void init() {
        setSize(800, 800);
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3 *10; // gemiddelde is 63.666...
        convertInt = (int)gemiddelde; //converteren naar int, dus afronden op 63
        convertDouble = (double)convertInt / 10; // terugconverten naar double, uikomst is 6.3
        }

public void paint(Graphics g) {
        g.drawString("onafgerond * 10 is het gemiddelde "+ gemiddelde, 20, 20); //print 63.666....
        g.drawString("afgrond = "+ convertInt, 20, 40); //print 63
        g.drawString("het gemiddelde is " + convertDouble, 20, 60 ); // print 6.3


        }

}

