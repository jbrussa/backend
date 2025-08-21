
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("numeros.txt");
        Scanner miEscaner = new Scanner(f);
        int suma = 0;
        int cantidad = 0;
        int pares = 0;
        int impares = 0;
        
        try {

            while (miEscaner.hasNext()) {
                if (miEscaner.hasNextInt()) {
                    // Es un número entero, lo procesamos
                    int numero = miEscaner.nextInt();
                    suma += numero;
                    cantidad += 1;
                    if (numero % 2 == 0) {
                        pares += 1;
                    } else {
                        impares += 1;
                    }
                } else {
                    // No es un número entero, lo saltamos
                    String textoIgnorado = miEscaner.next();
                }
            }
            
            // Mostrar resultados finales
            System.out.println("\n=== RESULTADOS FINALES ===");
            System.out.println("Total de números leídos: " + cantidad);
            System.out.println("Suma: " + suma);
            if (cantidad > 0) {
                System.out.println("Promedio: " + (double)suma/cantidad);
            }
            System.out.println("Pares: " + pares);
            System.out.println("Impares: " + impares);
            
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            miEscaner.close();
        }
    }
}