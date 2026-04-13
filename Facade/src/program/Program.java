package program;

import clase.Facade;

public class Program {
    static void main(String[] args) {
        Facade rezervare = Facade.getInstanta();
        rezervare.rezervarePachetCazareTransport("Chatearoux", "Ville Fort");

        System.out.println("\n----------------------------------------------------------------------\n");

        Facade rezervare1 = Facade.getInstanta();
        rezervare1.rezervarePachetCazareTransport("Merlot", "Oparesti");


    }
}
