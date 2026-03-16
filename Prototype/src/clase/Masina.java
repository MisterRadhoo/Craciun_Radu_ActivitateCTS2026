package clase;

import app.Prototype;

public class Masina implements Prototype {
    private String producator;
    private String model;
    private int caiPutere;
    private int anProductie;

    public Masina(String producator, String model, int caiPutere, int anProductie) {
        if(producator.startsWith("BMW")) {
            throw new IllegalArgumentException("Nu se pot fabrica modele cu nume de producator BMW");
        }
        this.producator = producator;

        if(model.length() < 4) {
            throw new IllegalArgumentException("Model trebuie sa aiba mai mult de 4 caractere");
        }
        this.model = model;

        if(caiPutere <= 25) {
            throw new IllegalArgumentException("Nu se pot fabrica masini sub 25 caiPutere");
        }
        this.caiPutere = caiPutere;
        this.anProductie = anProductie;
    }

    private Masina() {}

    public void setAnProductie(int anProductie) {
        this.anProductie = anProductie;
    }

    @Override
    public Prototype copiere() {
        Masina masina = new Masina();
        masina.producator = this.producator;
        masina.model = this.model;
        masina.caiPutere = this.caiPutere;
        masina.anProductie = this.anProductie;
        return masina;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina {");
        sb.append("producator = ").append(producator).append(" ");
        sb.append(", model = ").append(model).append(" ");
        sb.append(", caiPutere = ").append(caiPutere);
        sb.append(", anProductie = ").append(anProductie);
        sb.append(" } ");
        return sb.toString();
    }
}
