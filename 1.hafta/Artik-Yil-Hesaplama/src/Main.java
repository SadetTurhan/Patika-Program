import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenler
        int yil;

        //kullanıcıdan girdi alma
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yılı giriniz: ");
        yil = input.nextInt();

        //hesaplama koşulları
        if(yil % 4 == 0 && yil % 100 != 0 || yil % 400 == 0){
            System.out.println(yil + " bir artık yıldır.");
        }else{
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}