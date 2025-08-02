package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        ColeccionDeLibros libreria = new ColeccionDeLibros();
        //Creamos libros de ejemplo
        Libros libro1 = new Libros("El Principito", "Antoine de Saint-Exupéry", "123");
        Libros libro2 = new Libros("Cien años de soledad", "Gabriel García Márquez", "456");
        //Agregamos los libros
        libreria.agregarLibro(libro1);
        libreria.agregarLibro(libro2);
        //Probamos funcionalidades
        libreria.mostrarLibros();

        Libros buscado = libreria.buscarPorTitulo("El Principito");
        if (buscado != null) {
            System.out.println("Encontrado: " + buscado.getTitulo());
        }

        libreria.eliminarLibro("123");
        libreria.mostrarLibros();
    }
}