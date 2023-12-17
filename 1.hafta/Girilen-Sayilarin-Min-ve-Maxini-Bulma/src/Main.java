import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayıyı kıyaslamak istiyorsunuz?: ");
        int n = scanner.nextInt();

        int[] sayilar = new int[n];

        // Kullanıcıdan değerleri al
        for (int i = 0; i < n; i++) {
            System.out.print("Sayı giriniz " + (i + 1) + ": ");
            sayilar[i] = scanner.nextInt();
        }

        // En düşük ve en yükseği bulma
        int max = sayilar[0];
        int min = sayilar[0];

        //en yükseği kıyaslayarak bul, max olarak işaretle
        for (int i = 1; i < n; i++) {
            if (sayilar[i] > max) {
                max = sayilar[i];
            }
        //en küçüğü kıyaslayarak bul, min olarak işaretle
            if (sayilar[i] < min) {
                min = sayilar[i];
            }
        }

        // sonuçları göster
        System.out.println("En yüksek sayı: " + max);
        System.out.println("En küçük sayı: " + min);

    }
}