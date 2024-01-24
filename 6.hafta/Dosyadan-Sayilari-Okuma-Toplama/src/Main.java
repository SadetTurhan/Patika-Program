import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Dosya yolu
        String filePath = "patika.txt";

        // Toplam değişkeni
        int sum = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                int number = Integer.parseInt(line);
                sum += number;
            }
            System.out.println("Dosyadaki sayıların toplamı: " + sum);
        } catch (IOException e) {
            System.err.println("Dosyayı okumada hata " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Dosyada geçersiz sayı bulundu: " + e.getMessage());
        }
    }
}
