import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //değişkenler
        String userName, password;

        //kullanıcıdan bilgi alma
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adınız: ");
        userName = input.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        password = input.nextLine();

        //giriş koşulu
        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız !");
        }else{
            System.out.println("Bilgileriniz Yanlış !");
            System.out.println("Yeni şifre belirlemek ister misiniz? e = evet, h = hayır");
            String yeniSifreIste = input.nextLine();
            if(yeniSifreIste.equals("e")){
                System.out.println("Yeni şifreyi giriniz: ");
                String yeniSifre = input.nextLine();
                while(yeniSifre.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    yeniSifre = input.nextLine();
                    if(!yeniSifre.equals("java123")){
                        System.out.println("Şifre oluşturuldu");
                    }
                }
            }

        }
    }
}