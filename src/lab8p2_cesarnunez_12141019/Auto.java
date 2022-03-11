package lab8p2_cesarnunez_12141019;

import java.awt.Color;
import java.io.Serializable;

public abstract class Auto implements Serializable{
    
    private int numIdentificador = 0, distanciaRecorrida = 0;
    private String nombreCorredor;
    private Color color;

    public Auto() {
    }

    public Auto(int numIdentificador, String nombreCorredor, Color color) {
        this.numIdentificador = numIdentificador;
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

    public String getNombreCorredor() {
        return nombreCorredor;
    }

    public void setNombreCorredor(String nombreCorredor) {
        this.nombreCorredor = nombreCorredor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public abstract int distanciaAleatoria();

    @Override
    public String toString() {
        return "" + numIdentificador;
    }
    
    
        
}
