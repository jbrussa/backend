
public class Mascota {
    
    // Atributos
    private int energia;
    private int humor;
    private String estado;
    private String nombre;
    private boolean vivo;
    private int ingestaConsecutiva;

    // Constructores
    public Mascota( int energia, int humor){
        if (energia < 0 || energia > 100) {
            throw new IllegalArgumentException("La energía debe estar entre 0 y 100");
        }
        if (humor < 1 || humor > 5) {
            throw new IllegalArgumentException("El humor debe estar entre 1 y 5");
        }
        this.energia = energia;
        this.humor = humor;
        this.estado = "despierto";
        this.vivo = true;
    }

    // Getters
    public int getEnergia() {
        return this.energia;
    }
    
    public int getHumor() {
        return this.humor;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean getVivo() {
        return this.vivo;
    }

    public int getingestaConsecutiva() {
        return this.ingestaConsecutiva;
    }

    // Setters 
    public void setEnergia(int energia) {
        if (energia < 0) {
            this.energia = 0;
        } else if (energia > 100) {
            this.energia = 100;
        } else {
            this.energia = energia;
        }
    }
    
    public void setHumor(int humor) {
        if (humor < 1) {
            this.humor = 1;
        } else if (humor > 5) {
            this.humor = 5;
        } else {
            this.humor = humor;
        }
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void setIngestaConsecutiva(int ingestaConsecutiva) {
        this.ingestaConsecutiva = ingestaConsecutiva;
    }

    // Comportamientos de ingesta
    public void comer(){
        int incremento = (int)(this.energia*0.1);
        this.setEnergia(this.energia + incremento);
        this.setHumor(this.humor + 1);
        this.ingestaConsecutiva += 1;
        if (this.ingestaConsecutiva >= 3) {
            this.setHumor(this.humor - 1);
        }

    }

    public void beber(){
        int incremento = (int)(this.energia*0.05);
        this.setEnergia(this.energia + incremento);
        this.setHumor(this.humor + 1);
        if (this.ingestaConsecutiva >= 3) {
            this.setHumor(this.humor - 1);
        }
    }

    // Comportamiento de actividades
    public void correr(){
        int decremento = (int)(this.energia*0.35);
        this.setEnergia(this.energia - decremento);
        this.setHumor(this.humor - 2);
        if (this.energia == 0) {
            this.matar();
        }
    }

    public void saltar(){
        int decremento = (int)(this.energia*0.15);
        this.setEnergia(this.energia -= decremento);
        this.setHumor(this.humor -= 2);
        if (this.energia == 0) {
            this.matar();
        }
    }

    // Otros comportamientos
    public void dormir(){
        this.estado = "durmiendo";
        this.setEnergia(this.energia + 25);
        this.setHumor(this.humor + 2);
    }

    public void matar(){
        this.estado = "muerto";
        this.vivo = false;
    }


    // Control de Ingesta
    public void controlIngesta(){

    }

}
