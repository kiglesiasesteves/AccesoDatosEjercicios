public class Main {
public static void main(String[] args) {
    // Crear instancias de las clases necesarias
    ComprobarDirArch comprobarDirArch = new ComprobarDirArch();
    mostrarContido mostrarContido = new mostrarContido();
    modoAcceso modoAcceso = new modoAcceso();
    CalculoLonxitude calculoLonxitude = new CalculoLonxitude();
    BorraDirArchc borraDirArchc = new BorraDirArchc();

    // Comprobar si una ruta es un directorio
    comprobarDirArch.eDirectorio("/home/dam/IdeaProjects/arquivosdir");

    // Comprobar si una ruta es un archivo
    comprobarDirArch.eArchivo("/home/dam/IdeaProjects/arquivosdir/Products1.txt");

    // Mostrar el contenido de un directorio
    mostrarContido.mContido("/home/dam/IdeaProjects/arquivosdir");

    // Verificar permisos de escritura y lectura en el directorio
    modoAcceso.eEscritura("/home/dam/IdeaProjects/arquivosdir");
    modoAcceso.eLectura("/home/dam/IdeaProjects/arquivosdir");

    // Calcular y mostrar la longitud de un archivo en bytes
    calculoLonxitude.calculaLonxitude("/home/dam/IdeaProjects/arquivosdir", "Products1.txt");

    // Eliminar el archivo especificado
    borraDirArchc.borraFicheiro("/home/dam/IdeaProjects/arquivosdir", "Products1.txt");
}
}
