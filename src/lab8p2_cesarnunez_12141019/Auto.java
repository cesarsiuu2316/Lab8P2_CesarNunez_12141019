package lab8p2_cesarnunez_12141019;

import java.awt.Color;

public class Auto {
    
    private int numIdentificador, distanciaRecorrida = 0;
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
    
    public int distanciaAleatoria(){
        return 0;        
    }
        
}
