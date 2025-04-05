/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.exception;

/**
 *
 * @author Valerie
 */
public class YaEstaApagadoException extends RuntimeException{
    public YaEstaApagadoException(){
        super("El Carro ya esta apagado");
    }
}
