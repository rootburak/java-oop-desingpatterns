public class singleton {

    public static void main(String[] args) {
        SingletonExample instanceSingleton = SingletonExample.getInstance();
        instanceSingleton.sayHello();
    }
}

class SingletonExample {

    private static SingletonExample instance;

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
            return instance;
        } else {
            return instance;
        }
    }

    public void sayHello() {
        System.out.println("hello singleton works");
    }
}
