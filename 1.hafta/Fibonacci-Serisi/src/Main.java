import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ///Kullanıcıdan sayı alma
        Scanner input = new Scanner(System.in);
        System.out.println("Kaçıncı adıma kadar görmek istersiniz? ");
        int n = input.nextInt();
        System.out.println();

        //seriyi başlatma
        int ilkSayi = 0;
        int ikinciSayi = 1;

        //serinin devam etmesini sağlayan fonksiyon
        for (int i = 1; i <= n; i++) {
            System.out.print(ilkSayi + " ");

            int sonrakiSayi = ilkSayi + ikinciSayi;
            ilkSayi = ikinciSayi;
            ikinciSayi = sonrakiSayi;
        }

    }
}