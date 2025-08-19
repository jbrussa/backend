import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        
    Scanner scanner = new Scanner(System.in);
    String numero;
    int[] x = new int[14];
    
   
    System.out.print("Ingrese un número ISBN: ");
    numero = scanner.nextLine();
    numero = numero.replaceAll("-", ""); // Eliminar guiones del ISBN    

    for (int i = 0; i < numero.length(); i++) {
        if (numero.charAt(i) != '-' ) {
           x[i+1] = Character.getNumericValue(numero.charAt(i));
        } 
    }

    if ((x[1] * 10 + x[2] * 9 + x[3] * 8 + x[4] * 7 + x[5] * 6 + x[6] * 5 + x[7] * 4 + x[8] * 3 + x[9] * 2 + x[10] * 1) % 11 == 0){
        System.out.println("El número ISBN es válido.");
    } else {
        System.out.println("El número ISBN no es válido.");

    };

    scanner.close();
    System.out.println("Fin del programa.");
}
}  