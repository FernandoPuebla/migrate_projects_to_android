import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoGenerado {
    public static void main(String[] args) throws IOException {
        String ruta = "C:/Users/FernandoPueb_5dvr3/Documents/migrate_projects_to_android/gestor_de_dinero/archivo.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if (archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("El fichero de texto ya estaba creado.");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();
    }
}
