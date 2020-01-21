import javax.swing.plaf.synth.SynthScrollBarUI;
import java.util.Scanner;

public class MenuPrincipal {
    public void mostrarMenu() {
        Scanner input = new Scanner(System.in);
        int opcion;
        IngresoDatos ingreso = new IngresoDatos();
        ConsultaDatos consulta = new ConsultaDatos();
        System.out.print("********Escoja una opcion del menu********\n " +
                "1- Ingresar gasto/ahorro\n 2- Consultar estado\n 3- Salir\n Opcion: ");
        opcion = input.nextInt();
        switch (opcion) {
            case 1:
                ingreso.escogerOpcion();
                break;
            case 2:
//                System.out.println();
                consulta.consultarGeneral();
                break;
            case 3:
                break;
        }
    }
}
