# EJERCICIO IMAGEN 
### Creado por: Ángel Del Río García  

---

## Descripción  

Este proyecto proporciona una herramienta sencilla para convertir imágenes usando la utilidad `convert` de ImageMagick a través de un programa Java.  
El proyecto está diseñado siguiendo buenas prácticas de programación: la lógica de conversión está separada del manejo de mensajes y la interacción con el usuario, permitiendo que la clase principal (`app`) gestione toda la salida.

## Anilisis de archivos .java

Este proyecto cuenta con tres archivos `.java`, dos clases y una interfaz.
La interfaz usada es la siguiente:
```java
package es.etg.dam.psp;

import java.io.IOException;

public interface conversor {
    boolean convertir(String entrada, String salida) throws IOException, InterruptedException;
}
```
La cual cuenta con una sola función de tipo booleano.

Esta interfaz es implemenatda por la clase que realiza la ejecución del comando y que nos devuleve un valor booleano en función de si la ejecución ha sido exitosa o no.
Todo esto es manejado por la clase `app`, la cual revisa el exito de la conversión e indica si ha funcionado o no el programa correctamente.

**NOTA IMPORTANTE:** En la raíz del proyecto se ha dejado una imagen llamada `tigre` en formato **PNG**, esto se ha hecho para que a la hora de probar el programa sea más sencillo tener una imagen a mano en lugar de buscar una dentro de nuestro equipo.

De todas formas, si se desea usar una imagen externa que tengamos, por ejemplo, en nuestro escritorio, basta con ejecutar el programa indicando correctamente la ubicación de la imagen.

El comando para ejecutar correctamente el programa desde la raíz es el siguiente: **java -cp out es.etg.dam.psp.app <imagen_entrada> <imagen_salida>** cada imagen con su respectiva ruta.

Se puede acceder al proyecto en gitHub mediante el siguiente enlace:
[Enlace](https://github.com/AngelDRio/ejercicioImagen).
