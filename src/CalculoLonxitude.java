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
        File dir = new File(dirName);
        File file = new File(dir, fileName);

        if (dir.isDirectory()) {
            if (file.isFile()) {
                System.out.println("A lonxitude en bytes de ese ficheiro é de " + file.length());
            } else {
                System.out.println("A ruta especificada non é un arquivo");
            }
        } else {
            System.out.println("A ruta especificada non é un directorio");
        }
    }
}
