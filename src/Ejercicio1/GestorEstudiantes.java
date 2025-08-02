package Ejercicio1;

import java.util.LinkedList;

public class GestorEstudiantes {
    private LinkedList<Estudiante> listaEstudiantes;

    public GestorEstudiantes(){
        System.out.println("Lista completa de estudiantes:");
        this.listaEstudiantes = new LinkedList<>();
    }

    public void agregarEstudiante(Estudiante estudiante){
        listaEstudiantes.add(estudiante);
    }

    public void eliminarEstudiantePorNumeroMatricula(String numeroMatricula) {
        System.out.println("Intentado eliminar estudiante");
        boolean encontrado = false;
        for (Estudiante e : listaEstudiantes) {
            if (e.getNumeroMatricula().equals(numeroMatricula)) {
                encontrado = true;
                listaEstudiantes.remove(e);
                System.out.println("Estudiante eliminado con éxito");
                break;
            }
        }
        if(!encontrado){
            System.out.println("La matrícula solicitada no existe");
        }
    }

    public void mostrarEstudiantes(){
        for(Estudiante e : listaEstudiantes){
            System.out.println(e.toString());
        }
    }

}
