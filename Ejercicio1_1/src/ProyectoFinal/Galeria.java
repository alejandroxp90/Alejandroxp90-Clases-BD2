/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;
import java.util.ArrayList;
/**
 *
 * @author Alejandro
 */
public class Galeria {
    
    ArrayList<Imagensita>imagenes;

    public Galeria() {
        imagenes=new ArrayList<Imagensita>();
        Imagensita i1=new Imagensita();
        
        i1.setUrl("/javaapplication1/Angel2.png");
        i1.setTitulo("Angel de Soledad");
        i1.setDescripcion("Arte, para poder alzar la tristeza de los seres supremos, donde todos tenemos soledad hasta los angeles" + "Luna Lunera");
        
                Imagensita i2=new Imagensita();
        
        i2.setUrl("/javaapplication1/Angel.png");
        i2.setTitulo("Angel de la muerte");
        i2.setDescripcion("Arte, para poder alzar la muerte de los seres humanos, donde todos tenemos que llegar Seol" + "jajajaja");
        
              Imagensita i3=new Imagensita();
        
        i3.setUrl("/javaapplication1/Alien.png");
        i3.setTitulo("Alien Matrix");
        i3.setDescripcion("Alien que describe la superioridad de que existe algo o alguien en este universo");
        
        
              Imagensita i4=new Imagensita();
        
        i4.setUrl("/javaapplication1/Angel3.png");
        i4.setTitulo("Angel de la divino");
        i4.setDescripcion("Arte, divinidad jajajajaja ");
        
              Imagensita i5=new Imagensita();
        
        i5.setUrl("/javaapplication1/Gato.png");
        i5.setTitulo("Gato de la Oscuridad");
        i5.setDescripcion("Arte, representa la mala suerte donde se demuestran el temor y debilidad de la raza humana ");
        
        imagenes.add(i1);
        imagenes.add(i2);
        imagenes.add(i3);
        imagenes.add(i4);
        imagenes.add(i5);
        
        
    }

    public ArrayList<Imagensita> LeerTodas() {
        return imagenes;
    }

    public void setImagenes(ArrayList<Imagensita> imagenes) {
        this.imagenes = imagenes;
    }
    
    
    
    
}
