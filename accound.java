import java.util.UUID;
public class accound {
    private Client client;
    private UUID uuid;
    private Double balance;

    public accound(Client client, UUID uuid, Double balance) {
        this.client = client;
        this.uuid = UUID.randomUUID();
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public double Deposit(Double imp) {
        return balance+imp;


    }

    public double Extract(Double imp )	{
        if(getBalance() <=imp) {
            System.out.print("no se puede realizar la operacion");
        }
        return balance=this.balance-imp;
    }
    @Override
    public String toString() {
        return "accound [client=" + client + ", uuid=" + uuid + ", balance=" + balance + ", getClient()=" + getClient()
                + ", getUuid()=" + getUuid() + ", getBalance()=" + getBalance() + "]";
    }


}

