package es.etg.dam.psp;

import java.io.IOException;

public class app {

    // Constantes
    private static final int NUM_ARGUMENTOS_ESPERADOS = 2;
    private static final String MENSAJE_ERROR_ARGUMENTOS = "Número de argumentos incorrecto.";
    private static final String MENSAJE_USO = "Uso: java -cp out es.etg.dam.psp.app <imagen_entrada> <imagen_salida>";
    private static final String MENSAJE_EXITO = "Conversión completada correctamente: ";
    private static final String MENSAJE_ERROR_CONVERSION = "Error durante la conversión de la imagen.";

    private static String IMAGEN_ENTRADA;
    private static String IMAGEN_SALIDA;

    public static void main(String[] args) throws IOException, InterruptedException {
        
        verificarArgumentos(args);
        construirVariables(args);

        // Crear el conversor
        conversor conversor = new conversorImagen();

        // Ejecutar la conversión
        boolean exito = conversor.convertir(IMAGEN_ENTRADA, IMAGEN_SALIDA);
    
        if (exito) {
            System.out.println(MENSAJE_EXITO + IMAGEN_SALIDA);
        } else {
            System.out.println(MENSAJE_ERROR_CONVERSION);
        }
    }

    private static void verificarArgumentos(String[] args) {
        if (args.length != NUM_ARGUMENTOS_ESPERADOS) {
            System.out.println(MENSAJE_ERROR_ARGUMENTOS);
            System.out.println(MENSAJE_USO);
            System.exit(1);
        }
    }

    private static void construirVariables(String[] args) {
        IMAGEN_ENTRADA = args[0];
        IMAGEN_SALIDA = args[1];
    }
}

