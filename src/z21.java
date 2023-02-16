import java.util.Scanner;

public class ProcentSkladany {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj kwotę początkowo zdeponowaną na koncie: ");
        double P = input.nextDouble();

        System.out.print("Podaj roczną stopę oprocentowania (w %): ");
        double r = input.nextDouble() / 100;

        System.out.print("Podaj, ile razy w roku odsetki są kapitalizowane: ");
        int n = input.nextInt();

        System.out.print("Podaj liczbę lat, przez jakie środki będą znajdować się na koncie: ");
        int t = input.nextInt();

        double A = P * Math.pow(1 + r/n, n*t);

        System.out.printf("Stan konta po %d latach wyniesie %.2f zł.", t, A);
    }
}
