
package lab8p2_cesarnunez_12141019;

import java.awt.Color;
import java.io.Serializable;
import java.util.Random;


public class McQueen extends Auto implements Serializable{
    
    private Random rand = new Random();

    public McQueen() {
        super();
    }

    public McQueen(int numIdentificador, String nombreCorredor, Color color) {
        super(numIdentificador, nombreCorredor, color);
    }

    @Override
    public int distanciaAleatoria() {
        return 30 + rand.nextInt(161);
    }
    
}
