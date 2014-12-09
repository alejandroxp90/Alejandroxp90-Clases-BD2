/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;


public class PersistenciaUsuario {
    
    public void guardarUsuario(Usuario u) throws Exception{
        File f=new File("C:\\Users\\Alejandro\\Downloads\\Lenguajes Orientados a Objetos\\ProyectoFinal\\Archivaldo.xxx");
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(u);
        System.out.println("Objeto Usuario Guardado");   
    }
    
    public Usuario leerusuario()throws Exception{
                 File f=new File("C:\\Users\\Alejandro\\Downloads\\Lenguajes Orientados a Objetos\\ProyectoFinal\\Archivaldo.xxx");
                 FileInputStream fis=new FileInputStream(f);
                 ObjectInputStream ois=new ObjectInputStream(fis);
                 Usuario u=(Usuario)ois.readObject();
                 System.out.println("Usuario recobrado");
                 return u;
    }

    Usuario leerUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
