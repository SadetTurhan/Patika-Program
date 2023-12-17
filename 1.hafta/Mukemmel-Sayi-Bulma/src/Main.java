import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kontrol etmek istediğiniz sayıyı giriniz: ");
        int verilenSayi = input.nextInt();

        int toplam = 1; //1 her zaman böleceği için dışarıdan ekliyoruz.
        //sayıyı kalansın bölenleri bulup formüle ekleme
        for (int i = 2; i < verilenSayi ; i++) {
            if (verilenSayi % i == 0) {
                toplam += i;
            }
        }
        //sonuca göre ekrana yazdırma
        if (toplam == verilenSayi) {
            System.out.println(verilenSayi + " mükemmel bir sayıdır.");
        } else {
            System.out.println(verilenSayi + " mükemmel bir sayı değildir.");
        }
    }
}