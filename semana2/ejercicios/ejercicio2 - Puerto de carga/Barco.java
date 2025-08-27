
public class Barco {
    
    private int matricula;
    private int darsena;
    private String capitan;
    private double carga;

    // Constructor
    public Barco(int matricula, int darsena, String capitan, double carga) {
        this.matricula = matricula;
        this.darsena = darsena;
        this.capitan = capitan;
        this.carga = carga;
    }

    // Getters
    public int getMatricula() {
        return this.matricula;
    }
    public int getDarsena() {
        return this.darsena;
    }
    public String getCapitan() {
        return this.capitan;
    }
    public double getCarga() {
        return this.carga;
    }
    // Setters
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setDarsena(int darsena) {
        this.darsena = darsena;
    }
    public void setCapitan(String capitan) {
        this.capitan = capitan;
    }
    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", darsena=" + darsena + ", capitan=" + capitan + ", carga=" + carga + '}';
    }
}
