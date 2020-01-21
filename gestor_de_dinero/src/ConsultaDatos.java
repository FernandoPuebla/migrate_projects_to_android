public class ConsultaDatos {
    IngresoDatos ingresoD = new IngresoDatos();
    MenuPrincipal menu = new MenuPrincipal();
    private int saldoAct, abonoAct, gastoAct;

    public void consultarGeneral() {
        saldoAct = ingresoD.getSaldo();

        System.out.println("Sus movimientos son: \nSaldo: $" + saldoAct);
//        System.out.println("Sus movimientos son: \nSaldo: $" + datos.getSaldo()
//                + "\nAhorro: $" + datos.getAbono() + "\nGasto: $" + datos.getGasto());
        ingresoD.escogerOpcion();
    }

    public void consultarSaldo() {
        System.out.println("Su saldo actual es de: $");
    }

    public void consultarAhorro() {
        System.out.println("Su saldo actual es de: $");
    }

    public void consultarGasto() {
        System.out.println("Su saldo actual es de: $");
    }

    public int getSaldoAct() {
        return saldoAct;
    }

    public void setSaldoAct(int saldoAct) {
        this.saldoAct = saldoAct;
    }

    public int getAbonoAct() {
        return abonoAct;
    }

    public void setAbonoAct(int abonoAct) {
        this.abonoAct = abonoAct;
    }

    public int getGastoAct() {
        return gastoAct;
    }

    public void setGastoAct(int gastoAct) {
        this.gastoAct = gastoAct;
    }
}

