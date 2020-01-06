import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {

    int cantidadDeProducto;

    //organizar productos por categoría se tiene que hacer

    public static void generarInventario(ArrayList lista) {
        FileWriter flwriter;
        flwriter = null;
        try {
            String ruta = "C:\\Users\\FernandoPueb_5dvr3\\Documents\\migrate_projects_to_android\\inventario_productos\\inventario.txt";
            File file = new File(ruta);
            if (!file.exists()){
                file.createNewFile();
            }
            //crea el flujo para escribir en el archivo
            flwriter = new FileWriter(file);//"C:\\Users\\FernandoPueb_5dvr3\\Documents\\prueba_archivos\\lista.txt");
            //crea un buffer o flujo intermedio antes de escribir directamente en el archivo
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            for (Producto producto : (ArrayList<Producto>) lista) {
                //escribe los datos en el archivo
                bfwriter.write(producto.getNombre() + "," + producto.getPrecio() + "," + producto.getId()
                        + "," + producto.getCategoria() + "," + producto.getCantidad() + "\n");
            }
            //cierra el buffer intermedio
            bfwriter.close();
            System.out.println("Archivo creado satisfactoriamente..");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {//cierra el flujo principal
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static ArrayList leerInventario() {
        String ruta = "C:\\Users\\FernandoPueb_5dvr3\\Documents\\migrate_projects_to_android\\inventario_productos\\inventario.txt";
        File file = new File(ruta);
        ArrayList listaProductos = new ArrayList<>();
        Scanner scanner;
        try {
            //se pasa el flujo al objeto scanner
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                // el objeto scanner lee linea a linea desde el archivo
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                //se usa una expresión regular
                //que valida que antes o despues de una coma (,) exista cualquier cosa
                //parte la cadena recibida cada vez que encuentre una coma
                delimitar.useDelimiter("\\s*,\\s*");
                Producto e = new Producto();
                e.setNombre(delimitar.next());
                e.setPrecio(delimitar.next());
                e.setId(delimitar.next());
                e.setCategoria(delimitar.next());
                e.setCantidad(delimitar.next());
                listaProductos.add(e);
            }
            //se cierra el ojeto scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return listaProductos;
    }

    public static void actualizarInventario(ArrayList lista) {
        FileWriter flwriter = null;
        try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros
            flwriter = new FileWriter("C:\\Users\\FernandoPueb_5dvr3\\Documents\\migrate_projects_to_android\\inventario_productos\\inventario.txt", true);
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            for (Producto producto : (ArrayList<Producto>) lista) {
                //escribe los datos en el archivo
                bfwriter.write(producto.getNombre() + "," + producto.getPrecio() + "," + producto.getId()
                        + "," + producto.getCategoria() + "," + producto.getCantidad() + "\n");
            }
            bfwriter.close();
            System.out.println("Archivo modificado satisfactoriamente..");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void resumirInventario() {
        //debe incluir las cantidades de los distintos prouctos ordenados por categoría
    }

}
