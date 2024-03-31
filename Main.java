public class Main {
    public static void main(String[] args) {
     author aut1=new author("Joshua@gmail.com","joshua Block", 'm');
        System.out.println(aut1);
        Book b1=new Book("efective java",200.25,12,aut1);
        System.out.println(b1);
        System.out.println(b1.getAuthor());
        Clientb c1=new Clientb(null,"carlitos el tontin",'m');
        accound a1=new accound(c1,null,20000.00);
        System.out.println(c1);
        System.out.println(a1);
        System.out.println(a1.Extract(250000.00));
        System.out.println(a1.Deposit(200.00));

    }
}
