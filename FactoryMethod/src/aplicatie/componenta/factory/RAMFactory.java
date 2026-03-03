package aplicatie.componenta.factory;

import aplicatie.componenta.clasa.abstracta.Componenta;
import aplicatie.componenta.clase.RAM;

public class RAMFactory implements FactoryAbstracta {
    @Override
    public Componenta creareComponenta(String producator, String model, double nrVolti, double curentAdmis) {
        return new RAM(producator,model,nrVolti,curentAdmis);
    }
}
