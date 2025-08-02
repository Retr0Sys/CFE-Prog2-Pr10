package Ejercicio6;

public class CajeroAutomatico {
    private double saldo;


    public CajeroAutomatico(double Saldo){
        this.saldo = Saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double Saldo) {
        this.saldo = Saldo;
    }

    public void retirarDinero(double cantidad) throws FondosInsuficientesException, CantidadInvalidaException {
        if (this.saldo < cantidad) {
            throw new FondosInsuficientesException();
        }if (cantidad < 0 || cantidad % 10 != 0) {
            throw new CantidadInvalidaException();
        } else {
            this.saldo -= cantidad;
        }
    }
}