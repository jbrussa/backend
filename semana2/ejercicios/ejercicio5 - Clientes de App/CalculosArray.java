public class CalculosArray {

    public int contarMayoresDe(Cliente[] array, int edad) {
        int cantidadClientes = 0;
        for (int i = 0; i < array.length; i++) {
            Cliente cliente = array[i];
             if (cliente != null && cliente.getEdad() > edad) {
                cantidadClientes++;
            }
        }
        return cantidadClientes;
    }

    public int totalPosteos(Cliente[] array) {
        int totalPosteos = 0;
        for (int i = 0; i < array.length; i++) {
            Cliente cliente = array[i];
             if (cliente != null) {
                totalPosteos += cliente.getCantidadPosteos();
            }
        }
        return totalPosteos; // Placeholder
    }

    public int calcularPuntuacion(Cliente cliente) {
        int puntuacion = 0;
        if (cliente.getEdad() > 25) {
            puntuacion += cliente.getHorasEnPlataforma() * 2;
        } else {
            puntuacion += cliente.getHorasEnPlataforma() * 3;
        }
        if (cliente.isVerificado()) {
            puntuacion += 20;
        }
        return puntuacion;
    }

    public int[] calcularPuntuacion(Cliente[] clientes) {
        int puntuacion = 0;
        int[] puntuaciones = new int[clientes.length];

        for (int i = 0; i < clientes.length; i++) {
            Cliente cliente = clientes[i];
            if (cliente != null) {
               if (cliente.getEdad() > 25) {
                    puntuacion += cliente.getHorasEnPlataforma() * 2;
                } else {
                    puntuacion += cliente.getHorasEnPlataforma() * 3;
                }
                if (cliente.isVerificado()) {
                    puntuacion += 20;
                }
            puntuaciones[i] = puntuacion;
            }
        }
        
        return puntuaciones;
    }
}