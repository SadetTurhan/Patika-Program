import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //yeni txt dosyası oluşturma işlemleri
        File file = new File("notes.txt");
        try{
            boolean value = file.createNewFile();
            if(value){
                System.out.println("Yeni dosya oluşturuldu !");
            }else{
                System.out.println("Dosya mevcut !");
            }
        }catch(Exception e){
            e.getStackTrace();
        }

        //dosyanın içerisine metin yazma işlemleri
        Scanner textInput = new Scanner(System.in);
        System.out.println("girmek istediğiniz metni yazınız ! ");
        String dataToTake = textInput.nextLine();
        String data = dataToTake;
        try{
            FileOutputStream output = new FileOutputStream("notes.txt");
            byte[] array = data.getBytes();
            output.write(array);
            output.close();
        }catch(Exception e){
            e.getStackTrace();
        }

        //dosyanın içeriğini okuma işlemleri
        try{
            FileInputStream input = new FileInputStream("notes.txt");
            System.out.println("Dosyadaki veriler: ");
            int i = input.read();

            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
            }
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}