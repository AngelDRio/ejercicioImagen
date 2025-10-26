package es.etg.dam.psp;

import java.io.IOException;

public interface conversor {
    boolean convertir(String entrada, String salida) throws IOException, InterruptedException;
}