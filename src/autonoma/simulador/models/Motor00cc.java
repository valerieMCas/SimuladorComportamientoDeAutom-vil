package autonoma.simulador.models;

/**
 *
 * @author Kamii
 */
public class Motor00cc implements Motor{
    @Override
    public String getNombre() {
        return "00 cc";
    }

    @Override
    public double obtenerVelocidadMaxima() {
        return 0;
    }
}
