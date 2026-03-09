package clase.builder.v2;

import aplicatie.interfata.builder.BuilderAbstract;
import clase.Masina;

public class MasinaBuilder2 implements BuilderAbstract {

    // versiunea 2 - atributele copiate in MasinaBuilder2
    private String fabricant;
    private String model;
    private int caiPutere;
    private String culoare;
    private boolean electrica;

    public MasinaBuilder2() {
        this.fabricant = "Automobile Dacia RO";
        this.model = "Dacia 1577";
        this.caiPutere = 77;
        this.culoare = "teal";
        this.electrica = false;
    }

    @Override
    public BuilderAbstract setFabricant(String fabricant) {
        this.fabricant = fabricant;
        return this;
    }

    @Override
    public BuilderAbstract setModel(String model) {
        this.model = model;
        return this;
    }
    @Override
    public BuilderAbstract setCaiPutere(int caiPutere) {
         this.caiPutere = caiPutere;
         return this;
    }
    @Override
    public BuilderAbstract setCuloare(String culoare) {
        this.culoare = culoare;
        return this;
    }
    @Override
    public BuilderAbstract setElectrica(boolean electrica) {
        this.electrica = electrica;
        return this;
    }
    @Override
    public Masina build() {
       return new Masina(fabricant,model,caiPutere,culoare,electrica);
    }
}
