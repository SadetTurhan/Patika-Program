import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //değişkenler
        int mesafeKm, yas, gidisDonus;
        double hamBiletFiyati, kmBasiUcret = 0.10, onikiAltiIndirimi = 0.5, onikiYirmidortIndirimi = 0.1, altmisbesUstuIndirimi = 0.3, gidisDonusIndirimi = 0.2;
        double onikiYasIndirimMiktari, onikiYasBileti, onikiYirmidortYasIndirimiMiktari, onikiYirmiDortYasBileti, altmisbesUstuIndirimMiktari, altmisbesUstuYasBileti;
        //kullanıcıdan bilgi alma

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç km gideceğinizi giriniz: ");
        mesafeKm = input.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.println("Sadece gidiş mi yoksa gidiş-dönüş mü belirtiniz: gidiş = 1 / Gidiş-Dönüş = 2");
        gidisDonus = input.nextInt();
        hamBiletFiyati = mesafeKm * kmBasiUcret;

        //yaş indirimlerini belirleme
        onikiYasIndirimMiktari = hamBiletFiyati * onikiAltiIndirimi;
        onikiYasBileti = hamBiletFiyati - onikiYasIndirimMiktari;

        onikiYirmidortYasIndirimiMiktari = hamBiletFiyati * onikiYirmidortIndirimi;
        onikiYirmiDortYasBileti = hamBiletFiyati - onikiYirmidortYasIndirimiMiktari;

        altmisbesUstuIndirimMiktari = hamBiletFiyati * altmisbesUstuIndirimi;
        altmisbesUstuYasBileti = hamBiletFiyati - altmisbesUstuIndirimMiktari;

        //gidiş dönüş dahil edip etmeme belirleme kısmı
        if(yas < 0 || mesafeKm < 0){
            System.out.println("hatalı veri girdiniz");
        }else if(gidisDonus != 1 && gidisDonus != 2){
            System.out.println("hatalı veri girdiniz");
        }else if(yas < 12 && gidisDonus == 2){
            System.out.println((onikiYasBileti - (onikiYasBileti * gidisDonusIndirimi)) *2);
        }else if(yas < 12 && gidisDonus == 1){
            System.out.println(onikiYasBileti);
        }else if(yas >= 12 && yas < 24 && gidisDonus == 2){
            System.out.println((onikiYirmiDortYasBileti - (onikiYirmiDortYasBileti * gidisDonusIndirimi))*2);
        }else if(yas >= 12 && yas < 24 && gidisDonus == 1){
            System.out.println(onikiYirmiDortYasBileti);
        }else if(yas >= 24 && yas <65 && gidisDonus == 2){
            System.out.println(hamBiletFiyati - (hamBiletFiyati - gidisDonusIndirimi));
        }else if(yas >=24 && yas <65 && gidisDonus == 1){
            System.out.println(hamBiletFiyati);
        }else if(yas >= 65 && gidisDonus == 2){
            System.out.println((altmisbesUstuYasBileti - (altmisbesUstuYasBileti * gidisDonusIndirimi))*2);
        }else if(yas >= 65 && gidisDonus == 1) {
            System.out.println(altmisbesUstuYasBileti);
        }
    }
}