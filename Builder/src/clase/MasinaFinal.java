package clase;

import aplicatie.interfata.builder.BuilderAbstract2;

public class MasinaFinal {

    private String fabricant;
    private String model;
    private int caiPutere;
    private String culoare;
    private boolean electrica;

    public MasinaFinal(String fabricant, String model, int caiPutere,  String culoare,  boolean electrica) {
        this.fabricant = fabricant;
        this.model = model;
        this.caiPutere = caiPutere;
        this.culoare = culoare;
        this.electrica = electrica;
    }

    public static class Builder implements BuilderAbstract2 {
        private String fabricant;
        private String model;
        private int caiPutere;
        private String culoare;
        private boolean electrica;

        @Override
        public BuilderAbstract2 setFabricant(String fabricant) {
            this.fabricant = fabricant;
            return this;
        }
        @Override
        public BuilderAbstract2 setModel(String model) {
            this.model = model;
            return this;
        }

        @Override
        public BuilderAbstract2 setCaiPutere(int caiPutere) {
            this.caiPutere = caiPutere;
            return this;
        }
        @Override
        public BuilderAbstract2 setCuloare(String culoare) {
            this.culoare = culoare;
            return this;
        }
        @Override
        public BuilderAbstract2 setElectrica(boolean electrica) {
            this.electrica = electrica;
            return this;
        }
        @Override
        public MasinaFinal build() {
            return new MasinaFinal(fabricant, model, caiPutere,culoare, electrica);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" MasinaFinal { ");
        sb.append("fabricant = ").append(fabricant).append(" ");
        sb.append(", model = ").append(model).append(" ");
        sb.append(", caiPutere = ").append(caiPutere);
        sb.append(", culoare = ").append(culoare).append(" ");
        sb.append(", electrica = ").append(electrica);
        sb.append(" } ");
        return sb.toString();
    }
}
