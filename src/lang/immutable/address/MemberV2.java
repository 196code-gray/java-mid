package src.lang.immutable.address;

public class MemberV2 {
    private ImmutableAddress address;
    private String name;

    public MemberV2(ImmutableAddress address, String name) {
        this.address = address;
        this.name = name;
    }

    public ImmutableAddress getAddress() {
        return address;
    }

    public void setAddress(ImmutableAddress address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
