package es.etg.dam.psp;

import java.io.IOException;

public class app {

    // Constantes
    private static final int NUM_ARGUMENTOS_ESPERADOS = 2;
    private static final String MENSAJE_ERROR_ARGUMENTOS = "Número de argumentos incorrecto.";
    private static final String MENSAJE_USO = "Uso: java es.etg.dam.psp.app <imagen_entrada> <imagen_salida>";

    private static String imagenEntrada;
    private static String imagenSalida;

    public static void main(String[] args) throws IOException {
        
        verificarArgumentos(args);
        construirVariables(args);

        // Crear el conversor
        conversor conversor = new conversorImagen();

        // Ejecutar la conversión
        conversor.convertir(imagenEntrada, imagenSalida);
    }

    private static void verificarArgumentos(String[] args) {
        if (args.length != NUM_ARGUMENTOS_ESPERADOS) {
            System.out.println(MENSAJE_ERROR_ARGUMENTOS);
            System.out.println(MENSAJE_USO);
            System.exit(1);
        }
    }

    private static void construirVariables(String[] args) {
        imagenEntrada = args[0];
        imagenSalida = args[1];
    }
}

