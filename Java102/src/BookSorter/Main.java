package BookSorter;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("şeker portakalı",100,"arif");
        Book b2 = new Book("hayvan çiftliği",200,"arif");
        Book b3 = new Book("1984",150,"arif");
        Book b4 = new Book("simyacı",80,"arif");
        Book b5 = new Book("kürk mantolu madonna",170,"arif");

        TreeSet<Book> treeSet = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        treeSet.add(b1);
        treeSet.add(b2);
        treeSet.add(b3);
        treeSet.add(b4);
        treeSet.add(b5);

        TreeSet<Book> bookTreeSet = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage()-o2.getPage();
            }
        });
        bookTreeSet.add(b1);
        bookTreeSet.add(b2);
        bookTreeSet.add(b3);
        bookTreeSet.add(b4);
        bookTreeSet.add(b5);

        for(Book book: treeSet){
            System.out.println(book.getTitle());
        }
        System.out.println("----------------");
        for (Book book: bookTreeSet){
            System.out.println(book.getTitle());
        }
    }
}
