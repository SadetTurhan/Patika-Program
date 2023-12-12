import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /// variables
        int matematik, fizik, kimya, turkce, tarih, muzik;
        ///getting input
        Scanner notOkuma = new Scanner(System.in);
        System.out.println("Matematik Notunuz: ");
        matematik = notOkuma.nextInt();
        System.out.println("Fizik Notunuz: ");
        fizik = notOkuma.nextInt();
        System.out.println("Kimya Notunuz: ");
        kimya = notOkuma.nextInt();
        System.out.println("Türkçe Notunuz: ");
        turkce = notOkuma.nextInt();
        System.out.println("Tarih Notunuz: ");
        tarih = notOkuma.nextInt();
        System.out.println("Müzik Notunuz: ");
        muzik = notOkuma.nextInt();
        ///getting total and average
        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        //printing
        System.out.println("Ortalamanız: " + sonuc + ", " + (sonuc > 60 ? "Sınıfı geçtiniz": "Sınıfta kaldınız"));
    }
}