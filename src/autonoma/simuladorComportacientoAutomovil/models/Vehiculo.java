/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorComportacientoAutomovil.models;

/**
 *
 * @author martin Taborda A
 * @since 20250404
 * @version 1.0.0
 */
public class Vehiculo {
    /**
     * Atributos
     */
    private double velocidadActual;
    private boolean encendido;
    private boolean apagado;
    private boolean patinando;

    /**
     * Constructor de la clase Vehiculo.
     * Inicializa los atributos con valores por defecto.
     */
    public Vehiculo() {
        this.velocidadActual = 0.0;
        this.encendido = false;
        this.apagado = true;
        this.patinando = false;
    }

    /**
     * Metodo que permite encender el vehiculo.
     * Si el vehiculo ya esta encendido, se muestra un mensaje indicando esto.
     */
    public void encender() {
        if (!encendido) {
            encendido = true;
            apagado = false;
            System.out.println("El vehiculo ha sido encendido.");
        } else {
            System.out.println("El vehiculo ya esta encendido.");
        }
    }

    /**
     * Metodo que permite apagar el vehiculo.
     * Al apagarlo, la velocidad se establece en 0.
     * Si el vehiculo ya esta apagado, se muestra un mensaje indicando esto.
     */
    public void apagar() {
        if (encendido) {
            encendido = false;
            apagado = true;
            velocidadActual = 0.0;
            System.out.println("El vehiculo ha sido apagado.");
        } else {
            System.out.println("El vehiculo ya esta apagado.");
        }
    }

    /**
     * Metodo que permite acelerar el vehiculo.
     * Solo se puede acelerar si el vehiculo esta encendido.
     * 
     * @param velocidadActual La cantidad de velocidad a aumentar.
     * @return La nueva velocidad actual del vehiculo despues de acelerar.
     */
    public double acelerar(double velocidadActual) {
        if (encendido) {
            this.velocidadActual += velocidadActual;
            System.out.println("El vehiculo ha acelerado. Velocidad actual: " + this.velocidadActual + " km/h");
        } else {
            System.out.println("No se puede acelerar. El vehiculo esta apagado.");
        }
        return this.velocidadActual;
    }

    /**
     * Metodo que permite frenar el vehiculo.
     * La velocidad disminuye en la cantidad especificada, sin permitir valores negativos.
     * 
     * @param velocidadActual La cantidad de velocidad a reducir.
     * @return La nueva velocidad actual del vehiculo despues de frenar.
     */
    public double frenar(double velocidadActual) {
        if (this.velocidadActual > 0) {
            this.velocidadActual -= velocidadActual;
            if (this.velocidadActual < 0) {
                this.velocidadActual = 0;
            }
            System.out.println("El vehiculo ha frenado. Velocidad actual: " + this.velocidadActual + " km/h");
        } else {
            System.out.println("El vehiculo ya esta detenido.");
        }
        return this.velocidadActual;
    }

    /**
     * Metodo que permite frenar bruscamente el vehiculo.
     * La velocidad disminuye al doble de la cantidad especificada y el vehiculo entra en estado de patinaje.
     * 
     * @param velocidadActual La cantidad de velocidad a reducir, multiplicada por 2.
     * @return La nueva velocidad actual del vehiculo despues de frenar bruscamente.
     */
    public double frenarBruscamente(double velocidadActual) {
        if (this.velocidadActual > 0) {
            this.velocidadActual -= velocidadActual * 2;
            if (this.velocidadActual < 0) {
                this.velocidadActual = 0;
            }
            patinando = true;
            System.out.println("El vehiculo ha frenado bruscamente y esta patinando. Velocidad actual: " + this.velocidadActual + " km/h");
        } else {
            System.out.println("El vehiculo ya esta detenido.");
        }
        return this.velocidadActual;
    }
}



