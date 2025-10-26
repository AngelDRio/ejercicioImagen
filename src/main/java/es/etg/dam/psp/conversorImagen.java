package es.etg.dam.psp;

import java.io.IOException;

public class conversorImagen implements conversor {

    // Constantes 
    private static final String COMANDO_CONVERT = "convert";
    private static final String MENSAJE_EXITO = "Conversión completada correctamente: ";
    private static final String MENSAJE_ERROR_CONVERSION = "Error durante la conversión de la imagen.";

    @Override
    public void convertir(String entrada, String salida) throws IOException {
        String comando = COMANDO_CONVERT + " " + entrada + " " + salida;

            Process proceso = Runtime.getRuntime().exec(comando);
            int resultado = proceso.exitValue();

            if (resultado == 0) {
                System.out.println(MENSAJE_EXITO + salida);
            } else {
                System.out.println(MENSAJE_ERROR_CONVERSION);
            }
    }
}

