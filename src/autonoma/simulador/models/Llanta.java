package autonoma.simulador.models;

/**
 *
 * @author valerie
 */
public class Llanta {
    private String tipo;
    private double limiteVelocidad;

    public Llanta(String tipo, double limiteVelocidad) {
        this.tipo = tipo;
        this.limiteVelocidad = limiteVelocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getLimiteVelocidad() {
        return limiteVelocidad;
    }

    public void setLimiteVelocidad(double limiteVelocidad) {
        this.limiteVelocidad = limiteVelocidad;
    }

    
    
}
