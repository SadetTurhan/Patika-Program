import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double km, yas, toplamFiyat, ucret = 0.10;
        int guzergah;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz : ");
        km = input.nextDouble();

        System.out.print("Lütfen yaşınızı giriniz : ");
        yas = input.nextDouble();

        System.out.print("Gidiş Güzergahınız Tek Yön mü ? 1 = Evet , 2 = Hayır) : ");
        guzergah = input.nextInt();


        if ( yas > 0 && km > 0 && guzergah == 1 || guzergah == 2) {

            toplamFiyat = (km * ucret);

            if (guzergah == 1) {
                if (yas < 12) {
                    toplamFiyat = toplamFiyat - (toplamFiyat * 0.50);
                } else if (yas > 12 && yas < 24) {
                    toplamFiyat = toplamFiyat - (toplamFiyat * 0.10);
                } else if (yas > 65) {
                    toplamFiyat = toplamFiyat - (toplamFiyat * 0.30);
                }
            }else {
                if (yas <= 12) {
                    toplamFiyat = toplamFiyat - (toplamFiyat * 0.50);
                    toplamFiyat = (toplamFiyat - (toplamFiyat * 0.20)) * 2;
                } else if (yas > 12 && yas < 24) {
                    toplamFiyat = toplamFiyat - (toplamFiyat * 0.10);
                    toplamFiyat = (toplamFiyat - (toplamFiyat * 0.20)) * 2;
                } else if (yas > 65) {
                    toplamFiyat = toplamFiyat - (toplamFiyat * 0.30);
                    toplamFiyat = (toplamFiyat - (toplamFiyat * 0.20)) * 2;
                }
            }
            System.out.println("Toplam ödeyeceğiniz tutar : " + toplamFiyat + "TL");
        }else {
            System.out.println("Yanlış giriş yaptınız !");
        }

    }
}