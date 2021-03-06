package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht103 extends Applet {
    TextField tekstVakMaand;

    Label labelMaand;

    String s, tekst, dagInMaand;

    int maand;

    Font font;


    public void init() {

        font = new Font("", Font.PLAIN,16);

        labelMaand = new Label("Type het maandnummer en druk op enter");
        add(labelMaand);
        labelMaand.setFont(font);

        tekstVakMaand = new TextField("", 2);
        tekstVakMaand.addActionListener(new TekstVakMaandListener());
        add(tekstVakMaand);


        tekst = "";
        dagInMaand = "";


    }

    public void paint(Graphics g) {
        g.setFont(new Font("", Font.PLAIN, 16));
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
                    dagInMaand = "er zitten 28 0f 29 dagen in " + tekst;

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


}

