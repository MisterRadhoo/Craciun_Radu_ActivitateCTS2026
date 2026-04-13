package clase;

public class Facade {

    // corelatie cu Singleton
    private static Facade instanta = null;

    private Facade() {

    }

    public static synchronized Facade getInstanta() {
        if(instanta == null) {
            instanta = new Facade();
        }
        return instanta;
    }

    public void rezervarePachetCazareTransport (String orasPlecare, String orasDestinatie ) {
        CompanieAeriana companieAeriana = new CompanieAeriana("Le France du AirLines");
        Zbor zborDus = companieAeriana.rezervareBiletAvion(orasPlecare, orasDestinatie);
        Zbor zborIntors = companieAeriana.rezervareBiletAvion(orasDestinatie, orasPlecare);


        Hotel hotel = new Hotel("Panoramic");
        System.out.println(zborDus.toString());
        System.out.println(zborIntors.toString());
        hotel.rezervaCamera(orasDestinatie);


        // sesiunea 2
        CompanieAeriana companieAeriana1 = new CompanieAeriana("RoAirLines");
        Zbor zborDus1 = companieAeriana1.rezervareBiletAvion(orasPlecare, orasDestinatie);
        Zbor zborIntors1 = companieAeriana1.rezervareBiletAvion(orasDestinatie, orasPlecare);

        Hotel hotel1 = new Hotel("L'Hotel Copaque");
        System.out.println(zborDus1.toString());
        System.out.println(zborIntors1.toString());
        hotel1.rezervaCamera(orasDestinatie);

    }
}
