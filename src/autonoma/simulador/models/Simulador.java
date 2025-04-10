/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.models;

import autonoma.simulador.exception.ApagadoNoPuedeAcelerarException;
import autonoma.simulador.exception.ApagadoNoPuedeFrenarException;
import autonoma.simulador.exception.ElVeiculoPatinaException;
import autonoma.simulador.exception.SeAccidentaraException;
import autonoma.simulador.exception.YaEstaApagadoException;
import autonoma.simulador.exception.YaEstaEncendidoException;

/**
 *
 * @author usuario
 */
public class Simulador {
    private Vehiculo vehiculo;

    public Simulador( Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public boolean encenderVehiculo(){
        try{
            this.vehiculo.encender();
        }catch(YaEstaEncendidoException e){
            throw e;
        }
        return true;
    }
    public boolean apagarVehiculo(){
        try{
            this.vehiculo.apagar();
        }catch(YaEstaApagadoException e){
            throw e;
        }catch(SeAccidentaraException e){
            throw e;
        }
        return true;
    }
    public void acelerarVehiculo(double incremento){
        try{
           this.vehiculo.acelerar(incremento);
        } catch(ApagadoNoPuedeAcelerarException e){
            throw e;
        }catch(SeAccidentaraException e){
            throw e;
        }
    }
    public void frenarVehiculo(double decremento){
        try{
            this.vehiculo.frenar(decremento);
        }catch (ApagadoNoPuedeFrenarException e){
            throw e;
        }catch(ElVeiculoPatinaException e){
            throw e;
        }
    }
    public void recuperarControlVehiuclo(){
        this.vehiculo.recuperarElControl();
    }
    public void frenarBruscamenteVehiculo(double decremento){
        this.vehiculo.frenarBruscamente(decremento);
    }
}
