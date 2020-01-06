import java.io.File;

public class ActualizarArchivo {

    public static void main(String[] args) {
        Archivos arch = new Archivos();
        File fNuevo = new File("C:\\Users\\FernandoPueb_5dvr3\\Documents\\prueba_archivos\\actualizar.txt");

        arch.Escribir(fNuevo,"arclos");
        arch.modificar(fNuevo,"arcos","carlos");
    }

}
