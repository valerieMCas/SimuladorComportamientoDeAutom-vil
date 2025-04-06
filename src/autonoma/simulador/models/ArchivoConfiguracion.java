package autonoma.simulador.models;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase que utiliza un lector para leer un archivo de configuración
 * y construir un objeto de tipo Vehiculo con base en sus datos.
 * 
 * Esta clase valida la existencia del archivo y determina
 * los objetos de tipo Llantas y Motor a crear según los datos leídos.
 * 
 * @author Kamii
 * @version 1.0.0
 * @since 2025-04-04
 */
public class ArchivoConfiguracion {

    /** Objeto lector para manejar la lectura del archivo */
    private Lector lector;

    /**
     * Constructor que recibe un lector.
     * 
     * @param lector Objeto que implementa la interfaz Lector
     */
    public ArchivoConfiguracion(Lector lector) {
        this.lector = lector;
    }

    /**
     * Verifica si un archivo existe.
     * 
     * @param ruta Ruta del archivo.
     * @return true si el archivo existe, false en caso contrario.
     */
    public boolean archivoExiste(String ruta) {
        File archivo = new File(ruta);
        return archivo.exists();
    }

    /**
     * Lee el archivo de configuración y crea un objeto Vehiculo.
     * 
     * @param ruta Ruta del archivo de configuración.
     * @return Vehiculo configurado con llantas y motor.
     * @throws IOException Si el archivo no existe o hay error en lectura.
     */
    public Vehiculo leerArchivo(String ruta) throws IOException {
        ArrayList<String> lineas = lector.leer(ruta);

        if (lineas.size() < 2 || lineas.get(0).split("\\s+").length < 2 || lineas.get(1).split("\\s+").length < 2) {
            throw new IOException("Archivo de configuración incompleto.");
        }

        String tipoLlantas = lineas.get(0).split("\\s+")[1].trim();
        String tipoMotor = lineas.get(1).split("\\s+")[1].trim();

        Llanta llantas = crearLlantas(tipoLlantas);
        Motor motor = crearMotor(tipoMotor);

        return new Vehiculo(llantas, motor);
    }

    /**
     * Crea un objeto Llantas según el tipo.
     * 
     * @param tipo Tipo de llantas en texto.
     * @return Objeto Llantas con su velocidad límite correspondiente.
     */
    private Llanta crearLlantas(String tipo) {
        switch (tipo.toLowerCase()) {
            case "buenas": return new LlantaBuena() ;
            case "bonitas": return new LlantaBonita();
            case "baratas": return new LlantaBarata();
            default: return new LlantaDesconocida();
        }
    }

    /**
     * Crea un objeto Motor según el tipo de cilindrada.
     * 
     * @param tipo Tipo de motor como texto (1000, 2000, 3000).
     * @return Objeto Motor con su velocidad máxima correspondiente.
     */
    private Motor crearMotor(String tipo) {
        switch (tipo) {
            case "1000": return new Motor1000CC();
            case "2000": return new Motor2000CC();
            case "3000": return new Motor3000CC();
            default: return new Motor00cc();
        }
    }
    
}
