package grafos;

import java.util.Random;

/**
* Universidad del Valle de Guatemala
* Pablo Diaz 13203
* Daniel Orozco 1331
*/

/**
 *
 * @author Daniel Orozco <daniel.orozco>
 */
public class Floyd {
    
    // Variable para tamaño
    private final int size = 10;
    // Crear matriz de incidencia
    private long [][] adyacencia = new long[size][size];
    // Random
    Random rnd = new Random();
    
    public Floyd()
    {
        int i,j;
        for(i = 0; i < size; i++)
            for (j = 0; j < size; j++)
            {
                if (i == j)
                    adyacencia[i][j] = 0;
                // Si no hay conexión entre vertices se pone un valor "infinito" <99999999999>
                // Si hay conexión entre vertices se pone el "peso"
                else
                {
                    // Números entre 1 y 50
                    adyacencia[i][j] = (long)(rnd.nextInt(51));
                }
            }
        // Valores arbitrarios de no conexión
        int t1 = 0;
        int t2 = 0;        
        
        for (i = 0; i<10; i++)
        {
            t1 = rnd.nextInt(10);
            t2 = rnd.nextInt(10);
            while (t2 == t1)
                t2 = rnd.nextInt(11);
            adyacencia[t1][t2] = 9999999;
        }
    }
    
    public String toString()
    {
        String res = "    ";
        for (int i = 0; i < adyacencia.length; i++)
            if (i<9)
                res += Integer.toString(i) + " - ";
            else 
                res += Integer.toString(i);
        res += "\n";
        for (int i = 0; i < adyacencia.length; i++)
        {
            res += Integer.toString(i) + " | ";
            for (int j = 0; j < adyacencia.length; j++)
                res += Long.toString(adyacencia[i][j]) + " ";
            res += "\n";                        
        }
        return res;
    }    
}
