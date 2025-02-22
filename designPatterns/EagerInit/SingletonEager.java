class SingletonEagerExample {

    private static final SingletonEagerExample instance =
        new SingletonEagerExample();

    private SingletonEagerExample() {}

    public static SingletonEagerExample getInstance() {
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello its works");
    }
}

public class SingletonEager {

    public static void main(String[] args) {
        SingletonEagerExample instance = SingletonEagerExample.getInstance();
        instance.sayHello();
    }
}
