import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /// variables
        int matematik, fizik, kimya, turkce, muzik,dersSayisi = 0,toplam = 0;

        ///getting input

        Scanner notOkuma = new Scanner(System.in);
        System.out.println("Matematik Notunuz: ");
        matematik = notOkuma.nextInt();
        if(matematik != 100 && matematik != 0){
            toplam += matematik;
            dersSayisi++;
        }
        System.out.println("Fizik Notunuz: ");
        fizik = notOkuma.nextInt();
        if(fizik != 100 && fizik != 0){
            toplam += fizik;
            dersSayisi++;
        }
        System.out.println("Kimya Notunuz: ");
        kimya = notOkuma.nextInt();
        if(kimya != 100 && kimya != 0){
            toplam += kimya;
            dersSayisi++;
        }
        System.out.println("Türkçe Notunuz: ");
        turkce = notOkuma.nextInt();
        if(turkce != 100 && turkce != 0){
            toplam += turkce;
            dersSayisi++;
        }
        System.out.println("Müzik Notunuz: ");
        muzik = notOkuma.nextInt();
        if(muzik != 0 && muzik != 100){
            toplam += muzik;
            dersSayisi++;
        }
        ///getting total and average
        double ortalama = toplam / dersSayisi;
        if(ortalama <= 55){
            System.out.println("Ortalamanız: " + ortalama + " Sınıfta kaldınız,seneye tekrar görüşmek üzere!");
        }else{
            System.out.println("Ortalamanız: " + ortalama + " Tebrikler, sınıfı geçtiniz!");
        }
    }
}
