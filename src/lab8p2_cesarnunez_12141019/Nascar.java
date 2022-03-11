package lab8p2_cesarnunez_12141019;

import java.awt.Color;
import java.util.Random;


public class Nascar extends Auto{
    
    private Random rand = new Random();

    public Nascar() {
        super();
    }

    public Nascar(int numIdentificador, int distanciaRecorrida, int nombreCorredor, Color color) {
        super(numIdentificador, distanciaRecorrida, nombreCorredor, color);
    }

    @Override
    public int distanciaAleatoria() {
        return 40 + rand.nextInt(141);
    }
    
}