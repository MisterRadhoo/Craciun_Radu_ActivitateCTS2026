package aplicatie.componenta.factory;

import aplicatie.componenta.clasa.abstracta.Componenta;
import aplicatie.componenta.clase.PlacaDeBaza;

public class PlacaDeBazaFactory implements FactoryAbstracta{
    @Override
    public Componenta creareComponenta(String producator, String model, double nrVolti, double curentAdmins) {
        return new PlacaDeBaza(producator,model, nrVolti, curentAdmins);
    }
}
