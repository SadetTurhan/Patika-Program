import java.util.Scanner;

public class Main {
    public static int usAlma(int a, int b) {
        int sonuc = 1;
        if (b >= 1) {
            sonuc *= a;
            return (sonuc * usAlma(a,b-1));
        }else if(b == 0){
            return 1;
        }
        return sonuc;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taban sayısını giriniz: ");
        int a = input.nextInt();
        System.out.println("Üs sayısını giriniz: ");
        int b = input.nextInt();

        int carpimSonucu = usAlma(a,b);
        System.out.println(carpimSonucu);

  }

}