import java.util.Scanner;

public class Cuenta {

    private float cantidadBase, gasto, ahorro, saldo;
    Scanner entrada = new Scanner(System.in);

    public void ingresarSaldo() {
        System.out.print("Ingrese la candidad de su saldo: $");
        saldo = entrada.nextInt();
        System.out.println("Tu saldo es de: " + saldo);
    }

    public void ingresarGasto() {
        System.out.print("Ingrese la cantidad que gastó: $");
        gasto = entrada.nextInt();
    }

    public void ingresarAhorro() {
        System.out.print("Ingrese la cantidad a ahorrar: $ ");
        ahorro = entrada.nextInt();
    }

    public void consultarSaldo() {

    }


    public float getCantidadBase() {
        return cantidadBase;
    }

    public void setCantidadBase(float cantidadBase) {
        this.cantidadBase = cantidadBase;
    }

    public float getGasto() {
        return gasto;
    }

    public void setGasto(float gasto) {
        this.gasto = gasto;
    }

    public float getAhorro() {
        return ahorro;
    }

    public void setAhorro(float ahorro) {
        this.ahorro = ahorro;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
