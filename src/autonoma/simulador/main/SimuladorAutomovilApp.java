/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.simulador.main;

import autonoma.simulador.models.Llanta;
import autonoma.simulador.models.Motor;
import autonoma.simulador.models.Vehiculo;
import autonoma.simulador.sounds.ReproductorSonido;
import autonoma.simulador.views.VentanaPrincipal;
import autonoma.simulador.sounds.*;


/**
 *
 * @author usuario
 */
public class SimuladorAutomovilApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo vehiculo=new Vehiculo();
        
        VentanaPrincipal ventana= new VentanaPrincipal(vehiculo);
        ventana.setVisible(true);
        
        ReproductorSonido.reproducir("sonidoinicial.wav");

    }
    
}
