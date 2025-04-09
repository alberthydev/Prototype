package albert.prototypedeepcopy;

public class PrototypeDeepDemo {
    public static void main(String[] args) {
        Address address = new Address("Rua das Palmeiras", "Rio de Janeiro");
        Person original = new Person("Ana", address);

        Person clone = original.copy();

        clone.setName("Mariana");
        clone.setStreet("Av. Copacabana");

        System.out.println("Original: " + original);
        System.out.println("Clone:    " + clone);
    }
}
