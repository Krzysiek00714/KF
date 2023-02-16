import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prośba o wprowadzenie ceny posiłku
        System.out.print("Podaj cenę posiłku: ");
        double cenaPosilku = input.nextDouble();

        // Obliczanie podatku i napiwku
        double podatek = cenaPosilku * 0.0675;
        double napiwek = (cenaPosilku + podatek) * 0.20;

        // Obliczanie łącznej kwoty do zapłaty
        double lacznaKwota = cenaPosilku + podatek + napiwek;

        // Wyświetlanie wyników
        System.out.println("Cena posiłku: " + cenaPosilku);
        System.out.println("Podatek: " + podatek);
        System.out.println("Napiwek: " + napiwek);
        System.out.println("Łączna kwota do zapłaty: " + lacznaKwota);
    }
}
