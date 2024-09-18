import java.io.File;

/**
 * La clase MostrarContido proporciona un método para listar y mostrar los nombres de los archivos y subdirectorios
 * contenidos en un directorio especificado. Verifica si la ruta proporcionada es un directorio antes de intentar listar
 * su contenido.
 */
public class mostrarContido {
    static String notDirectory = "A ruta especificada non é un directorio";

    /**
     * Muestra el contenido de un directorio especificado, imprimiendo los nombres de todos los archivos y subdirectorios
     * contenidos en el directorio.
     *
     * @param dirName Ruta del directorio cuyo contenido se desea mostrar.
     */
    public void mostrarContenido(String dirName) {
        File dir = new File(dirName);
        if (dir.isDirectory()) {
            recorrerDirectorio(dir);
        } else {
            System.out.println(notDirectory);
        }
    }

    /**
     * Método recursivo para mostrar todos los subdirectorios y archivos de un directorio.
     *
     * @param dir El directorio cuyo contenido se desea listar.
     */
    private void recorrerDirectorio(File dir) {
        File[] archivos = dir.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                System.out.println(archivo.getPath());
                if (archivo.isDirectory()) {
                    recorrerDirectorio(archivo);  // Llamada recursiva para subdirectorios
                }
            }
        }
    }
}
