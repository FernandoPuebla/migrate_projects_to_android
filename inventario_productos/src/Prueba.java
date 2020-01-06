import com.sun.javafx.collections.UnmodifiableObservableMap;

import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        String nombre, categoria, cantidad, precio, id;
        Scanner entrada = new Scanner(System.in);
        ArrayList listProductos = new ArrayList();
        Producto producto1 = new Producto();

        System.out.println("Ingrese el nombre del producto");
//        nombre = entrada.next();
        producto1.setNombre(entrada.next());
        System.out.println("Ingrese el precio del producto");
        producto1.setPrecio(entrada.next());
        System.out.println("Ingrese el id del producto");
        producto1.setId(entrada.next());
        System.out.println("Ingrese la categoría del producto");
        producto1.setCategoria(entrada.next());
        System.out.println("Ingrese la cantidad del producto");
        producto1.setCantidad(entrada.next());

        listProductos.add(producto1);
        Inventario.generarInventario(listProductos);
        Inventario.actualizarInventario(listProductos);
        ArrayList listaLeida = new ArrayList<>();
        listaLeida = Inventario.leerInventario();
        for (Producto producto : (ArrayList<Producto>) listaLeida) {
            System.out.println(producto.getNombre() + "," + producto.getPrecio() + "," + producto.getId()
                    + "," + producto.getCategoria() + "," + producto.getCantidad());
        }
    }
}
