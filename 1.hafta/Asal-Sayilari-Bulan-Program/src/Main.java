public class Main {
    public static void main(String[] args) {
        System.out.println("1'den 100'e kadar asal sayılar:");
        //1 asal sayı olmadığı için 2'den başlıyoruz.
        for (int i = 2; i <= 100; i++) {
            boolean asal = true;
            // Sayı asal mı?
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.print(i + " ");
            }
        }

    }
}