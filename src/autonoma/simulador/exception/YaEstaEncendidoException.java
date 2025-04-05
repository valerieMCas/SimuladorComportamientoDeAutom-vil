/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.exception;

/**
 *
 * @author valerie
 */
public class YaEstaEncendidoException extends RuntimeException{
    public YaEstaEncendidoException(){
        super("El Carro ya esta encedido ");
    }
}
