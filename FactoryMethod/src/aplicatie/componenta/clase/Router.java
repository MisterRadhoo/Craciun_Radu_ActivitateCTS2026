package aplicatie.componenta.clase;

import aplicatie.componenta.clasa.abstracta.Componenta;

public class Router extends Componenta {

    public Router(String producator,String model, double nrVolti, double curentAdmis) {
        super (producator,model, nrVolti, curentAdmis);

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Router{");
        sb.append("producator='").append(super.producator).append(" ");
        sb.append(", model = ").append(super.model).append(" ");
        sb.append(", nrVolti = ").append(super.nrVolti).append("Volti");
        sb.append(", curentAdmis = ").append(super.curentAdmis).append("A");
        sb.append(" } ");
        return sb.toString();
    }
}
