
import java.time.LocalTime;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Client c1=new Client(UUID.randomUUID(),"bill norton",2300.45);
        System.out.println(c1);
      bill b1=new bill(UUID.randomUUID(),76000.43 ,LocalTime.of(23,30,45),c1);
        System.out.println(b1);
        System.out.println("monto Cliente :..."+c1.getDiscount());
        System.out.println("monto Factura:....."+b1.getAmount());
    }
}