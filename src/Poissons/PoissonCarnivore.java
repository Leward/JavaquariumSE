package Poissons;

/**
 * Created by quentin on 31/01/2017.
 */
public abstract class PoissonCarnivore extends Poisson {

    public PoissonCarnivore(String nom, Genre genre) {
        super(nom, genre);
    }

    public void mange(Poisson poisson) {

    }
}