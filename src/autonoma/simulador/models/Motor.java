package autonoma.simulador.models;

import autonoma.simulador.exception.SeAccidentaraException;
import autonoma.simulador.exception.YaEstaApagadoException;
import autonoma.simulador.exception.YaEstaEncendidoException;

/**
 *
 * @author usuario
 */
public class Motor {
    private String Nombre;
    private double obtenerVelocidadMaxima;
    private double velocidadActual;
    private boolean encendido;
    private boolean apagado;

    public Motor(String Nombre, double obtenerVelocidadMaxima) {
        this.Nombre = Nombre;
        this.obtenerVelocidadMaxima = obtenerVelocidadMaxima;
        this.velocidadActual = 0.0;
        this.encendido = false;
        this.apagado = true;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getObtenerVelocidadMaxima() {
        return obtenerVelocidadMaxima;
    }

    public void setObtenerVelocidadMaxima(double obtenerVelocidadMaxima) {
        this.obtenerVelocidadMaxima = obtenerVelocidadMaxima;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isApagado() {
        return !encendido;
    }


    public void setApagado(boolean apagado) {
        this.apagado = apagado;
    }
    
    /**
     * Metodo que permite encender el vehiculo.
     * Si el vehiculo ya esta encendido, se muestra un mensaje indicando esto.
     */
    public boolean encender() {
        
        if(encendido){
            throw new YaEstaEncendidoException();       
        }
        else if (!encendido) {
            encendido = true;
            apagado = false;
            return true;
        }
        return encendido;
    }

    /**
     * Metodo que permite apagar el vehiculo.
     * Al apagarlo, la velocidad se establece en 0.
     * Si el vehiculo ya esta apagado, se muestra un mensaje indicando esto.
     */
    public boolean apagar() {
        if (apagado) {
            throw new YaEstaApagadoException();
        }
        if (velocidadActual > 60.0) {
            throw new SeAccidentaraException();
        }
        encendido = false;
        apagado = true;
        velocidadActual = 0.0;
        return true;
    }

    

}
