import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenler
        int month,day;

        //kullanıcıdan girdi alma
        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz ayı sayı şeklinde giriniz(1-Ocak 2-Şubat vb.): ");
        month = input.nextInt();

        System.out.println("Doğduğunuz gün: ");
        day = input.nextInt();

        //if else ile burç belirleme
        if((month < 1 || month > 12) || (day < 1 || day > 31)) {
            System.out.println("Lütfen geçerli bir tarih giriniz.");
        }else if((month == 12 && day > 21) || (month == 1 && day < 22) ){
            System.out.println("Burcunuz: Oğlak");
        }else if((month == 1 && day > 21) || (month == 2 && day < 20)){
            System.out.println("Burcunuz: Kova");
        }else if((month == 2 && day > 19) || (month == 3 && day < 21)){
            System.out.println("Burcunuz: Balık");
        }else if((month == 3 && day > 20) || (month == 4 && day < 21)){
            System.out.println("Burcunuz: Koç");
        }else if((month == 4 && day > 20) || (month == 5 && day < 22)){
            System.out.println("Burcunuz: Boğa");
        }else if((month == 5 && day > 21) || (month == 6 && day < 23)){
            System.out.println("Burcunuz: İkizler");
        }else if((month == 6 && day > 22) || (month == 7 && day < 23)){
            System.out.println("Burcunuz: Yengeç");
        }else if((month == 7 && day > 22) || (month == 8 && day < 23)){
            System.out.println("Burcunuz: Aslan");
        }else if((month == 8 && day > 22) || (month == 5 && day < 23)){
            System.out.println("Burcunuz: Başak");
        }else if((month == 9 && day > 22) || (month == 10 && day < 23)){
            System.out.println("Burcunu: Terazi");
        }else if((month == 10 && day > 22) || (month == 11 && day < 22)){
            System.out.println("Burcunuz: Akrep");
        }else if((month == 11 && day > 21) || (month == 12 && day < 22)){
            System.out.println("Burcunu: Yay");
        }
    }
}