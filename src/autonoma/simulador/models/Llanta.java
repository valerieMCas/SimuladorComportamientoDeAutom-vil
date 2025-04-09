package autonoma.simulador.models;

/**
 *
 * @author valerie
 */
public class Llanta {
    private String getTipo;
    private double getLimiteVelocidad;

    public Llanta(String getTipo, double getLimiteVelocidad) {
        this.getTipo = getTipo;
        this.getLimiteVelocidad = getLimiteVelocidad;
    }

    public String getGetTipo() {
        return getTipo;
    }

    public void setGetTipo(String getTipo) {
        this.getTipo = getTipo;
    }

    public double getGetLimiteVelocidad() {
        return getLimiteVelocidad;
    }

    public void setGetLimiteVelocidad(double getLimiteVelocidad) {
        this.getLimiteVelocidad = getLimiteVelocidad;
    }
    
}
