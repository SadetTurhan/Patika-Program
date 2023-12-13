import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz: ");
        select = input.nextInt();
        switch(select){
            case 1:
                System.out.println("Sonuç: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuç: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuç: " + (n1 * n2));
                break;
            case 4:
                if(n1 == 0 || n2 == 0) {
                    System.out.println("bölme işleminde 0 olamaz");
                }else {
                    System.out.println("Sonuç: " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Lütfen işlem numaralarına dikkat ediniz.");
                break;
        }
    }
}