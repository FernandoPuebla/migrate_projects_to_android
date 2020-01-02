import java.awt.*;

public class ConsultaDatos {
    IngresoDatos datos = new IngresoDatos();
    MenuPrincipal menu = new MenuPrincipal();
    private int saldo, abono, gasto;

    public void consultarGeneral() {
        /*saldo = datos.getSaldo();
        abono = datos.getAbono();
        gasto = datos.getGasto();*/
        System.out.println("Sus movimientos son: \nSaldo: $" + datos.getSaldo()
                + "\nAhorro: $" + datos.getAbono() + "\nGasto: $" + datos.getGasto());
        menu.mostrarMenu();
    }

    public void consultarSaldo() {
        System.out.println("Su saldo actual es de: $" );
    }

    public void consultarAhorro() {
        System.out.println("Su saldo actual es de: $");
    }

    public void consultarGasto() {
        System.out.println("Su saldo actual es de: $");
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getAbono() {
        return abono;
    }

    public void setAbono(int abono) {
        this.abono = abono;
    }

    public int getGasto() {
        return gasto;
    }

    public void setGasto(int gasto) {
        this.gasto = gasto;
    }
}
