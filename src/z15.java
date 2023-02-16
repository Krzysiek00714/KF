import java.util.Scanner;

public class ZyskZeSprzedazy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj cenę detaliczną płytki: ");
        double cenaDetaliczna = input.nextDouble();

        double zysk = cenaDetaliczna * 0.4;

        System.out.println("Zysk ze sprzedaży: " + zysk);
    }
}
