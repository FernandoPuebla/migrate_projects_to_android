import java.util.Scanner;

public class MenuPrincipal {

    static Scanner entrada = new Scanner(System.in);
    static int opcion, opcion2, saldo, gasto, ahorro;

    public static void mostrarMenu(Cuenta nuevaCuenta) {

        System.out.print("********Escoja una opcion del menu********\n " +
                "1- Ingresar gasto\n 2- Ingresar ahorro\n 3-Consultar estado\n " +
                "4-Ingresar saldo\n  5-Salir\n Opcion: ");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Ingrese la cantidad de gastó ");
                gasto = entrada.nextInt();
                nuevaCuenta.setGasto(gasto);
                nuevaCuenta.setSaldo(nuevaCuenta.getSaldo() - nuevaCuenta.getGasto());
                System.out.print("Usted gastó: " + nuevaCuenta.getGasto() + "\n");
                MenuPrincipal.mostrarMenu(nuevaCuenta);
                break;
            case 2:
                System.out.print("Ingrese la cantidad de quiere ahorrar ");
                ahorro = entrada.nextInt();
                nuevaCuenta.setAhorro(ahorro);
                nuevaCuenta.setSaldo(nuevaCuenta.getSaldo() + nuevaCuenta.getAhorro());
                System.out.print("Usted ahorró: " + nuevaCuenta.getAhorro() + "\n");
                MenuPrincipal.mostrarMenu(nuevaCuenta);
                break;
            case 3:
                System.out.println("Sus movimientos son: ");
                System.out.print("Saldo " + nuevaCuenta.getSaldo() + "\nAhorro " + nuevaCuenta.getAhorro()
                        + "\nGasto " + nuevaCuenta.getGasto() + "\n");
//                nuevaCuenta.getSaldo(saldo);
//                System.out.print("\nSu saldo es de: $" + nuevaCuenta.getSaldo() + "\n");
                MenuPrincipal.mostrarMenu(nuevaCuenta);
                break;
            case 4:
                System.out.print("Ingrese la cantidad de saldo: ");
                saldo = entrada.nextInt();
                nuevaCuenta.setSaldo(saldo);
                System.out.print("Su saldo es de: $" + nuevaCuenta.getSaldo() + "\n");
                MenuPrincipal.mostrarMenu(nuevaCuenta);
                break;
            case 5:
                System.out.print("Hasta pronto");
                break;
        } // fin switch
    } // fin main


}// fin clase MenuPrincipal


