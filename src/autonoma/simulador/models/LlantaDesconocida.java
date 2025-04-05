package autonoma.simulador.models;

/**
 * Llantas de tipo desconocido, con límite 0 km/h.
 */
public class LlantaDesconocida implements Llanta {

    @Override
    public String getTipo() {
        return "Desconocidas";
    }

    @Override
    public double getLimiteVelocidad() {
        return 0;
    }
}
