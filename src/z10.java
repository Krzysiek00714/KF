import java.util.Scanner;

public class Podatki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wartość produktu: ");
        double cena = scanner.nextDouble();

        double podatekStanowy = 0.04 * cena;
        double podatekLokalny = 0.02 * cena;
        double cenaCalkowita = cena + podatekStanowy + podatekLokalny;

        System.out.println("Wartość produktu: " + cena + " zł");
        System.out.println("Podatek stanowy (4%): " + podatekStanowy + " zł");
        System.out.println("Podatek lokalny (2%): " + podatekLokalny + " zł");
        System.out.println("Cena całkowita: " + cenaCalkowita + " zł");
    }
}
