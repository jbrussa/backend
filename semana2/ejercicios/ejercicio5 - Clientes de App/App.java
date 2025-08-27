import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Crear un array para almacenar hasta 200 clientes
        Cliente[] clientes = new Cliente[200];
        int contadorClientes = -1;
        
        // Leer datos desde un archivo CSV
        try {
            File file = new File("clientes.csv"); 
            Scanner scanner = new Scanner(file);
            
            // Leer línea por línea
            while (scanner.hasNextLine() && contadorClientes < 200) {
                String linea = scanner.nextLine();
                
                if (contadorClientes == -1) {
                contadorClientes++;
                continue; // Saltar la línea de encabezado
                }

                // Dividir la línea usando la coma como delimitador
                String[] datos = linea.split(",");
                
                // Verificar que tengamos todos los datos necesarios
                if (datos.length >= 7) { 
                    try {
                        // Convertir los datos a los atributos correspondientes
                        String nombre = datos[0].trim();
                        int dni = Integer.parseInt(datos[1].trim());
                        short edad = Short.parseShort(datos[2].trim());
                        String ocupacion = datos[3].trim();
                        int cantidadPosteos = Integer.parseInt(datos[4].trim());
                        float horasEnPlataforma = Float.parseFloat(datos[5].trim());
                        boolean verificado = Boolean.parseBoolean(datos[6].trim());
                        
                        // Crear el objeto Cliente
                        clientes[contadorClientes] = new Cliente(nombre, dni, edad, ocupacion, cantidadPosteos, horasEnPlataforma, verificado);
                        contadorClientes++;
                                                
                    } catch (NumberFormatException e) {
                        System.err.println("Error al convertir datos en la línea: " + linea);
                        System.err.println("Error: " + e.getMessage());
                    }
                } else {
                    System.err.println("Línea con formato incorrecto: " + linea);
                }
            }
            
            
            scanner.close();
            
            System.out.println("\nTotal de clientes cargados: " + contadorClientes);
            
            // Mostrar todos los clientes cargados
            System.out.println("\n=== LISTA DE CLIENTES ===");
            for (int i = 0; i < 10; i++) {
                if (clientes[i] != null) {
                    System.out.println((i + 1) + ". " + clientes[i].toString());
                }
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("No se pudo encontrar el archivo cliente.csv");
            System.err.println("Asegúrate de que el archivo esté en la carpeta del proyecto");
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n=== RESULTADOS DE CÁLCULOS ===");
        CalculosArray calculos = new CalculosArray();
        System.out.println("Cantidad de clientes mayores de 25 años: " + calculos.contarMayoresDe(clientes, 25));
        System.out.println("Total de posteos realizados por todos los clientes: " + calculos.totalPosteos(clientes));
        System.out.println("Puntuación del primer cliente: " + calculos.calcularPuntuacion(clientes[0]));
        System.out.println("Puntuaciones de todos los clientes:" + calculos.calcularPuntuacion(clientes));
    }
}