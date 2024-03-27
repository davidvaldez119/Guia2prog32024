public class Main {
    public static void main(String[] args) {
     author aut1=new author("Joshua@gmail.com","joshua Block", 'm');
        System.out.println(aut1);
        Book b1=new Book("efective java",200.25,12,aut1);
        System.out.println(b1);
        System.out.println(b1.getAuthor());
    }
}
