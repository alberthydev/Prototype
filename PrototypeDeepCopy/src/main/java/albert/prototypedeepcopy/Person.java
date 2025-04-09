package albert.prototypedeepcopy;

public class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Person copy() {
        return new Person(this.name, this.address.copy());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStreet(String newStreet) {
        this.address.setStreet(newStreet);
    }

    @Override
    public String toString() {
        return name + " vive em " + address;
    }
}
