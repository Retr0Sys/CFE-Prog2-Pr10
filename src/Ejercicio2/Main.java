package Ejercicio2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            listaNumeros.add(random.nextInt(1000) + 1);
        }

        System.out.println("Lista de números:");
        System.out.println(listaNumeros);

        //suma
        double suma = 0;
        for (int e : listaNumeros) {
            suma += e;
        }
        System.out.println("La suma de los números es: " + suma);

        //promedio
        double promedio = suma / 100;
        System.out.println("El promedio es: " + promedio);

        //Máximo
        int maximo = listaNumeros.get(0);

        for (int i = 0; i < 100; i++) {
           if(maximo < listaNumeros.get(i)){
               maximo = listaNumeros.get(i);
           }
        }
        System.out.println("El valor máximo es: " + maximo);
    }
}