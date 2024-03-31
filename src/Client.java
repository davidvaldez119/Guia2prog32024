
import java.util.UUID;
public class Client {
private UUID uuid;
private String name;
private Double discount;

    public Client(UUID uuid,String name,Double discount) {
        this.uuid = uuid;
        this.name = name;
        this.discount = discount;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Client{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", discount=" + discount +
                '}';
    }
}
