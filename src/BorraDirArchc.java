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
        File dir = getFile(cadea);
        if (canBeDeletedDir(dir, true)) {
            if (isDeleted(dir)) {
                System.out.println("Directorio borrado");
            } else {
                System.out.println("Directorio non borrado");
            }
        } else {
            System.out.println("A ruta especificada non é un directorio ou non existe");
        }
    }

    /**
     * Elimina el archivo o directorio especificado.
     *
     * @param dir Objeto `File` que representa el archivo o directorio a eliminar.
     * @return {@code true} si el archivo o directorio fue eliminado; {@code false} en caso contrario.
     */
    private static boolean isDeleted(File dir) {
        return dir.delete();
    }

    /**
     * Borra un archivo en un directorio existente. Verifica si el directorio y el archivo existen
     * antes de intentar eliminarlos. Proporciona mensajes de éxito o error según el resultado de la operación.
     *
     * @param dirName  Nombre o ruta del directorio que contiene el archivo.
     * @param fileName Nombre del archivo que se desea borrar.
     */
    public void borraFicheiro(String dirName, String fileName) {
        File dir = getFile(dirName);
        File file = new File(dir, fileName);
        if (canBeDeletedFich(dir, file)) {
            if (isDeleted(file)) {
                System.out.println("Ficheiro borrado");
            } else {
                System.out.println("Ficheiro non borrado");
            }
        } else {
            System.out.println("A ruta especificada non é un directorio ou o ficheiro non existe");
        }
    }

    /**
     * Verifica si un archivo puede ser eliminado.
     *
     * @param dir  Objeto `File` que representa el directorio que contiene el archivo.
     * @param file Objeto `File` que representa el archivo a verificar.
     * @return {@code true} si el directorio es válido y el archivo existe; {@code false} en caso contrario.
     */
    private static boolean canBeDeletedFich(File dir, File file) {
        return canBeDeletedDir(dir, false) && file.isFile();
    }

    /**
     * Verifica si un archivo o directorio puede ser eliminado.
     *
     * @param file Objeto `File` que representa el archivo o directorio a verificar.
     * @param isDir Indica si se está verificando un directorio.
     * @return {@code true} si el archivo o directorio puede ser eliminado; {@code false} en caso contrario.
     */
    private static boolean canBeDeletedDir(File file, boolean isDir) {
        return file.exists() && (!isDir || file.isDirectory());
    }

    /**
     * Crea un objeto `File` a partir de la ruta especificada.
     *
     * @param cadea Ruta del archivo o directorio.
     * @return Un objeto `File` que representa el archivo o directorio especificado.
     */
    private static File getFile(String cadea) {
        return new File(cadea);
    }
}