package autonoma.simulador.models;



/**
 *
 * @author usuario
 */
public class LlantaBuena implements Llanta{

    @Override
    public String getTipo() {
        return "Buena";
    }

    @Override
    public double getLimiteVelocidad() {
        return 110;
    }


    
}
