/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.exception;

/**
 *
 * @author usuario
 */
public class DetenidoException extends RuntimeException{
    public DetenidoException(){
        super("Un vehículo detenido no se puede frenar, su acción no surte efecto");
    }
}
