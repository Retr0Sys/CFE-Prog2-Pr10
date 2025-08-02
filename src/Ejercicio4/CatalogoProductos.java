package Ejercicio4;

import java.util.HashMap;
import java.util.Map;

public class CatalogoProductos {
    Map<String, Producto> CatalogoProductos = new HashMap<>();

    public void agregarProductos(Producto producto) {
        String id = producto.getId();

        if (CatalogoProductos.containsKey(id)) {
            System.out.println("Error: Ya existe un producto con el ID " + id);
        } else {
            CatalogoProductos.put(id, producto);
            System.out.println("El producto " + id + " ha sido agregado con éxito.");
        }
    }

    public void obtenerProductoPorId(String id) {
        if (CatalogoProductos.containsKey(id)) {
            Producto producto = CatalogoProductos.get(id);
            System.out.println("Producto encontrado: " + producto.toString());
        } else {
            System.out.println("Producto no encontrado con ID: " + id);
        }
    }

   public void eliminarProducto(String id) {
        if (CatalogoProductos.containsKey(id)) {
            CatalogoProductos.remove(id);
            System.out.println("El producto a sido eliminado " + id);
        } else {
            System.out.println("Producto no encontrado con ID: " + id);
        }
    }

   public void mostrarProductos() {
        for (Map.Entry<String, Producto> x : CatalogoProductos.entrySet()) {
            Producto producto = x.getValue();
            System.out.println(producto.toString());
        }
    }
}

