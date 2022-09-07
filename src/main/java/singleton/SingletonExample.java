package singleton;

public class SingletonExample {
    public static void main(String[] args) {
//        getSingletonInstanceEager();
//        getSingletonInstanceLazy();
//        getSingletonInstanceSynchronizedMethod();
        getSingletonInstanceSynchronizedBlock();
    }

    private static void getSingletonInstanceSynchronizedBlock() {
        SingletonSynchronizedMethod instance1 = SingletonSynchronizedMethod.getInstance();
        System.out.println(instance1);

        SingletonSynchronizedMethod instance2 = SingletonSynchronizedMethod.getInstance();
        System.out.println(instance2);
    }

    private static void getSingletonInstanceSynchronizedMethod() {
        SingletonSynchronizedMethod instance1 = SingletonSynchronizedMethod.getInstance();
        System.out.println(instance1);

        SingletonSynchronizedMethod instance2 = SingletonSynchronizedMethod.getInstance();
        System.out.println(instance2);
    }

    private static void getSingletonInstanceLazy() {
        SingletonLazy instance1 = SingletonLazy.getInstance();
        System.out.println(instance1);

        SingletonLazy instance2 = SingletonLazy.getInstance();
        System.out.println(instance2);
    }

    private static void getSingletonInstanceEager() {
        SingletonEager instance1 = SingletonEager.getInstance();
        System.out.println(instance1);

        SingletonEager instance2 = SingletonEager.getInstance();
        System.out.println(instance2);
    }
}
