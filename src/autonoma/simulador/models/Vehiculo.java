
package autonoma.simulador.models;

import autonoma.simulador.exception.ApagadoNoPuedeAcelerarException;
import autonoma.simulador.exception.ApagadoNoPuedeFrenarException;
import autonoma.simulador.exception.DetenidoException;
import autonoma.simulador.exception.ElVeiculoPatinaException;
import autonoma.simulador.exception.SeAccidentaraException;
import autonoma.simulador.exception.YaEstaApagadoException;
import autonoma.simulador.exception.YaEstaEncendidoException;

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
    private Motor motor;
    private Llanta llantas;
    private double velocidadActual;
    private boolean encendido;
    private boolean apagado;
    private boolean patinando;

    /**
     * Constructor de la clase Vehiculo.
     * Inicializa los atributos con valores por defecto.
     */
    public Vehiculo() {
        this.motor = null;
        this.llantas = null;
        this.velocidadActual = 0.0;
        this.encendido = false;
        this.apagado = true;
        this.patinando = false;
    }
    
    public Vehiculo(Llanta llanta, Motor motor) {
        this.motor = motor;
        this.llantas = llanta;
    }   

    public void setLlantas(Llanta llantas) {
        this.llantas = llantas;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    
    public double getVelocidadActual() {
        return velocidadActual;
    }
    
    public Llanta getLlantas() {
        return llantas;
    }

    public Motor getMotor() {
        return motor;
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
        return false;
    }

    /**
     * Metodo que permite apagar el vehiculo.
     * Al apagarlo, la velocidad se establece en 0.
     * Si el vehiculo ya esta apagado, se muestra un mensaje indicando esto.
     */
    public boolean apagar() {

        if(apagado){
            throw new YaEstaApagadoException();
        }
        else if(this.velocidadActual>60.0){
            throw new SeAccidentaraException();
            
        }

        else if (encendido) {
            encendido = false;
            apagado = true;
            velocidadActual = 0.0;
            return true;
        }
        return false;
    }

    /**
     * Metodo que permite acelerar el vehiculo.
     * Solo se puede acelerar si el vehiculo esta encendido.
     * 
     * @param incremento La cantidad de velocidad a aumentar.
     * @return La nueva velocidad actual del vehiculo despues de acelerar.
     */
    public double acelerar(double incremento) {
        if(apagado){
            throw new ApagadoNoPuedeAcelerarException();
        }
        else if (encendido) {
            velocidadActual += incremento;

            double limiteMotor = motor.obtenerVelocidadMaxima();
            double limiteLlanta = llantas.getLimiteVelocidad();

            double limitePermitido = Math.min(limiteMotor, limiteLlanta);
        
            if (velocidadActual > limitePermitido) {
                throw new SeAccidentaraException();
            }            
        }
        return velocidadActual;
    }

    /**
     * Metodo que permite frenar el vehiculo.
     * La velocidad disminuye en la cantidad especificada, sin permitir valores negativos.
     * 
     * @param decremento La cantidad de velocidad a reducir.
     * @return La nueva velocidad actual del vehiculo despues de frenar.
     */
    public double frenar(double decremento) {
        if(apagado){
            throw new ApagadoNoPuedeFrenarException();
        }
        else if(velocidadActual==0){
            throw new DetenidoException();
        }
        else if(velocidadActual>llantas.getLimiteVelocidad()){
            throw new ElVeiculoPatinaException();
        }

        else if (velocidadActual > 0) {
            velocidadActual -= decremento;
            if (velocidadActual < 0) {
                velocidadActual = 0;
            }
        }
        return velocidadActual;
    }

    /**
     * Metodo que permite frenar bruscamente el vehiculo.
     * La velocidad disminuye al doble de la cantidad especificada y el vehiculo entra en estado de patinaje.
     * 
     * @param decremento La cantidad de velocidad a reducir, multiplicada por 2.
     * @return La nueva velocidad actual del vehiculo despues de frenar bruscamente.
     */
    public double frenarBruscamente(double decremento) {
        try{
            if(velocidadActual<decremento){
                throw new ElVeiculoPatinaException();
            }
        }catch(ElVeiculoPatinaException e){
            System.out.println(e.getMessage());
            patinando=true;
            this.recuperarElControl();
        }
        if (velocidadActual > 0) {
            velocidadActual -= decremento * 2;
            if (velocidadActual < 0) {
                velocidadActual = 0;
            }
            patinando = true;
        }
        return velocidadActual;
    }
    public void recuperarElControl(){
        if (patinando){
            velocidadActual=0;
        }
    }
}



