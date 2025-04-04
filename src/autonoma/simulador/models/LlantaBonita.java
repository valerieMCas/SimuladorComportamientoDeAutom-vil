/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.models;

import autonoma.simulador.models.Llanta;

/**
 *
 * @author usuario
 */
public class LlantaBonita implements Llanta{

    @Override
    public String getTipo() {
        return "Bonita";
    }

    @Override
    public double getLimiteVelocidad() {
        return 70;
    }


    
}
