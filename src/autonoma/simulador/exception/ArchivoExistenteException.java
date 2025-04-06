package autonoma.simulador.exception;

/**
 *
 * @author Kamii
 */
public class ArchivoExistenteException extends RuntimeException{
    public ArchivoExistenteException(){
        super("Error al leer el archivo: ");
    }
}
