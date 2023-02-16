
public class Main {
    public static void main(String[] args) {
        int liczbaAnkietowanych = 12467;
        double procentKupujacych = 0.14;
        double procentPreferujacychCytrusy = 0.64;

        int liczbaKupujacych = (int) Math.round(liczbaAnkietowanych * procentKupujacych);
        int liczbaPreferujacychCytrusy = (int) Math.round(liczbaKupujacych * procentPreferujacychCytrusy);

        System.out.println("Liczba kupujących co najmniej jeden napój energetyczny: " + liczbaKupujacych);
        System.out.println("Liczba preferujących napoje cytrusowe: " + liczbaPreferujacychCytrusy);
    }
}
