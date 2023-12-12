import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, startPrice = 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden yazınız: ");
        km = input.nextInt();

        total = (km * perKm);
        total += startPrice;
        total = (total < 20 ? 20: total);
        System.out.println("Toplam Tutar: " + total + "TL");
    }
}