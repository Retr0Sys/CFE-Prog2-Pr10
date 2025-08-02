package Ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class ColeccionDeLibros {
    private Set<Libros> colecLibros = new HashSet<>();

    public void agregarLibro(Libros libro) {
        colecLibros.add(libro);
    }

    public void eliminarLibro(String ISBN) {
        System.out.println("Solicitando eliminación del libro...");
        for (Libros libro : colecLibros) {
            if (libro.getISBN().equals(ISBN)) {
                colecLibros.remove(libro);
                System.out.println("Libro eliminado.");
                break;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public Libros buscarPorTitulo(String titulo) {
        System.out.println("Buscando libro...");
        for (Libros libro : colecLibros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void mostrarLibros() {
        System.out.println("Librería The other side");
        System.out.println("------------------------");
        for (Libros libro : colecLibros) {
            System.out.println("Nombre: "+ libro.getTitulo() + " - " + "Autor: "+ libro.getAutor() + " - " + "ISBN: "+ libro.getISBN());
        }
    }
}