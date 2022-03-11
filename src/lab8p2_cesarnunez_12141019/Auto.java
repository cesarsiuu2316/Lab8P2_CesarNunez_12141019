package lab8p2_cesarnunez_12141019;

import java.awt.Color;
import java.util.Random;

public class Auto {
    
    private int numIdentificador, distanciaRecorrida, nombreCorredor;
    private Color color;
    private Random rand = new Random();

    public Auto() {
    }

    public Auto(int numIdentificador, int distanciaRecorrida, int nombreCorredor, Color color) {
        this.numIdentificador = numIdentificador;
        this.distanciaRecorrida = distanciaRecorrida;
        this.nombreCorredor = nombreCorredor;
        this.color = color;
    }

    public int getNumIdentificador() {
        return numIdentificador;
    }

    public void setNumIdentificador(int numIdentificador) {
        this.numIdentificador = numIdentificador;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public int getNombreCorredor() {
        return nombreCorredor;
    }

    public void setNombreCorredor(int nombreCorredor) {
        this.nombreCorredor = nombreCorredor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public int distanciaAleatoria(){
        return 0;        
    }
        
}
