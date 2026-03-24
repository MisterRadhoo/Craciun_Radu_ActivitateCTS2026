package program;

import clase.IMagazin;
import clase.Magazin;
import decorator.Decorator;
import decorator.MagazinDecorator;

public class Program {

    static void main(String[] args) {
        IMagazin magazin  = new Magazin("Famous Brands", "Calea victoriei nr.22", 124);
       // magazin.printeazaMagazin();

        Decorator magazinDecorator = new MagazinDecorator(magazin);
        magazinDecorator.printeazaMagazin();

        magazinDecorator.afisarePromotie();
    }

}
