package app;

import java.util.ArrayList;
import java.util.List;

// nod compus - poate avea node copii
public class Colectie  implements  INod {

       private String nume;
       private List<INod>  listCopiiMasina;


       public Colectie(String nume) {
           this.nume = nume;
           listCopiiMasina = new ArrayList<INod>();
       }
       @Override
       public double getCaiPutere() {
           return listCopiiMasina.stream().mapToDouble(INod::getCaiPutere).sum();
       }
       @Override
       public String getProducator() {
           return listCopiiMasina.stream().map(INod::getProducator).filter(nod-> nod.equals("Dacia")).findFirst().orElse("");
       }
       @Override
       public  String getModel() {
           return null;
       }

       @Override
       public void adaugaNod(INod nod) {
           this.listCopiiMasina.add(nod);
       }
       @Override
       public void stergeNod(INod nod) {
           this.listCopiiMasina.remove(nod);
       }
       @Override
       public INod getNod(int index) {
           return this.listCopiiMasina.get(index);
       }

       @Override
       public void printeaza() {
           System.out.println("Colectia: " + nume);
           for(INod nod: listCopiiMasina) {
               nod.printeaza();
           }
       }

}
