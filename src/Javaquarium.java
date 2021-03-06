import Aquarium.Aquarium;

/**
 * Created by quentin on 31/01/2017.
 */
public class Javaquarium {

    public static void main(String[] args) {
        System.out.println("Démarrage de l'aquarium");
        //Aquarium aquarium = new Aquarium(10, 5);
        Aquarium aquarium = Aquarium.getInstance();
        aquarium.initAquarium(10,5);

        System.out.println("NB poissons : " + aquarium.getPoissons().size());
        System.out.println("NB Algues : " + aquarium.getAlgues().size());

        aquarium.getPoissons().forEach(System.out::println);

        aquarium.newTour();
    }
}
