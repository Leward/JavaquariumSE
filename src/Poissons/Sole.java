package Poissons;

/**
 * Created by quentin on 31/01/2017.
 */
public class Sole extends Poisson implements Herbivore {
    public Sole(String nom, Genre genre) {
        super(nom, genre);
    }

    @Override
    public void mange(Algue algue) {

    }
}
