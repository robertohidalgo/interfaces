/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparables;

/**
 *
 * @author Rober
 */
public class Rectangulo extends Forma{
    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto, String color, boolean relleno) {
        super(color, relleno);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double getArea() {
        return ancho*alto;
    }

    @Override
    public double getPerimetro() {
        return (ancho + alto) * 2;
    }

    @Override
    public String toString() {
        return "Ancho=" + ancho + " Alto=" + alto + " ";
    }
    
    
}
