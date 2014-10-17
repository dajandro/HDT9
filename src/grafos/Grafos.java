/**
* Universidad del Valle de Guatemala
* Pablo Diaz 13203
* Daniel Orozco 1331
*/

package grafos;

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
        
        // Mostar camino mas corto entre nodos
        //System.out.println("La distancia mas corta entre nodos es: " + floyd.find();       
        
        // Encontrar ruta mas corta entre dos nodos
        System.out.println("La distancia mas corta entre 2 y 4 es: " + floyd.find(2,4));
    }
    
}
