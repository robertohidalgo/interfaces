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
public abstract class Forma {
    protected String color;
    protected boolean relleno;
    
    public Forma(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }
    
    public abstract double getArea();
    public abstract double getPerimetro();
}
