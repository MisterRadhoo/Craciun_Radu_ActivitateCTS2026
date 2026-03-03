package aplicatie.componenta.clasa.abstracta;

public abstract class Componenta {
    protected String producator;
    protected String model;
    protected double nrVolti;    // u.m Volt / V
    protected double curentAdmis;   // u.m Ampere / A

    public Componenta(String producator, String model, double nrVolti, double curentAdmis) {
        this.producator = producator;
        this.model = model;
        this.nrVolti = nrVolti;
        this.curentAdmis = curentAdmis;
    }

    public double calculeazaPutereCurentElectric() {
        return this.nrVolti * this.curentAdmis;
    }

}
