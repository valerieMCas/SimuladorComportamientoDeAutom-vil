/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorComportacientoAutomovil.models;

/**
 *
 * @author usuario
 */
public class LlantaBarata implements Llanta{

    @Override
    public double obtenerLimiteVelocidad() {
        double limiteVelocidad = 50;
        System.out.println("El limite de velocidad de las llantas baratas es de "+ limiteVelocidad+"km/h");
        return limiteVelocidad;
    }
    
}
