package autonoma.simulador.sounds;

import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * Clase utilitaria para reproducir sonidos desde recursos.
 * 
 * Puede reproducir cualquier sonido ubicado en el paquete /autonoma/simulador/sounds/
 */
public class ReproductorSonido {

    private static Clip clip;

    public static void reproducir(String nombreArchivo) {
        try {
            InputStream inputStream = ReproductorSonido.class.getResourceAsStream("/autonoma/simulador/sounds/" + nombreArchivo);
            if (inputStream == null) {
                System.out.println("Archivo no encontrado: " + nombreArchivo);
                return;
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(inputStream);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY); // Lo repite hasta que lo detengas
            clip.start();
        } catch (Exception e) {
            System.out.println("Error al reproducir sonido: " + e.getMessage());
        }
    }

    public static void detener() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
        }
    }
}
