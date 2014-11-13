package com.superficies;

/**
 *
 * @author Alejandro
 */
public class ProbarAreas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PRIMERO CREAMOS UN CUADRADO
        Cuadrado d=new Cuadrado();
                 d.setLado(5);
                 
        //El siguiente objeto es el area
                 Area a=new Area(d);
                 System.out.println(a.calcular());
                 
    }
    
}
