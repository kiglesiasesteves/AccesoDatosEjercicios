import java.io.File;

/**
 * La clase BorraDirArchc proporciona métodos para borrar un directorio o un archivo del sistema de archivos.
 * Verifica si el directorio o archivo existen antes de intentar eliminarlos y proporciona mensajes de éxito o error.
 */
public class BorraDirArchc {

    /**
     * Borra un directorio especificado por la ruta. Si el directorio existe y es borrado correctamente,
     * imprime un mensaje de confirmación; de lo contrario, indica que el directorio no pudo ser borrado.
     *
     * @param cadea Ruta del directorio que se desea borrar.
     */
    public void borraDir(String cadea) {
        File file = new File(cadea);
        if (file.exists() && file.isDirectory()) {
            if (file.delete()) {
                System.out.println("Directorio borrado");
            } else {
                System.out.println("Directorio non borrado");
            }
        } else {
            System.out.println("A ruta especificada non é un directorio ou non existe");
        }
    }

    /**
     * Borra un archivo en un directorio existente. Verifica si el directorio y el archivo existen
     * antes de intentar eliminarlos. Proporciona mensajes de éxito o error según el resultado de la operación.
     *
     * @param dirName  Nombre o ruta del directorio que contiene el archivo.
     * @param fileName Nombre del archivo que se desea borrar.
     */
    public void borraFicheiro(String dirName, String fileName) {
        File dir = new File(dirName);
        File file = new File(dir, fileName);
        if (dir.isDirectory() && file.isFile()) {
            if (file.delete()) {
                System.out.println("Ficheiro borrado");
            } else {
                System.out.println("Ficheiro non borrado");
            }
        } else {
            System.out.println("A ruta especificada non é un directorio ou o ficheiro non existe");
        }
    }
}
