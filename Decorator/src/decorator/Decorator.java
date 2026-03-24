package decorator;

import clase.IMagazin;


// Decorator clasa abstracta
public abstract class Decorator implements IMagazin {

    protected IMagazin magazin;

    public Decorator(IMagazin magazin) {
        this.magazin = magazin;
    }

    @Override
    public void printeazaMagazin() {
        magazin.printeazaMagazin();
        System.out.println("Open for business!");
    }

    public abstract void afisarePromotie();

}
