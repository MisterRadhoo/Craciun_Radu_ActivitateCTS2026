package decorator;

import clase.IMagazin;

public class MagazinDecorator extends Decorator {

    public MagazinDecorator(IMagazin magazin) {
        super(magazin);
    }

    @Override
    public void afisarePromotie() {
        System.out.println("La deschidere magazinul are 20% la orice produs.");

    }
}
