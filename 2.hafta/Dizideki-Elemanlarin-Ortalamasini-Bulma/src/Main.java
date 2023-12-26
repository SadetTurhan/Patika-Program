public class Main {
    public static void main(String[] args) {
        double[] dizi = {15, 6, 5, 9, 3};
        double harmonikOrtalama = hesaplaHarmonikOrtalama(dizi);
        System.out.println("Dizinin harmonik ortalaması: " + harmonikOrtalama);
    }

    public static double hesaplaHarmonikOrtalama(double[] dizi) {
        double toplamTersleri = 0.0;

        for (int i = 0; i < dizi.length; i++) {
            toplamTersleri += 1.0 / dizi[i];
        }

        return dizi.length / toplamTersleri;
    }
}