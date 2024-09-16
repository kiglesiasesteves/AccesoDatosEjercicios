# Documentación del Programa de Gestión de Archivos y Directorios

Este programa en Java está diseñado para realizar operaciones comunes en archivos y directorios en el sistema de archivos. Las operaciones incluyen la creación, comprobación, eliminación, y gestión de permisos de archivos y directorios.

## Contenido

- [Creación de Directorios y Archivos](#creacion-dirarch)
- [Comprobación de Directorios y Archivos](#comprobar-dirarch)
- [Cálculo de Longitud de Archivos](#calculo-lonxitude)
- [Eliminación de Directorios y Archivos](#borra-dirarchc)
- [Comprobación de Permisos de Archivos](#modoacceso)
- [Mostrar Contenido de Directorios](#mostrar-contido)

## CreacionDirArch

- **Descripción:** Esta clase proporciona métodos para crear directorios y archivos, y para verificar si existen.
- **Métodos:**
    - `CreaDir(String cadea)`: Crea un directorio en la ruta especificada. Muestra un mensaje si el directorio ya existe o si ocurre un error en la creación.
    - `creaFicheiro(String dirName, String fileName)`: Crea un archivo en el directorio especificado. Muestra un mensaje si el archivo ya existe o si ocurre un error en la creación.

## ComprobarDirArch

- **Descripción:** Esta clase permite comprobar si una ruta especificada es un directorio o un archivo.
- **Métodos:**
    - `eDirectorio(String cadea)`: Verifica si la ruta especificada es un directorio y muestra un mensaje correspondiente.
    - `eArchivo(String cadea)`: Verifica si la ruta especificada es un archivo y muestra un mensaje correspondiente.

## CalculoLonxitude

- **Descripción:** Esta clase calcula y muestra la longitud (tamaño) de un archivo en bytes.
- **Métodos:**
    - `calculaLonxitude(String dirName, String fileName)`: Calcula el tamaño del archivo especificado dentro del directorio dado. Muestra un mensaje con el tamaño del archivo en bytes o un mensaje de error si la ruta no es válida.

## BorraDirArchc

- **Descripción:** Esta clase proporciona métodos para eliminar directorios y archivos.
- **Métodos:**
    - `borraDir(String cadea)`: Elimina un directorio en la ruta especificada. Muestra un mensaje si el directorio se borra con éxito o si ocurre un error.
    - `borraFicheiro(String dirName, String fileName)`: Elimina un archivo dentro de un directorio especificado. Muestra un mensaje si el archivo se borra con éxito o si ocurre un error.

## modoAcceso

- **Descripción:** Esta clase verifica los permisos de lectura, escritura y ejecución de archivos y directorios.
- **Métodos:**
    - `eLectura(String cadea)`: Verifica si el archivo tiene permiso de lectura y muestra un mensaje correspondiente.
    - `eEscritura(String cadea)`: Ver
