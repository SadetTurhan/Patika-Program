import java.util.ArrayList;
import java.util.Scanner;

public class Phone extends Product implements Operation {
    private int camera;
    private int batteryCapacity;
    private String color;
    private static ArrayList<Phone> phoneList = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    public Phone(int id, String name, double price, double discountRate, int stock, String brandName, String screenSize, int ram, String memory, int camera, int batteryCapacity, String color) {
        super(id, name, price, discountRate, stock, brandName, screenSize, ram, memory);
        this.camera = camera;
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }

    public Phone() {
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void runMenu() {
        int select;
        do{
            System.out.println("Cep Telefonu Yönetim Paneli");
            System.out.println("1- Cep telefonu listeleme \n"+
                    "2- Cep telefonu ekleme \n" +
                    "3- Cep telefonu silme \n" +
                    "4- ID'ye göre filtreleme \n" +
                    "5- Markaya göre filtreleme \n" +
                    "0- Çıkış yap");
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            select = input.nextInt();
            switch (select){
                case 1:
                    showProductList();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    filterByProductId();
                    break;
                case 5:
                    filterByProductBrand();
                    break;
                case 0:
                    System.out.println("Bu menüden çıkılıyor.");
                    break;
                default:
                    System.out.println("Geçerli bir değer giriniz.");
                    break;
            }
        }while (select !=0 );

    }


    @Override
    public void showProductList() {

    }

    @Override
    public void addProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterByProductId() {

    }

    @Override
    public void filterByProductBrand() {

    }
}