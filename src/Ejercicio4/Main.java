package Ejercicio4;

public class Main {
    public static void main(String[] args){

        CatalogoProductos cat1 = new CatalogoProductos();

        Producto p1 = new Producto("001", "Papas fritas", 100);
        Producto p2 = new Producto("002", "Malta", 350);
        Producto p3 = new Producto("003", "Choripan", 200);

      cat1.agregarProductos(p1);
      cat1.agregarProductos(p2);
      cat1.agregarProductos(p3);

      cat1.mostrarProductos();

      cat1.obtenerProductoPorId("001");

      cat1.eliminarProducto("002");

      cat1.mostrarProductos();
    }
}
