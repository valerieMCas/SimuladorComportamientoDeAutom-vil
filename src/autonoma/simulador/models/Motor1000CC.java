package autonoma.simulador.models;


/**
 *
 * @author usuario
 */
public class Motor1000CC implements Motor{

    @Override
    public String getNombre() {
        return "1000 cc";
    }

    @Override
    public double obtenerVelocidadMaxima() {
        return 100;
    }


    
}
