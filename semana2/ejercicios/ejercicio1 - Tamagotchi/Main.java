import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int opcion = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bienvenido a la aplicación de mascotas virtuales.\n");
        System.out.print("Ingrese el nombre para su mascota: ");
        String nombre = scanner.nextLine();
        Mascota miMascota = new Mascota(100 , 5, nombre);

        System.out.print("Felicitaciones !! Adoptaste a " + miMascota.getNombre() + "\n");

        while (opcion != 0) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Ver estado de la mascota");
            System.out.println("2. Alimentar mascota");
            System.out.println("3. Dar de beber a la mascota");
            System.out.println("4. Correr");
            System.out.println("5. Saltar");
            System.out.println("6. Dormir");


            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            // scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println(miMascota);
                    break;
                case 2:
                    miMascota.comer();
                    break;
                case 3:
                    miMascota.beber();
                    break;
                case 4:
                    miMascota.correr();
                    break;
                case 5:
                    miMascota.saltar();
                    break;
                case 6:
                    miMascota.dormir();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }   



        

        System.out.println("Estado inicial de la mascota:" + miMascota.getEnergia() + ", " + 
        miMascota.getHumor() + ", " + miMascota.getEstado()    );
    
        }
}