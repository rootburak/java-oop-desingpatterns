import java.io.ObjectInputFilter.Config;

interface ProInterface {
    ProInterface clone();
}

class ConcretePrototype implements ProInterface {

    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public ProInterface clone() {
        return new ConcretePrototype(this.name);
    }

    public void showName() {
        System.out.print(name);
    }
}

public class PrototypeE {

    public static void main(String[] args) {
        ConcretePrototype instance = new ConcretePrototype("Burak");
        ConcretePrototype instance2 = (ConcretePrototype) instance.clone();
        instance.showName();
        System.out.println("\nclone instance ");
        instance2.showName();
    }
}
