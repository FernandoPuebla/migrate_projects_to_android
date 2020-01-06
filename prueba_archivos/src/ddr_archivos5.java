import javax.swing.*;
import java.io.*;

public class ddr_archivos5 {
    public static void main(String[] args) {
        String ruta = JOptionPane.showInputDialog("Escribe la ruta del fichero");
        String numeros = JOptionPane.showInputDialog("Escribe el numero de numeros aleatorios");
        int numNumerosAleatorios = Integer.parseInt(numeros);

        //Abrimos el fichero desde el final
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(ruta, true));
             DataInputStream dis = new DataInputStream(new FileInputStream(ruta))) {

            escribeFichero(dos, numNumerosAleatorios);
            leeFichero(dis);

        } catch (EOFException e) {
            System.out.println("Fin del fichero");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void escribeFichero(DataOutputStream dos, int numNumerosAleatorios) throws IOException {

        //Escribimos los numeros

        for (int i = 0; i < numNumerosAleatorios; i++) {
            int numero = generaNumerosAleatorios();
            dos.writeInt(numero);
        }

        //Guardamos los cambios
        dos.flush();

    }

    public static void leeFichero(DataInputStream dis) throws IOException {

        //Leemos los numeros hasta el final del fichero
        while (true) {
            System.out.println(dis.readInt());
        }
    }

    public static int generaNumerosAleatorios() {
        int numero = (int) Math.floor(Math.random() * 101);
        return numero;
    }
}
