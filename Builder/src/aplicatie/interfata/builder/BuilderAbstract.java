package aplicatie.interfata.builder;

import clase.Masina;

public interface BuilderAbstract {

    Masina build();   // va returna un obiect de tip Masina, construieste obiectul instantiat

    BuilderAbstract setFabricant(String fabricant);

    BuilderAbstract setModel(String model);
    BuilderAbstract setCaiPutere(int caiPutere);

    BuilderAbstract setCuloare(String culoare);

    BuilderAbstract setElectrica(boolean electrica);
}
