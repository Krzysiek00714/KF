import java.util.Scanner;

public class PodatkiOdSprzedazy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj wartość produktu: ");
        double cena = input.nextDouble();

        double podatekStanowy = cena * 0.04;
        double podatekLokalny = cena * 0.02;
        double lacznaCena = cena + podatekStanowy + podatekLokalny;

        System.out.println("Wartość produktu: " + cena);
        System.out.println("Podatek stanowy (4%): " + podatekStanowy);
        System.out.println("Podatek lokalny (2%): " + podatekLokalny);
        System.out.println("Łączna cena sprzedaży: " + lacznaCena);
    }
}
