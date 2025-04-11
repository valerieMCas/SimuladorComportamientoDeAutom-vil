package autonoma.simulador.sounds;

import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ReproductorSonido {

    private static Clip clip;

    public static void reproducir(String nombreArchivo) {
        try {
            detener(); // Detiene cualquier sonido anterior

            InputStream inputStream = ReproductorSonido.class.getResourceAsStream("/autonoma/simulador/sounds/" + nombreArchivo);
            if (inputStream == null) {
                System.out.println("Archivo no encontrado: " + nombreArchivo);
                return;
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(inputStream);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (Exception e) {
            System.out.println("Error al reproducir sonido: " + e.getMessage());
        }
    }

    public static void detener() {
        try {
            if (clip != null) {
                clip.stop();
                clip.flush();
                clip.close();
                clip = null;
            }
        } catch (Exception e) {
            System.out.println("Error al detener sonido: " + e.getMessage());
        }
    }
}
