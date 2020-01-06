import java.util.Scanner;

public class IngresoDatos {
    private int saldo = 300;
    private int abonoNuev = 100;
    private int gastoNuev = 200;

    MenuPrincipal menu = new MenuPrincipal();
//    ConsultaDatos consulta = new ConsultaDatos();

    public void escogerOpcion() {

        Scanner input = new Scanner(System.in);
        int opcion;
//        boolean band = false;
        System.out.println("saldo " + saldo);
        while (saldo == 0) {
            ingresarSaldoInicial();
        }

        System.out.print ("********Escoja una opcion del menu********\n " +
                "1- Ingresar gasto\n 2- Ingresar ahorro\n 3- Volver al menu anterior\n Opcion: ");
        opcion = input.nextInt();
        switch (opcion) {
            case 1:
                ingresarGasto();
                escogerOpcion();
                break;
            case 2:
                ingresarAhorro();
                escogerOpcion();
                break;
            case 3:
                volverMenuAnterior();
                break;
        }// fin switch
    } // fin funcion escogerOpcion

    public void ingresarSaldoInicial() {
        int saldoInic;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese una cantidad mayor a 0: $");
        saldoInic = in.nextInt();
        System.out.println("Tiene un saldo inicial de: $" + saldoInic);
        saldo = saldoInic;
        System.out.println("Tiene un saldo de: $" + saldo);

    } // fin ingresarSaldoInicial

    public void ingresarGasto() {
        Scanner in = new Scanner(System.in);
        int gasto;
        System.out.print("Ingrese la cantidad que gastó $");
        gasto = in.nextInt();
        saldo = saldo - gasto;
        System.out.println("Usted gastó $" + gasto + ", su saldo actual es de $" + saldo);

        //        consulta.setGasto(gasto);
    }// fin ingresarGasto

    public void ingresarAhorro() {
        Scanner in = new Scanner(System.in);
        int abono;
        System.out.println("Ingrese la cantidad que va a guardar");
        abono = in.nextInt();
        saldo = saldo + abono;
        System.out.println("Usted abonó $" + abono + ", su saldo actual es de $" + saldo);
//        consulta.setAbono(abono); consulta.setSaldo(saldo);
    }// fin ingresarAhorro

    public void volverMenuAnterior() {
        menu.mostrarMenu();
    }// fin volverMenuAnterior

    public int getAbonoNuev() {
        return abonoNuev;
    }

    public void setAbonoNuev(int abonoNuev) {
        this.abonoNuev = abonoNuev;
    }

    public int getGastoNuev() {
        return gastoNuev;
    }

    public void setGastoNuev(int gastoNuev) {
        this.gastoNuev = gastoNuev;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}

