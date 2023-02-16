import java.util.Scanner;

public class SkonsumowaneKalorie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int ILOSC_CIASTECZEK_W_PUDLE = 40;
        final int ILOSC_PORCJI_W_PUDLE = 10;
        final int KALORIE_W_JEDNEJ_PORCJI = 300;

        System.out.print("Podaj liczbę zjedzonych ciasteczek: ");
        int iloscCiasteczek = input.nextInt();

        double iloscPorcji = (double) iloscCiasteczek / ILOSC_CIASTECZEK_W_PUDLE * ILOSC_PORCJI_W_PUDLE;
        int skonsumowaneKalorie = (int) (iloscPorcji * KALORIE_W_JEDNEJ_PORCJI);

        System.out.println("Liczba skonsumowanych kalorii: " + skonsumowaneKalorie);
    }
}
