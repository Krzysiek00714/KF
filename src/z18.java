public class Akcje {
    public static void main(String[] args) {
        int liczbaAkcji = 600;
        double cenaAkcji = 21.77;
        double prowizja = 0.02;

        double kosztAkcji = liczbaAkcji * cenaAkcji;
        double kosztProwizji = kosztAkcji * prowizja;
        double kosztCalkowity = kosztAkcji + kosztProwizji;

        System.out.println("Kwota zapłacona za same akcje: " + kosztAkcji + " zł");
        System.out.println("Wysokość prowizji: " + kosztProwizji + " zł");
        System.out.println("Łączna zapłacona kwota: " + kosztCalkowity + " zł");
    }
}
