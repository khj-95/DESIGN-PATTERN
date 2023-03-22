package personel.prac.designpattern.singleton;

public class Client {

    public static void main(String[] args) {
        // EagerRegistry registry = new EagerRegistry(); // error
        EagerRegistry registry = EagerRegistry.getInstance();
        EagerRegistry registry1 = EagerRegistry.getInstance();

        System.out.println(registry == registry1);
    }
}
