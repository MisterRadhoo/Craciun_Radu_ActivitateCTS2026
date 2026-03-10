package aplicatie.interfata.builder;

import clase.MasinaFinal;

public interface BuilderAbstract2 {

     MasinaFinal build();   // va returna un obiect construit de tip MasinaFinal

    BuilderAbstract2 setFabricant(String fabricant);
    BuilderAbstract2 setModel(String model);
    BuilderAbstract2 setCaiPutere(int caiPutere);
    BuilderAbstract2 setCuloare(String culoare);
    BuilderAbstract2 setElectrica(boolean electricat);
}
