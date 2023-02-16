import java.util.Scanner;

public class KilometryNaLitr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj liczbę przejechanych kilometrów: ");
        double km = input.nextDouble();

        System.out.print("Podaj liczbę zużytych litrów paliwa: ");
        double litry = input.nextDouble();

        double kmNaLitr = km / litry;

        System.out.println("Liczba kilometrów na litrze: " + kmNaLitr);
    }
}
