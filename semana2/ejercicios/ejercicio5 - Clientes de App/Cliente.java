public class Cliente {
    private String nombre;
    private int dni;
    private short edad;
    private String ocupacion;
    private int cantidadPosteos;
    private float horasEnPlataforma;
    private boolean verificado;

    // Constructor
    public Cliente(String nombre, int dni, short edad, String ocupacion, int cantidadPosteos, float horasEnPlataforma, boolean verificado) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.cantidadPosteos = cantidadPosteos;
        this.horasEnPlataforma = horasEnPlataforma;
        this.verificado = verificado;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public int getDni() {
        return this.dni;
    }
    
    public short getEdad() {
        return this.edad;
    }
   
    public String getOcupacion() {
        return this.ocupacion;
    }

    public int getCantidadPosteos() {
        return this.cantidadPosteos;
    }
   
    public float getHorasEnPlataforma() {
        return this.horasEnPlataforma;
    }
    
    public boolean isVerificado() {
        return this.verificado;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setCantidadPosteos(int cantidadPosteos) {
        this.cantidadPosteos = cantidadPosteos;
    }

    public void setHorasEnPlataforma(float horasEnPlataforma) {
        this.horasEnPlataforma = horasEnPlataforma;
    }

    public void setVerificado(boolean verificado) {
        this.verificado = verificado;
    }

    // Método toString
    @Override
    public String toString() {
        return "Cliente " +
                 this.nombre + '\n' +
                " dni=" + dni +
                "\n edad=" + edad +
                "\n ocupacion='" + ocupacion +
                "\n cantidadPosteos=" + cantidadPosteos +
                "\n horasEnPlataforma=" + horasEnPlataforma +
                "\n verificado=" + verificado + "\n";
    }

}
