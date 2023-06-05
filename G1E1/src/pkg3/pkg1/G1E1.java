package pkg3.pkg1;

import java.util.Scanner;

public class G1E1 {

    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese un numero");
        
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese otro numero");
        
        int num2 = leer.nextInt();
        
        int num3 = num1 + num2;
        
        System.out.print("La suma de los numeros ingresados es: ");
        System.out.println(num3);
    }
   
}
