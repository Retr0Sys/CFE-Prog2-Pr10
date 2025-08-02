package Ejercicio6;

public class FondosInsuficientesException extends Exception{
    public FondosInsuficientesException(){
        super ("No hay saldo suficiente");
    }

    public FondosInsuficientesException(String mensaje){
        super(mensaje);
    }

}
