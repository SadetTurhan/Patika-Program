import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //dizi tanımlandı
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        //kullanıcıdan veri alınıyor
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int girilenSayi = scanner.nextInt();

        int kucukEnYakin = -1;
        int buyukEnYakin = -1;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] < girilenSayi && (kucukEnYakin == -1 || dizi[i] > kucukEnYakin)) {
                kucukEnYakin = dizi[i];
            }

            if (dizi[i] > girilenSayi && (buyukEnYakin == -1 || dizi[i] < buyukEnYakin)) {
                buyukEnYakin = dizi[i];
            }
        }

        if (kucukEnYakin != -1) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + kucukEnYakin);
        }

        if (buyukEnYakin != -1) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + buyukEnYakin);
        }
    }
}