import java.util.ArrayList;
import java.util.Scanner;
class Notebook extends Product implements Operation {
    private static ArrayList<Notebook> notebookList = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    public Notebook(int id, String name, double price, double discountRate, int stock, String brandName, String screenSize, int ram, String memory) {
        super(id, name, price, discountRate, stock, brandName, screenSize, ram, memory);
    }
    public Notebook() {
    }
    @Override
    public void runMenu() {
        int select;
        do{
            System.out.println("Notebook Yönetim Paneli");
            System.out.println("1- Notebook listeleme \n"+
                    "2- Notebook ekleme \n" +
                    "3- Notebook silme \n" +
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

    static{
        notebookList.add(new Notebook(1, "Huawei Matebook 14", 7000.0, 10, 50, "Huawei", "14.0", 16,"512 GB" ));
        notebookList.add(new Notebook(2, "Lenovo V14 IGL", 3699.0, 10, 50, "Lenovo", "14.0", 8,"1024 GB" ));
        notebookList.add(new Notebook(3, "Asus Tuf Gaming", 8199.0, 10, 50, "Asus", "15.6", 32,"2048 GB" ));
    }

    @Override
    public void showProductList() {
        System.out.println("Notebook Listesi");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-3s | %-30s | %-10s | %-10s | %-10s | %-10s | %-10s |\n","ID", "Ürün Adı", "Fiyat", "Marka", "Ekran", "RAM", "Depolama");
        System.out.println("----------------------------------------------------------------------------------------------------------------");


        for (Notebook nb : notebookList){
            System.out.format("| %-3d | %-30s | %-10.2f | %-10s | %-10s | %-10d | %-10s |\n", nb.getId(), nb.getName(), nb.getPrice(), nb.getBrandName(), nb.getScreenSize(), nb.getRam(), nb.getMemory());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------");
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