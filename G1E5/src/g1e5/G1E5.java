/*
 Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
 */
package g1e5;

import java.util.Scanner;

public class G1E5 {

    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      
        System.out.println("Ingrese un numero entero");
        
        int num = leer.nextInt();
        
        System.out.println("El doble de ese numero es: " + (num*2));
        System.out.println("El triple de ese numero es: " + (num*3));
        System.out.println("La raiz cuadrada de ese numero es: " + Math.sqrt(num));
    }
    
}
