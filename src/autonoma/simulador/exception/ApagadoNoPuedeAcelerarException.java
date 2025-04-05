/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.exception;

/**
 *
 * @author usuario
 */
public class ApagadoNoPuedeAcelerarException extends RuntimeException{
    public ApagadoNoPuedeAcelerarException(){
        super("El carro esta apagado no se puede acelerar");
    }
}
