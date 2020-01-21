import java.util.Scanner;

public class Estrellas {
    public static void main(String[] args) {

        final int TIROS = 10, SALVADAS = 3;
        int cantidadEstrellas, cantidadTiros, restantes, usadas, recuperadas;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese al cantidad de estrellas que tiene: ");
        cantidadEstrellas = entrada.nextInt();
        System.out.print("Ingrese la cantidad de veces que tirará 10 tiros ");
        cantidadTiros = entrada.nextInt();
        usadas = (cantidadTiros * TIROS);
        recuperadas = (cantidadTiros * SALVADAS);
        restantes = cantidadEstrellas - usadas + recuperadas;
        System.out.print("Le quedan: " + restantes + ", se usaron: " + usadas + " se recuperaron " + recuperadas);
    }
}
