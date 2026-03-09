package program;

import aplicatie.interfata.builder.BuilderAbstract;
import clase.Masina;
import clase.builder.v1.MasinaBuilder;
import clase.builder.v2.MasinaBuilder2;

public class Program {
    public static void main(String[] args) {

        Masina masina1 = new Masina();
        System.out.println(("1.Constructor implicit: " + masina1.toString()));

        Masina masina2 = new Masina("Tesla", "TeslaVolt 67", 45, "alba", true );
        System.out.println(("2.Constructor cu parametrii: " + masina2.toString()));

        System.out.println("\nMasina builder instante: \n");

        BuilderAbstract builder = new MasinaBuilder();
        Masina masina3 = builder
                .setFabricant("Automobile Dacia S.A. Electric")
                .setModel("Dacia 1410")
                .setCaiPutere(49)
                .setCuloare("albastru")
                .setElectrica(true)
                .build();

         Masina masina4 = new MasinaBuilder().setCuloare("dark mocha").setCaiPutere(78).build();

        System.out.println("Masina 3 buidler: => "+ masina3.toString());
        System.out.println("Dacia lux sport: " + masina4.toString());


         //builder v2: atributele copiate
         BuilderAbstract builder2 = new MasinaBuilder2();
         Masina masina5 = builder2
                 .setFabricant("Dacia Rambler")
                         .setModel("Rambler Ro")
                                 .setCaiPutere(55)
                                         .setElectrica(false).build();

        System.out.println("Builder: V2 "+ masina5.toString());
    }
}
