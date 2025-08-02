package Ejercicio6;

public class CantidadInvalidaException extends  Exception{
    public CantidadInvalidaException(){
        super ("Valores negativos o no son multiplos de 10");
    }
    public CantidadInvalidaException(String mensaje){
        super(mensaje);
    }
}
