import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ddr_archivos4 {
    public static void main(String[] args) {
        String origen = JOptionPane.showInputDialog("Escribe la ruta del origen");
        String destino = JOptionPane.showInputDialog("Escribe la ruta del destino");

        copiaFicheros(origen, destino);

    }

    public static void copiaFicheros(String origen, String destino) {

        try (FileInputStream fis = new FileInputStream(origen);
             FileOutputStream fos = new FileOutputStream(destino)) {

            //Creamos un array de bytes con el tamaño del fichero de origen
            byte byteA[] = new byte[fis.available()];

            //Copia todos los bytes del fichero al array
            fis.read(byteA);

            //Escribe todos los bytes en el fichero de destino
            fos.write(byteA);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
