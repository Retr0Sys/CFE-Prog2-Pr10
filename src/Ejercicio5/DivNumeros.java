package Ejercicio5;


import java.util.Scanner;

public class DivNumeros {
    public static void main(String[] args) {


        Scanner leer = new Scanner(System.in);
    try {
        System.out.println("Ingrese un número");
        String num1 = leer.next();
        System.out.println("Ingrese otro número");
        String num2 = leer.next();

        int num1Int = Integer.parseInt(num1);
        int num2Int = Integer.parseInt(num2);


        int resultado = num1Int / num2Int;
        System.out.println("Resultado: " + resultado);
    }catch(NumberFormatException e ){
        System.out.println("Los valores ingresados no son validos");
    }catch(ArithmeticException e ){
        System.out.println("Se intenta dividir entre cero");
    }


    }
}
