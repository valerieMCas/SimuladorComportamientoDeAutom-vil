package autonoma.simulador.exception;

public class ArchivoIncompletoException extends RuntimeException{
    public ArchivoIncompletoException(){
        super("Error al leer el archivo:");
    }
}
