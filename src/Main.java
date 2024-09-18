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

    // Verificar permisos de escritura y lectura en el directorio
    modoAcceso.comprobarPermisos("/home/dam/IdeaProjects/arquivosdir");

    // Calcular y mostrar la longitud de un archivo en bytes
    calculoLonxitude.calculaLonxitude("/home/dam/IdeaProjects/arquivosdir", "Products1.txt");

    // Eliminar el archivo especificado
    borraDirArchc.borraFicheiro("/home/dam/IdeaProjects/arquivosdir", "Products1.txt");

    //Forzar al archivo que sea solo de lectura
    modoAcceso.hacerSoloLectura("/home/dam/IdeaProjects/arquivosdir/Products1.txt");

    //Forzar el archivo a que vuelva a ser de escritura
    modoAcceso.hacerEscribible("/home/dam/IdeaProjects/arquivosdir/Products1.txt");

    //Mostrar subdirectorios y archivos de un directorio
    mostrarContido.mostrarContenido("/home/dam/IdeaProjects/arquivosdir");
}
}
