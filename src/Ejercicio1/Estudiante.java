package Ejercicio1;

public class Estudiante {
    protected String nombre;
    protected int edad;
    private String numeroMatricula;


    public Estudiante(String nombre, int edad, String numeroMatricula){
        this.nombre = nombre;
        this.edad = edad;
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String toString() {
        return "Estudiante:" +
                " nombre:" + nombre +
                ", edad:" + edad +
                ", numeroMatricula:" + numeroMatricula;
    }
    public String getNumeroMatricula(){
        return numeroMatricula;
    }
    public void setNumeroMatricula(String matricula){
        numeroMatricula = matricula;
    }
}

