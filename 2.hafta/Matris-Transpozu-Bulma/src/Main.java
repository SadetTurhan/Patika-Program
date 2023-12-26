public class Main {
    public static void main(String[] args) {
        // Örnek senaryodaki matrisler
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] matris2 = {
                {2,3,4},
                {5,6,4}
        };
        // Matrislerin transpozu
        int[][] transpoz = transpozBul(matris);
        int[][] transpoz2 = transpozBul(matris2);
        // Matrisi ve transpozunu ekrana yazdırın
        System.out.println("Matris:");
        matrisiYazdir(matris);
        System.out.println("------");
        matrisiYazdir(matris2);
        System.out.println("\nTranspoz:");
        matrisiYazdir(transpoz);
        System.out.println("-------");
        matrisiYazdir(transpoz2);
    }

    // Matrisi ekrana yazdıran metod
    static void matrisiYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Matrisin transpozunu bulan metod
    static int[][] transpozBul(int[][] matris) {
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        int[][] transpoz = new int[sutunSayisi][satirSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        return transpoz;
    }
}