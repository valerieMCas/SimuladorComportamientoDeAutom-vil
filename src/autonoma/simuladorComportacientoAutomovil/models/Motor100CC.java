/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorComportacientoAutomovil.models;

/**
 *
 * @author usuario
 */
public class Motor100CC implements Motor{

    @Override
    public double obtenerVelocidadMaxima() {
        double velocidadMaxima = 100;
        System.out.println("La velocidad maxima es 100 Km/h");
        return velocidadMaxima;
    }
    
}
