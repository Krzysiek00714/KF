import java.util.Scanner;

public class UlubioneMiasto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj nazwę swojego ulubionego miasta: ");
        String miasto = input.nextLine();

        int liczbaZnakow = miasto.length();
        String wielkieLitery = miasto.toUpperCase();
        String maleLitery = miasto.toLowerCase();
        char pierwszyZnak = miasto.charAt(0);

        System.out.println("Liczba znaków w nazwie miasta: " + liczbaZnakow);
        System.out.println("Nazwa miasta zapisana wielkimi literami: " + wielkieLitery);
        System.out.println("Nazwa miasta zapisana małymi literami: " + maleLitery);
        System.out.println("Pierwszy znak nazwy miasta: " + pierwszyZnak);
    }
}
