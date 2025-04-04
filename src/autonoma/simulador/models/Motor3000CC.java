/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.models;

import autonoma.simulador.models.Motor;

/**
 *
 * @author usuario
 */
public class Motor3000CC implements Motor{

    @Override
    public String getNombre() {
        return "3000 cc";
    }

    @Override
    public double obtenerVelocidadMaxima() {
        return 220;
    }

    
}
