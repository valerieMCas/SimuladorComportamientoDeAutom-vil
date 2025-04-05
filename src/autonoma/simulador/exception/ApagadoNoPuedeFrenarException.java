/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.exception;

/**
 *
 * @author usuario
 */
public class ApagadoNoPuedeFrenarException extends RuntimeException{
    public ApagadoNoPuedeFrenarException(){
        super("El carro esta apagado no puede frenar");
    }
}
