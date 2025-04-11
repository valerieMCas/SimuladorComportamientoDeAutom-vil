    
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
    private boolean patinando;

    /**
     * Constructor de la clase Vehiculo.
     * Inicializa los atributos con valores por defecto.
     */
    public Vehiculo() {
        this.motor = null;
        this.llantas = null;
        this.patinando = false;
    }

    public Vehiculo(Llanta llanta, Motor motor) {
        this.motor = motor;
        this.llantas = llanta;
    }   
    
    public void setPatinando(boolean patinando) {
        this.patinando = patinando;
    }
    
    public void setLlantas(Llanta llantas) {
        this.llantas = llantas;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public Llanta getLlantas() {
        return llantas;
    }

    public Motor getMotor() {
        return motor;
    }

    public boolean encender() {
        return this.motor.encender(); // motor.encender() retorna true o false
    }
    public boolean apagar(){
        return this.motor.apagar();
    }
    
    /**
     * Metodo que permite acelerar el vehiculo.
     * Solo se puede acelerar si el vehiculo esta encendido.
     * 
     * @param incremento La cantidad de velocidad a aumentar.
     * @return La nueva velocidad actual del vehiculo despues de acelerar.
     */
public double acelerar(double incremento) {
    if (!motor.getEncendido()) {
        throw new ApagadoNoPuedeAcelerarException();
    }

    double nuevaVelocidad = motor.getVelocidadActual() + incremento;
    double limiteMotor = motor.getObtenerVelocidadMaxima();

    if (nuevaVelocidad > limiteMotor) {
        throw new SeAccidentaraException();
    }

    motor.setVelocidadActual(nuevaVelocidad);
    return nuevaVelocidad;
}


    /**
     * Metodo que permite frenar el vehiculo.
     * La velocidad disminuye en la cantidad especificada, sin permitir valores negativos.
     * 
     * @param decremento La cantidad de velocidad a reducir.
     * @return La nueva velocidad actual del vehiculo despues de frenar.
     */
public double frenar(double decremento) {
    if (!motor.getEncendido()) {
        throw new ApagadoNoPuedeFrenarException();
    }

    double velocidadActual = motor.getVelocidadActual();

    if (velocidadActual == 0) {
        throw new DetenidoException();
    }

    if (velocidadActual > llantas.getLimiteVelocidad()) {
        patinando = true;
        throw new ElVeiculoPatinaException();
    }

    velocidadActual -= decremento;
    if (velocidadActual < 0) {
        velocidadActual = 0;
    }

    motor.setVelocidadActual(velocidadActual);
    return velocidadActual;
}

    public void recuperarElControl() {
        if (patinando) {
            motor.setVelocidadActual(0);
            motor.setEncendido(false);
            motor.setApagado(true);
            patinando = false;
        }
    }

    /**
     * Metodo que permite frenar bruscamente el vehiculo.
     * La velocidad disminuye al doble de la cantidad especificada y el vehiculo entra en estado de patinaje.
     * 
     * @param decremento La cantidad de velocidad a reducir, multiplicada por 2.
     * @return La nueva velocidad actual del vehiculo despues de frenar bruscamente.
     */
    public void frenarBruscamente(double decremento) throws ElVeiculoPatinaException, ApagadoNoPuedeFrenarException, DetenidoException {

        frenar(decremento); // usa tu método actual
        
        if (decremento > 30) {
            throw new ElVeiculoPatinaException(); // Esto indicará que el vehículo patina
        }
    
    }
    
    
}



