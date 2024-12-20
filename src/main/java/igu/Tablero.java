
package igu;

import java.awt.Color;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.JPanel;
import logica.Tarjeta;

public class Tablero extends JPanel {
    private int ancho;
    private int alto;
    private int margen;
    private Color colorTablero;
    private Color colorCI;
    //private TipoImagen jugadorActual;
    //private TipoImagen turnoPartida;
    
    //private Jugador jugador1;
    //private Jugador jugador2;
    
    private ArrayList<Tarjeta> tarjetas;
    private Tarjeta tarjetaFrontal;
    
    
    public Tablero(){
        init();
    }
    private void init(){
        //Se inicia con valores por defectos que luego seran reemplazados
        ancho=80;
        alto=80;
        colorTablero=Color.white;
        colorCI=Color.white;
        margen=6;
        //jugador1=new Jugador();
        //jugador2=new Jugador();
        
        //Instanciamos la lista que vamos a usar para referenciar los cuadrados
        tarjetas=new ArrayList();
        
    }
    
    public void crearTablero(){
        setLayout(null);
        setSize(ancho*2+margen*3,alto*2+margen*3);
        setBackground(colorTablero);
        tarjetaFrontal=new Tarjeta(this.getWidth(),this.getHeight(),Color.RED);
        tarjetaFrontal.setLocation(0,0);
        tarjetaFrontal.setOpaque(false);
        tarjetaFrontal.setEnabled(false);
        add(tarjetaFrontal);
        
        //llamamos al metodo para crear los cuadrados internos
        crearTarjetas();
    }
    
        private void crearTarjetas(){
        int x=margen;
        int y=margen;
        
        for(int i=0;i<2;i++){
            x=margen;
            for(int j=0;j<2;j++){
                Tarjeta tarjeta=new Tarjeta(ancho,alto,colorCI);
                
                //usamos este metodo para que nuestro mouse se combierta en manito
                //al pasar por encima de cada cuadro
                tarjeta.setCursor(new Cursor(Cursor.HAND_CURSOR));
                tarjeta.setLocation(x,y);
                tarjeta.setI(i);
                tarjeta.setJ(j);
                add(tarjeta);
                tarjetas.add(tarjeta);
                
                //creamos los eventos de los cuadrados
                //crearEventosTarjetas(tarjeta);
                x+=(ancho+margen);
            }
            y+=(alto+margen);
        }
    }

    public Color getColorTablero() {
        return colorTablero;
    }

    public void setColorTablero(Color colorTablero) {
        this.colorTablero = colorTablero;
    }

    public Color getColorCI() {
        return colorCI;
    }

    public void setColorCI(Color colorCI) {
        this.colorCI = colorCI;
    }

    public Tarjeta getTarjetaFrontal() {
        return tarjetaFrontal;
    }

    public void setTarjetaFrontal(Tarjeta tarjetaFrontal) {
        this.tarjetaFrontal = tarjetaFrontal;
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

    public int getMargen() {
        return margen;
    }

    public void setMargen(int margen) {
        this.margen = margen;
    }

    public ArrayList<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

   
    
    
    
}
