package g1e4;

import java.util.Scanner;

public class G1E4 {
    /*Dada una cantidad de grados centígrados se debe mostrar su
    equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
    + (9 * C / 5).
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                
        System.out.println("Ingrese una cantidad de grados centígrados");
        
        int grados = leer.nextInt();
        
        grados = ((grados * 9 /5) + 32);
        
        System.out.println("Equivale a " + grados + " grados Fahrenheit");
    }
    
}
