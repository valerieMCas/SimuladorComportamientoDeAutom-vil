/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.sounds;

import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Kamii
 */
public class SonidoInicio {
    
    public static void reproducir() {
        try {
            // Cargar el sonido como recurso desde el paquete
            InputStream inputStream = SonidoInicio.class.getResourceAsStream("/autonoma/simulador/sounds/sonidoinicial.wav");
            if (inputStream == null) {
                System.out.println("No se encontró el archivo de sonido.");
                return;
            }
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(inputStream);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            System.out.println("Error al reproducir el sonido: " + e.getMessage());
        }
    }
}
