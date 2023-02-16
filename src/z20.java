
import java.util.Scanner;

public class Ciasteczka {

    public static void main(String[] args) {

        // stałe reprezentujące ilości składników na 48 ciasteczek
        final double CUKIER_48 = 1.5;
        final double MASLO_48 = 1.0;
        final double MAKA_48 = 2.75;

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj oczekiwaną liczbę ciasteczek: ");
        int iloscCiasteczek = input.nextInt();

        // obliczanie ilości składników dla pożądanej liczby ciasteczek
        double iloscCukru = (CUKIER_48 * iloscCiasteczek) / 48;
        double iloscMasla = (MASLO_48 * iloscCiasteczek) / 48;
        double iloscMaki = (MAKA_48 * iloscCiasteczek) / 48;

        // wyświetlanie wyników
        System.out.printf("Do upieczenia %d ciasteczek potrzeba:\n", iloscCiasteczek);
        System.out.printf("%.2f szklanki cukru\n", iloscCukru);
        System.out.printf("%.2f szklanki masła\n", iloscMasla);
        System.out.printf("%.2f szklanki mąki\n", iloscMaki);
    }
}
