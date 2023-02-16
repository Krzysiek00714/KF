import java.util.Scanner;

public class WynikiTestow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj wynik z pierwszego testu: ");
        int wynik1 = input.nextInt();

        System.out.print("Podaj wynik z drugiego testu: ");
        int wynik2 = input.nextInt();

        System.out.print("Podaj wynik z trzeciego testu: ");
        int wynik3 = input.nextInt();

        int sumaWynikow = wynik1 + wynik2 + wynik3;
        double srednia = (double) sumaWynikow / 3;

        System.out.println("Wynik z pierwszego testu: " + wynik1);
        System.out.println("Wynik z drugiego testu: " + wynik2);
        System.out.println("Wynik z trzeciego testu: " + wynik3);
        System.out.println("Średnia wyników: " + srednia);
    }
}

