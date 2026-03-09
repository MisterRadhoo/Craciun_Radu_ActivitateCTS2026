package clase;

public class Masina {

    private String fabricant;
    private String model;
    private int caiPutere;
    private String culoare;
    private boolean electrica;

    public Masina() {
        this.fabricant = "Automobile Dacia S.A.";
        this.model = "Dacia 1301 Lux Super";
        this.caiPutere = 54;
        this.culoare = "negru";
        this.electrica = false;
    }

    public Masina(String fabricant, String model, int caiPutere, String culoare, boolean electrica) {
        this.fabricant = fabricant;
        this.model = model;
        this.caiPutere = caiPutere;
        this.culoare = culoare;
        this.electrica = electrica;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCaiPutere(int caiPutere) {
        this.caiPutere = caiPutere;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina { ");
        sb.append("fabricant = ").append(fabricant).append(" ");
        sb.append(", model = ").append(model).append(" ");
        sb.append(", caiPutere = ").append(caiPutere);
        sb.append(", culoare = ").append(culoare).append(" ");
        sb.append(", electrica = ").append(electrica);
        sb.append(" } ");
        return sb.toString();
    }
}
