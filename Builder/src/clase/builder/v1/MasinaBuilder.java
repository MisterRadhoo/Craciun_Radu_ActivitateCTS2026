package clase.builder.v1;

import aplicatie.interfata.builder.BuilderAbstract;
import clase.Masina;

public class MasinaBuilder implements BuilderAbstract {

    // versiunea 1 cu instanta;
    private Masina masina = null;

    public MasinaBuilder() {
        this.masina = new Masina();
    }

    @Override
    public BuilderAbstract setFabricant(String fabricant) {
        this.masina.setFabricant(fabricant);
        return this;
    }

    @Override
    public BuilderAbstract setModel(String model) {
        this.masina.setModel(model);
        return this;
    }

    @Override
    public BuilderAbstract setCaiPutere(int caiPutere) {
        this.masina.setCaiPutere(caiPutere);
        return this;
    }

    @Override
    public BuilderAbstract setCuloare(String culoare) {
        this.masina.setCuloare(culoare);
        return this;
    }

    @Override
    public BuilderAbstract setElectrica(boolean electrica) {
        this.masina.setElectrica(electrica);
        return this;
    }
    @Override
    public Masina build() {
        return masina;    // va returna obiectul construit, de tip Masina
    }
}
