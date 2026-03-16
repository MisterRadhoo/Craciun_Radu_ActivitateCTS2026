package main;

import app.Prototype;
import clase.Masina;

public class Program {
    static void main(String[] args) {
        Prototype masina1 = new Masina("Audi",  "Audi88-Fast", 56, 2024);

        Prototype masina2 = masina1.copiere();
        ((Masina)masina2).setAnProductie(1987);

        System.out.println(masina1.toString());
        System.out.println("Prototype copiere: " + masina2.toString());
    }
}
