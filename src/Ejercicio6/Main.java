package Ejercicio6;

public class Main {
    public static void main(String[] args) {

        CajeroAutomatico c1 = new CajeroAutomatico(100);

        try{
            c1.retirarDinero(25);
        }catch (CantidadInvalidaException | FondosInsuficientesException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println(c1.getSaldo());
        }
    }
}
