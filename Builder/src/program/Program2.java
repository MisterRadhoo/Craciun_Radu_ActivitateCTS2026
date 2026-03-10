package program;

import clase.MasinaFinal;

public class Program2 {

    public static void main(String[] args) {

        MasinaFinal masinaFinal = new MasinaFinal.Builder()
                .setFabricant("Mitsubishi")
                .setModel("Evo Lancer")
                .setCaiPutere(123)
                .setCuloare("Dark")
                .setElectrica(false).build();

        System.out.println("MasinaFinal object: builder: " + masinaFinal.toString());

    }
}
