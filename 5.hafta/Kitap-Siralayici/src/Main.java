import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //isme göre sıralama
        TreeSet<Book> bookList = new TreeSet<>(new OrderBookNameComparable());
        bookList.add(new Book("Fellowship of the ring",350,"Tolkien","01-01,1970"));
        bookList.add(new Book("Alice in Wonderland",200,"Carrol","01-02-1971"));
        bookList.add(new Book("On the Road",400,"Kerouac","01-01-1960"));
        bookList.add(new Book("Example book",250,"Example","02-02-2023"));
        bookList.add(new Book("Crime and Punishment",450,"Dostoyevski","03-03-1915"));
        for(Book b: bookList){
            System.out.println("######");
            System.out.println(b.getName() + " " + b.getAuthorName() + " " + b.getPageNumber() + " " + b.getPublishingDate());
        }
        //sayfa sayısına göre sıralama
        Set<Book> bookByPageList = new TreeSet<Book>(Comparator.comparing(Book::getPageNumber));

        bookByPageList.add(new Book("Fellowship of the ring",350,"Tolkien","01-01,1970"));
        bookByPageList.add(new Book("Alice in Wonderland",200,"Carrol","01-02-1971"));
        bookByPageList.add(new Book("On the Road",400,"Kerouac","01-01-1960"));
        bookByPageList.add(new Book("Example book",250,"Example","02-02-2023"));
        bookByPageList.add(new Book("Crime and Punishment",450,"Dostoyevski","03-03-1915"));

        System.out.println("Kitaplar sayfa sayısına göre:");
        for (Book b : bookByPageList) {
            System.out.println("######");
            System.out.println(b.getName() + " " + b.getAuthorName() + " " + b.getPageNumber() + " " + b.getPublishingDate());
        }
    }

}
