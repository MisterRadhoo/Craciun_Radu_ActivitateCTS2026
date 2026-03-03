package aplicatie.componenta.factory;

import aplicatie.componenta.clasa.abstracta.Componenta;

public interface FactoryAbstracta {

    Componenta creareComponenta(String producator, String model, double nrVolti, double curentAdmis);
}
