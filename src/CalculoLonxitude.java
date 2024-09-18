import java.io.File;

/**
 * La clase CalculoLonxitude proporciona un método para calcular la longitud (tamaño) de un archivo en bytes.
 * Verifica si la ruta especificada es un archivo dentro de un directorio existente antes de calcular su tamaño.
 */
public class CalculoLonxitude {

    /**
     * Calcula la longitud de un archivo en bytes, dado el nombre de un directorio y el nombre del archivo.
     * Verifica si la ruta proporcionada es un directorio y si el archivo existe dentro de ese directorio.
     *
     * @param dirName  Nombre o ruta del directorio que contiene el archivo.
     * @param fileName Nombre del archivo cuyo tamaño se desea calcular.
     */
    public void calculaLonxitude(String dirName, String fileName) {
        File dir = getDir(dirName);
        File file = getFile(fileName, dir);

        if (isDirectory(dir)) {
            if (isFile(file)) {
                System.out.println("A lonxitude en bytes de ese ficheiro é de " + file.length());
            } else {
                System.out.println("A ruta especificada non é un arquivo");
            }
        } else {
            System.out.println("A ruta especificada non é un directorio");
        }
    }

    /**
     * Verifica si el objeto `File` es un archivo.
     *
     * @param file Objeto `File` que representa el archivo a comprobar.
     * @return {@code true} si es un archivo; {@code false} en caso contrario.
     */
    private static boolean isFile(File file) {
        return file.isFile();
    }

    /**
     * Verifica si el objeto `File` es un directorio.
     *
     * @param dir Objeto `File` que representa el directorio a comprobar.
     * @return {@code true} si es un directorio; {@code false} en caso contrario.
     */
    private static boolean isDirectory(File dir) {
        return dir.isDirectory();
    }

    /**
     * Crea un objeto `File` a partir del nombre del archivo y el directorio especificado.
     *
     * @param fileName Nombre del archivo.
     * @param dir Objeto `File` que representa el directorio.
     * @return Un objeto `File` que representa el archivo especificado dentro del directorio.
     */
    private static File getFile(String fileName, File dir) {
        File file = new File(dir, fileName);
        return file;
    }

    /**
     * Crea un objeto `File` a partir del nombre del directorio especificado.
     *
     * @param dirName Nombre del directorio.
     * @return Un objeto `File` que representa el directorio especificado.
     */
    private static File getDir(String dirName) {
        File dir = new File(dirName);
        return dir;
    }
}
