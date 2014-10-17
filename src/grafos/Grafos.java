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
        
        // Encontrar caminos mas cortos
        floyd.find();
        
        // Mostar camino mas corto entre nodos
        System.out.println(floyd.caminos());
        
        // Encontrar ruta mas corta entre dos nodos
        System.out.println(floyd.caminoIF(2, 4));
        System.out.println(floyd.caminoIF(3, 3));
        System.out.println(floyd.caminoIF(9, 1));
        System.out.println(floyd.caminoIF(9, 5));
    }
    
}
