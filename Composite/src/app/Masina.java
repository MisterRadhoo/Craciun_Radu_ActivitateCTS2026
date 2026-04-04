package app;

// Nod frunza - are proprile atribute si metode
//            - nu implementeaza lista de copii
public class Masina implements INod {

    private String producator;
    private String model;
    private double caiPutere;

    public Masina(String producator, String model, double caiPutere) {
        this.producator = producator;
        this.model = model;
        this.caiPutere = caiPutere;
    }
    @Override
    public void adaugaNod(INod nod) {
        throw  new UnsupportedOperationException("Metoda adaugaNod nu este implementata!");

    }

    @Override
    public void stergeNod(INod nod){
        throw  new UnsupportedOperationException("Metoda stergeNod nu este implementata!");
    }

    @Override
    public INod getNod(int index) {
        return null;
    }
    @Override
    public String getProducator() {
        return this.producator;
    }
    @Override
    public String getModel() {
        return this.model;
    }
    @Override
    public double getCaiPutere() {
        return this.caiPutere;
    }
    @Override
    public void printeaza() {
        System.out.println("Producator: " + producator + " model: " + model + " caiPutere: " + caiPutere);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("producator='").append(producator).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", caiPutere=").append(caiPutere);
        sb.append('}');
        return sb.toString();
    }
}
