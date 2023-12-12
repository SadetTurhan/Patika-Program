import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int yariCap;
        double piSayisi = 3.14, daireninAlani,daireninCevresi;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Dairenizin yarı çapını yazınız: ");
        yariCap = girdi.nextInt();
        daireninAlani = piSayisi * yariCap * yariCap;
        daireninCevresi = 2 * piSayisi * yariCap;

        /** Ödev **/
        int merkezAci;
        double daireDilimiAlani;
        System.out.println("Merkez açı ölçüsünü giriniz: ");
        merkezAci = girdi.nextInt();
        daireDilimiAlani = (piSayisi * (yariCap * yariCap) * merkezAci / 360);
        System.out.println(daireDilimiAlani);
    }
}