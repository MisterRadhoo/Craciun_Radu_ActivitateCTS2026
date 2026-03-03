package aplicatie.componenta.clase;

import aplicatie.componenta.clasa.abstracta.Componenta;

public class RAM extends Componenta {

    public RAM(String producator, String model, double nrVolti, double curentAdmins) {
        super(producator, model, nrVolti, curentAdmins);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RAM{");
        sb.append("producator='").append(super.producator).append(" ");
        sb.append(", model = ").append(super.model).append(" ");
        sb.append(", nrVolti = ").append(super.nrVolti).append("Volti");
        sb.append(", curentAdmis = ").append(super.curentAdmis).append("A");
        sb.append(" } ");
        return sb.toString();
    }
}
