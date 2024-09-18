import java.io.File;

/**
 * La clase ModoAcceso proporciona métodos para comprobar y modificar los permisos de lectura, escritura y ejecución
 * de un archivo o directorio en el sistema de archivos.
 */
public class modoAcceso {

    /**
     * Comprueba si el archivo tiene permiso de lectura, escritura o ejecución, y muestra un mensaje adecuado.
     *
     * @param rutaArchivo Ruta del archivo o directorio a comprobar.
     */
    public void comprobarPermisos(String rutaArchivo) {
        File archivo = getFile(rutaArchivo);

        mostrarMensajeAcceso("lectura", archivo.canRead());
        mostrarMensajeAcceso("escritura", archivo.canWrite());
    }

    /**
     * Muestra un mensaje indicando si el archivo tiene o no un permiso específico.
     *
     * @param tipoAcceso El tipo de acceso (lectura, escritura o ejecución).
     * @param esAccesible true si el archivo tiene el permiso; false en caso contrario.
     */
    private boolean mostrarMensajeAcceso(String tipoAcceso, boolean esAccesible) {
        if (esAccesible) {
            System.out.println("El archivo es accesible para " + tipoAcceso + ".");
            return true;
        } else {
            System.out.println("El archivo no tiene permiso de " + tipoAcceso + ".");
            return false;
        }
    }

    /**
     * Establece el archivo o directorio como escribible.
     *
     * @param rutaArchivo Ruta del archivo o directorio a modificar.
     * @return {@code true} si se pudo modificar el permiso de escritura; {@code false} en caso contrario.
     */
    public boolean hacerEscribible(String rutaArchivo) {
        File archivo = getFile(rutaArchivo);
        return archivo.setWritable(true);
    }

    /**
     * Establece el archivo o directorio como solo lectura.
     *
     * @param rutaArchivo Ruta del archivo o directorio a modificar.
     * @return {@code true} si se pudo establecer como solo lectura; {@code false} en caso contrario.
     */
    public boolean hacerSoloLectura(String rutaArchivo) {
        File archivo = getFile(rutaArchivo);
        return archivo.setReadOnly();
    }

    /**
     * Crea un objeto `File` a partir de la ruta especificada.
     *
     * @param rutaArchivo Ruta del archivo o directorio.
     * @return Un objeto `File` que representa el archivo o directorio especificado.
     */
    private static File getFile(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        return archivo;
    }
}
