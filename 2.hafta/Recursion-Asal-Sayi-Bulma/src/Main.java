import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int verilenSayi;
        Scanner input = new Scanner(System.in);
        verilenSayi = input.nextInt();
        boolean asalMi = asalMi(verilenSayi, 2);

        if (asalMi) {
            System.out.println(verilenSayi + " asaldır.");
        } else {
            System.out.println(verilenSayi + " asal değildir.");
        }
    }
    
    static boolean asalMi(int verilenSayi, int bolen) {
        if (bolen > Math.sqrt(verilenSayi)) {
            return true;
        }
        if (verilenSayi % bolen == 0) {
            return false;
        }
        return asalMi(verilenSayi, bolen + 1);
    }
}