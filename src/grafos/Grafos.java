/**
* Universidad del Valle de Guatemala
* Pablo Diaz 13203
* Daniel Orozco 1331
*/

package grafos;

import java.util.Random;

/**
 *
 * @author Daniel Orozco <daniel.orozco>
 */
public class Grafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        // Crear objeto
        Floyd floyd = new Floyd();       
             
        // Mostrar conexión entre nodos
        System.out.println(floyd.toString());
        
    }
    
}