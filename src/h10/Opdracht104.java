package h10;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;


public class Opdracht104 extends Applet {
    TextField tekstVakMaand;
    TextField tekstVakJaar;
    Label labelMaand;
    Label labelJaar;
    Font font;
    String s, tekst, dagInMaand, dagenInFebruari;
    int maand;
    int jaartal;
    boolean schrikkelJjaar = false;

    public void init() {

        setSize(1200, 200);

        font = new Font("", Font.PLAIN,16);

        tekstVakMaand = new TextField("", 2);
        labelMaand = new Label("Type het maandnummer en druk op Enter");
        labelMaand.setFont(font);
        add(labelMaand);
        tekstVakMaand.addActionListener(new TekstVakMaandListener());
        add(tekstVakMaand);



        tekstVakJaar = new TextField("", 2);
        labelJaar = new Label("Type het jaartal en druk op Enter");
        add(labelJaar);
        labelJaar.setFont(font);
        tekstVakJaar.addActionListener(new TekstVakJaarListener());
        add(tekstVakJaar);




        tekst = "";
        dagInMaand = "";
        dagenInFebruari = "";



    }

    public void paint(Graphics g) {
        g.setFont(new Font("Helvetica", Font.PLAIN, 16));
        g.drawString(tekst, 50, 60);
        g.drawString(dagInMaand, 50, 80);
    }

    class TekstVakMaandListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstVakMaand.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
                case 1:
                    tekst = "januari";
                    dagInMaand = "er zitten 31 dagen in " + tekst;
                    break;
                case 2:
                    tekst = "februari";
                    dagInMaand = "voer een jaartal in om te zien hoeveel dagen februari heeft";
                    break;
                case 3:
                    tekst = "maart";
                    dagInMaand = "er zitten 31 dagen in " + tekst;
                    break;
                case 4:
                    tekst = "april";
                    dagInMaand = "er zitten 30 dagen in " + tekst;
                    break;
                case 5:
                    tekst = "mei";
                    dagInMaand = "er zitten 31 dagen in " + tekst;
                    break;
                case 6:
                    tekst = "juni";
                    dagInMaand = "er zitten 30 dagen in " + tekst;
                    break;
                case 7:
                    tekst = "juli";
                    dagInMaand = "er zitten 31 dagen in " + tekst;
                    break;
                case 8:
                    tekst = "augustus";
                    dagInMaand = "er zitten 31 dagen in " + tekst;
                    break;
                case 9:
                    tekst = "september";
                    dagInMaand = "er zitten 30 dagen in " + tekst;
                    break;
                case 10:
                    tekst = "oktober";
                    dagInMaand = "er zitten 31 dagen in " + tekst;
                    break;
                case 11:
                    tekst = "november";
                    dagInMaand = "er zitten 30 dagen in " + tekst;
                case 12:
                    tekst = "december";
                    dagInMaand = "er zitten 31 dagen in " + tekst;
                    break;

                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";

                    dagInMaand = "";

                    break;
            }
            repaint();
        }
    }

    class TekstVakJaarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstVakJaar.getText();
            jaartal = Integer.parseInt(s);
            schrikkelJjaar = (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0;
            if (maand == 2){


                if (!schrikkelJjaar) {
                    dagInMaand = "In het jaar "+ jaartal + " heeft februari 28 dagen" ;
                } else {
                    dagInMaand = "In het jaar " + jaartal + " heeft februari 29 dagen";
                }
            }
            repaint();

        }
    }

}