import java.io.File;

/**
 * La clase ComprobarDirArch proporciona métodos para verificar si una ruta dada corresponde
 * a un directorio o un archivo en el sistema de archivos. Imprime mensajes indicando si la ruta
 * es un archivo o un directorio.
 */
public class ComprobarDirArch {
    // Mensajes predeterminados para la verificación de directorios y archivos
    String trueDir = "e un directorio";
    String falseDir = "non e un directorio";
    String trueFile = "e un archivo";
    String falseFile = "non e un archivo";

    /**
     * Verifica si la ruta especificada es un directorio y muestra un mensaje
     * que indica si es un directorio o no.
     *
     * @param cadea Ruta del archivo o directorio a comprobar.
     */
    public void eDirectorio(String cadea) {
        File file = new File(cadea);
        if (isDirectory(file)) {
            printDirectorio(trueDir);
        } else {
            printDirectorio(falseDir);
        }
    }

    /**
     * Imprime un mensaje sobre si es un directorio o no.
     *
     * @param Frasedirectorio Mensaje que indica el resultado de la verificación del directorio.
     */
    private static void printDirectorio(String Frasedirectorio) {
        System.out.println(Frasedirectorio);
    }

    /**
     * Verifica si el objeto File es un directorio.
     *
     * @param file Objeto File que representa el directorio a comprobar.
     * @return {@code true} si es un directorio; {@code false} si no.
     */
    private static boolean isDirectory(File file) {
        return file.isDirectory();
    }

    /**
     * Verifica si la ruta especificada es un archivo y muestra un mensaje
     * que indica si es un archivo o no.
     *
     * @param cadea Ruta del archivo o directorio a comprobar.
     */
    public void eArchivo(String cadea) {
        File file = new File(cadea);
        if (isFile(file)) {
            printArchivo(trueFile);
        } else {
            printArchivo(falseFile);
        }
    }

    /**
     * Imprime un mensaje sobre si es un archivo o no.
     *
     * @param Frasearchivo Mensaje que indica el resultado de la verificación del archivo.
     */
    private static void printArchivo(String Frasearchivo) {
        System.out.println(Frasearchivo);
    }

    /**
     * Verifica si el objeto File es un archivo.
     *
     * @param file Objeto File que representa el archivo a comprobar.
     * @return {@code true} si es un archivo; {@code false} si no.
     */
    private static boolean isFile(File file) {
        return file.isFile();
    }
}
