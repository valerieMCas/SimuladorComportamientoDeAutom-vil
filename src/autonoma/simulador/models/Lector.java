package autonoma.simulador.models;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Interfaz para la lectura de archivos
 * 
 * @author Kamii
 * @version 1.0.0
 * @since 2025-04-04
 */
public interface Lector {
    /**
     * Lee un archivo y devuelve su contenido como una lista de líneas
     * 
     * @param localizacionArchivo Ruta del archivo
     * @return Lista de líneas del archivo
     * @throws IOException Si ocurre un error al leer el archivo
     */
    public abstract ArrayList<String> leer(String localizacionArchivo) throws IOException;
}
