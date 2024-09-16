import java.io.File;
import java.io.IOException;

/**
 * La clase CreacionDirArch proporciona métodos para la creación de directorios y archivos
 * en el sistema de archivos. Verifica si los directorios y archivos existen antes de crearlos,
 * y maneja posibles errores durante las operaciones.
 *
 * Los mensajes de éxito o error están definidos como constantes de clase.
 */
public class CreacionDirArch {

    // Constantes para los mensajes de salida
    final private String existeDir = "O directorio xa existe";
    final private String CreacionDir = "O directorio foi creado";
    final private String errorCreacionDir = "Existe un erro na creacion do directorio";

    final private String existeArchivo = "O arquivo xa existe";
    final private String CreacionArchivo = "O arquivo foi creado";
    final private String errorCreacionArch = "Existe un erro na creacion do arquivo";

    /**
     * Crea un directorio si no existe. Si el directorio ya existe, muestra un mensaje
     * indicando tal situación. Si el directorio es creado exitosamente, también informa de ello.
     *
     * @param cadea Ruta del directorio que se desea crear.
     */
    public void CreaDir(String cadea) {
        File file = new File(cadea);
        if (ComprobarDirectorio(file)) {
            System.out.println(existeDir);
        } else {
            if (creacionDir(file)) {
                System.out.println(CreacionDir);
            } else {
                System.out.println(errorCreacionDir);
            }
        }
    }

    /**
     * Crea el directorio especificado.
     *
     * @param file Objeto File que representa el directorio a crear.
     * @return {@code true} si el directorio se creó correctamente; {@code false} si no.
     */
    private static boolean creacionDir(File file) {
        return file.mkdir();
    }

    /**
     * Comprueba si el objeto File especificado es un directorio existente.
     *
     * @param file Objeto File que representa el directorio a comprobar.
     * @return {@code true} si el directorio existe; {@code false} si no.
     */
    private static boolean ComprobarDirectorio(File file) {
        return file.isDirectory();
    }

    /**
     * Crea un archivo en un directorio existente. Verifica si el directorio especificado
     * existe y, si el archivo no existe, lo crea. Si el archivo ya existe, muestra un mensaje.
     *
     * @param dirName Nombre del directorio donde se creará el archivo.
     * @param fileName Nombre del archivo que se desea crear.
     */
    public void creaFicheiro(String dirName, String fileName) {
        File dir = new File(dirName);
        if (dir.isDirectory()) {
            File file = new File(dir, fileName);
            if (!file.exists()) {
                creacionFichero(file);
            } else {
                System.out.println(existeArchivo);
            }
        } else {
            System.out.println("A ruta especificada non é un directorio");
        }
    }

    /**
     * Crea el archivo especificado. Si la creación tiene éxito, muestra un mensaje de éxito.
     * Si ocurre un error, muestra un mensaje de error.
     *
     * @param file Objeto File que representa el archivo a crear.
     */
    private void creacionFichero(File file) {
        try {
            if (file.createNewFile()) {
                System.out.println(CreacionArchivo);
            } else {
                System.out.println(errorCreacionArch);
            }
        } catch (IOException e) {
            System.out.println("Erro ao crear o ficheiro: " + e.getMessage());
        }
    }
}
