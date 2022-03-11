
package lab8p2_cesarnunez_12141019;

import java.awt.Color;
import java.util.Random;


public class Convertible extends Auto {
    
    private Random rand = new Random();

    public Convertible() {
        super();
    }

    public Convertible(int numIdentificador, String nombreCorredor, Color color) {
        super(numIdentificador, nombreCorredor, color);
    }

    @Override
    public int distanciaAleatoria() {
        return 20 + rand.nextInt(181);
    }
    
}
