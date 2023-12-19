public class Main {
    public static void main(String[] args) {
        System.out.println("1'den 100'e kadar asal sayılar:");
        asalSayilariYazdir(2, 100);
    }

    // Recursive method ile asal mı kontrolü
    static boolean asalMi(int sayi, int bolen) {
        if (bolen > Math.sqrt(sayi)) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return asalMi(sayi, bolen + 1);
    }

    // Recursive method ile aralıktaki sayıları yazdırma
    static void asalSayilariYazdir(int basla, int bitir) {
        if (basla <= bitir) {
            if (asalMi(basla, 2)) {
                System.out.print(basla + " ");
            }
            asalSayilariYazdir(basla + 1, bitir);
        }
    }
}