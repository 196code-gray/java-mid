package src.lang.immutable.address;

public class MemberV1 {
    private String name;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MemberV1(Address address, String name) {
        this.address = address;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "address=" + address +
                ", name='" + name + '\'' +
                '}';
    }
}
