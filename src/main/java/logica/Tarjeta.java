
package logica;

import java.awt.Color;
import javax.swing.JPanel;


public class Tarjeta extends JPanel{
    private int ancho;
    private int alto;
    private Color color;
    private TipoDificultad tipoDificultad;
    private boolean dibujado;
    private int i;
    private int j;
    
    public Tarjeta(int ancho, int alto, Color color){
        this.ancho=ancho;
        this.alto=alto;
        this.color=color;
        dibujado=false;
        init();
    }
   
    
    public void init(){
        setSize(ancho,alto);
        setBackground(color);
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TipoDificultad getTipoDificultad() {
        return tipoDificultad;
    }

    public void setTipoDificultad(TipoDificultad tipoDificultad) {
        this.tipoDificultad = tipoDificultad;
    }

    public boolean isDibujado() {
        return dibujado;
    }

    public void setDibujado(boolean dibujado) {
        this.dibujado = dibujado;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
    
    
    
    
}
