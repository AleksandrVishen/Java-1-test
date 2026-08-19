public class BankClient {
    private long id;
    private String name;

    public BankClient(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BankClient)) {
            return false;
        }
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        BankClient other = (BankClient) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    @Override
    public String toString() {
        return "User id: " + id + ", User name: " + name + ".";
    }
}
