import java.util.UUID;
import java.time.LocalTime;
public class bill {
private UUID uuid;
private double amount;
private LocalTime time;
private Client client;


    public bill(UUID uuid, double amount, LocalTime time, Client client) {
        this.uuid=uuid;
        this.amount=amount;
        this.time = time;
        this.client=client;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public double totalAmount(double porc ){

        return amount=(amount*client.getDiscount())/100+amount;
    }

    @Override
    public String toString() {
        return "bill{" +
                "uuid=" + uuid +
                ", amount=" + amount +
                ", time=" + time +
                ", client=" + client +
                '}';
    }
}
