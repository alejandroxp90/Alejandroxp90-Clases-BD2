/*

 */
package capitulo7.excepciones;

/**
 *
 * @author Alejandro
 */
public class ValoresNoNegativosException extends Exception{
    public ValoresNoNegativosException(){
        super("No acepto valores negativos");       
    }    
}
