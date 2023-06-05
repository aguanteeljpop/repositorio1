package g2e3;

import java.util.Scanner;

public class G1E3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Escriba una frase");
        
        String frase = leer.nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
