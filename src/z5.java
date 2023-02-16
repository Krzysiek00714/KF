public class PowierzchniaMieszkania {
    public static void main(String[] args) {
        // deklaracja i inicjalizacja zmiennych przechowujących wymiary pomieszczeń
        int p1Szerokosc = 3;
        int p1Dlugosc = 4;
        int p2Szerokosc = 3;
        int p2Dlugosc = 4;
        int p3Szerokosc = 2;
        int p3Dlugosc = 3;
        int p4Szerokosc = 2;
        int p4Dlugosc = 2;

        // obliczenie powierzchni poszczególnych pomieszczeń
        int p1Powierzchnia = p1Szerokosc * p1Dlugosc;
        int p2Powierzchnia = p2Szerokosc * p2Dlugosc;
        int p3Powierzchnia = p3Szerokosc * p3Dlugosc;
        int p4Powierzchnia = p4Szerokosc * p4Dlugosc;

        // obliczenie powierzchni całkowitej mieszkania
        int powierzchniaMieszkania = p1Powierzchnia + p2Powierzchnia + p3Powierzchnia + p4Powierzchnia;

        // wyświetlenie wyników
        System.out.println("Powierzchnia pokoju 1: " + p1Powierzchnia + " metrów kwadratowych");
        System.out.println("Powierzchnia pokoju 2: " + p2Powierzchnia + " metrów kwadratowych");
        System.out.println("Powierzchnia pokoju 3: " + p3Powierzchnia + " metrów kwadratowych");
        System.out.println("Powierzchnia pokoju 4: " + p4Powierzchnia + " metrów kwadratowych");
        System.out.println("Powierzchnia całkowita mieszkania: " + powierzchniaMieszkania + " metrów kwadratowych");
    }
}
