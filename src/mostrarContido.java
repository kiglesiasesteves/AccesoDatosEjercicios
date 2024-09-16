import java.io.File;

/**
 * La clase mostrarContido proporciona un método para listar y mostrar los nombres de los archivos y subdirectorios
 * contenidos en un directorio especificado. Verifica si la ruta proporcionada es un directorio antes de intentar listar
 * su contenido.
 */
public class mostrarContido {
    // Array para almacenar los nombres de los archivos y subdirectorios en el directorio
    String[] files = null;

    /**
     * Muestra el contenido de un directorio especificado, imprimiendo los nombres de todos los archivos y subdirectorios
     * contenidos en el directorio.
     *
     * @param dirName Ruta del directorio cuyo contenido se desea mostrar.
     */
    public void mContido(String dirName) {
        File dir = new File(dirName);
        if (dir.isDirectory()) {
            files = dir.list();
            // Verifica que el array de archivos no sea nulo
            assert files != null;
            // Imprime los nombres de los archivos y subdirectorios
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("A ruta especificada non é un directorio");
        }
    }
}
