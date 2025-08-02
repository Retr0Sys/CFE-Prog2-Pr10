package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Crear instancia del gestor
        GestorEstudiantes gestor = new GestorEstudiantes();

        // Crear algunos estudiantes
        Estudiante estudiante1 = new Estudiante("Ana",20,"MAT001");
        Estudiante estudiante2 = new Estudiante("Luis",22,"MAT002");
        Estudiante estudiante3 = new Estudiante("Maria",19,"MAT003");


        // Agregar estudiantes al gestor
        gestor.agregarEstudiante(estudiante1);
        gestor.agregarEstudiante(estudiante2);
        gestor.agregarEstudiante(estudiante3);

        // Mostrar estudiantes
        gestor.mostrarEstudiantes();

        // Eliminar uno
        gestor.eliminarEstudiantePorNumeroMatricula("MAT004");

        // Mostrar nuevamente
        System.out.println("Lista actualizada de estudiantes:");
        gestor.mostrarEstudiantes();
    }
}