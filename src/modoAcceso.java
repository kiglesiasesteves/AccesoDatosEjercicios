import java.io.File;

/**
 * La clase modoAcceso proporciona métodos para comprobar los permisos de lectura, escritura y ejecución
 * de un archivo o directorio en el sistema de archivos. Dependiendo de los permisos, muestra mensajes
 * adecuados para cada tipo de acceso.
 */
public class modoAcceso {

    // Mensajes predeterminados para los permisos de acceso a archivos
    String trueFile = "e de lectura";
    String falseFile = "non e de lectura";
    String trueFile2 = "e de escritura";
    String falseFile2 = "non e de escritura";
    String trueFile3 = "e de execucion";
    String falseFile3 = "non e de execucion";

    /**
     * Comprueba si el archivo tiene permiso de lectura y muestra un mensaje indicando si es accesible
     * para la lectura.
     *
     * @param cadea Ruta del archivo o directorio a comprobar.
     */
    public void eLectura(String cadea) {
        File file = new File(cadea);
        if (isLectura(file)) {
            printLectura(trueFile);
        } else {
            printLectura(falseFile);
        }
    }

    /**
     * Comprueba si el archivo tiene permiso de escritura y muestra un mensaje indicando si es accesible
     * para la escritura.
     *
     * @param cadea Ruta del archivo o directorio a comprobar.
     */
    public void eEscritura(String cadea) {
        File file = new File(cadea);
        if (isEscritura(file)) {
            printEscritura(trueFile2);
        } else {
            printEscritura(falseFile2);
        }
    }

    /**
     * Comprueba si el archivo tiene permiso de ejecución y muestra un mensaje indicando si es accesible
     * para la ejecución.
     *
     * @param cadea Ruta del archivo o directorio a comprobar.
     */
    public void eExecucion(String cadea) {
        File file = new File(cadea);
        if (isExecucion(file)) {
            printExecucion(trueFile3);
        } else {
            printExecucion(falseFile3);
        }
    }

    /**
     * Imprime el mensaje correspondiente al permiso de lectura.
     *
     * @param Frasearchivo Mensaje que indica si el archivo tiene permiso de lectura.
     */
    private static void printLectura(String Frasearchivo) {
        System.out.println(Frasearchivo);
    }

    /**
     * Imprime el mensaje correspondiente al permiso de escritura.
     *
     * @param Frasearchivo Mensaje que indica si el archivo tiene permiso de escritura.
     */
    private static void printEscritura(String Frasearchivo) {
        System.out.println(Frasearchivo);
    }

    /**
     * Imprime el mensaje correspondiente al permiso de ejecución.
     *
     * @param Frasearchivo Mensaje que indica si el archivo tiene permiso de ejecución.
     */
    private static void printExecucion(String Frasearchivo) {
        System.out.println(Frasearchivo);
    }

    /**
     * Verifica si el archivo es legible.
     *
     * @param file Objeto File que representa el archivo o directorio.
     * @return {@code true} si el archivo tiene permiso de lectura; {@code false} si no.
     */
    private static boolean isLectura(File file) {
        return file.canRead();
    }

    /**
     * Verifica si el archivo es escribible.
     *
     * @param file Objeto File que representa el archivo o directorio.
     * @return {@code true} si el archivo tiene permiso de escritura; {@code false} si no.
     */
    private static boolean isEscritura(File file) {
        return file.canWrite();
    }

    /**
     * Verifica si el archivo es ejecutable.
     *
     * @param file Objeto File que representa el archivo o directorio.
     * @return {@code true} si el archivo tiene permiso de ejecución; {@code false} si no.
     */
    private static boolean isExecucion(File file) {
        return file.canExecute();
    }

    /**
     * Establece el permiso de escritura en el archivo.
     *
     * @param file Objeto File que representa el archivo o directorio.
     * @return {@code true} si el permiso de escritura fue modificado con éxito; {@code false} si no.
     */
    public  boolean mescritura(File file) {
        return file.setWritable(true);
    }
}
