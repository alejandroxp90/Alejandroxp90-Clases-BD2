/*
automatico en la clase mamifero se poran usar los atributosy los metodos. menos
los constructores, esos no se heredan.
 */
package Herencia;

/**
 *
 * @author Alejandro
 */
public class ProbarAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Mamifero perro=new Mamifero();
        perro.setNombre("Ludovico");
        System.out.println("Mi perro se llama:"+perro.getNombre());
    }
    
}

/*
PASOS PARA CREAR UNA EXCEPCION EN JAVA
1. CREAR LA CLASE QUE CONTENGA LA REGLA
2. A ESA CLASE HEREDARLE LA CLASE EXCEPTION
3. IMPLEMENTAR LA EXCEPCION EN TU CODIGO DE APLICACION
*/