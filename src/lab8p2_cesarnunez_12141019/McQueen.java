
package lab8p2_cesarnunez_12141019;

import java.awt.Color;
import java.util.Random;


public class McQueen extends Auto{
    
    private Random rand = new Random();

    public McQueen() {
        super();
    }

    public McQueen(int numIdentificador, int distanciaRecorrida, int nombreCorredor, Color color) {
        super(numIdentificador, distanciaRecorrida, nombreCorredor, color);
    }

    @Override
    public int distanciaAleatoria() {
        return 30 + rand.nextInt(161);
    }
    
}
