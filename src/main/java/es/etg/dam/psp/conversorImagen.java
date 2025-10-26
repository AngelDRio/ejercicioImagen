package es.etg.dam.psp;

import java.io.IOException;

public class conversorImagen implements conversor {

    // Constantes
    private static final String COMANDO_CONVERT = "convert";
    
    @Override
    public boolean convertir(String entrada, String salida) throws IOException, InterruptedException {
        String comando = COMANDO_CONVERT + " " + entrada + " " + salida;

        Process proceso = Runtime.getRuntime().exec(comando);
        int resultado = proceso.waitFor();

        return resultado == 0;
    }
}

