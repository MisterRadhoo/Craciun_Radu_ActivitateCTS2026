package program;

import eager_init_app.Magazin2;
import lazy_init_app.Magazin;
import lazy_init_app.Magazin3;


public class Program {

    public static void main(String[] args) {
        // Magazin1
        Magazin magazin1 = Magazin.getInstanta();
        Magazin magazin2 = Magazin.getInstanta();
        System.out.println("M1: " + magazin2.toString());
        System.out.println(magazin1.toString());

        // Magazin2;
        Magazin2 mag2 =  Magazin2.getInstanta();
        mag2.setAdresa("Calea Victoriei nr.14");
       // System.out.println(mag2.getAdresa());
        mag2.setNumarAngajati(12);
        mag2.setCapital(500000.00);
        mag2.setNumeMagazin("Tech Savvy");
        System.out.println("M: " + mag2);

        //Magazin3
        Magazin3 mag3 = Magazin3.getInstanta("", "Str. Franceza 88D", 0, 0);
        mag3.setNumeMagazin("Zod Power Tech");
        mag3.setCapital(9000000.00);
        mag3.setNumarAngajati(5);

        System.out.println("M: "+ mag3);
    }
}


