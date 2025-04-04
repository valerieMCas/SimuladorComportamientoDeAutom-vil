package autonoma.simulador.models;


/**
 *
 * @author usuario
 */
public class LlantaBarata implements Llanta{

    @Override
    public String getTipo() {
        return "Baratas";
    }

    @Override
    public double getLimiteVelocidad() {
        return 50;
    }


    
}
