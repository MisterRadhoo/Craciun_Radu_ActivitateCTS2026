package aplicatie.componenta.factory;

import aplicatie.componenta.clasa.abstracta.Componenta;
import aplicatie.componenta.clase.Router;

public class RouterFactory  implements FactoryAbstracta {
    @Override
    public Componenta creareComponenta(String producator, String model, double nrVolti, double curentAdmins) {
        return new Router(producator,model,nrVolti,curentAdmins);
    }
}
