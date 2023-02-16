public class Main {
    public static void main(String[] args) {
        double procent = 0.62; // procent generowanej sprzedaży przez region mazowiecki
        double calkowitaSprzedaz = 4600000; // całkowita wartość sprzedaży w firmie

        double sprzedazMazowiecki = procent * calkowitaSprzedaz; // obliczenie wartości sprzedaży dla regionu mazowieckiego

        System.out.println("Sprzedaż wygenerowana przez region mazowiecki: " + sprzedazMazowiecki + " zł");
    }
}
