package personel.prac.designpattern.singleton;

public class Client {

    public static void main(String[] args) {
        // EagerRegistry registry = new EagerRegistry(); // error
        EagerRegistry registry = EagerRegistry.getInstance();
        EagerRegistry registry1 = EagerRegistry.getInstance();

        System.out.println(registry == registry1);

        LazyRegistryWithDCL registryWithDCL = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL registryWithDCL1 = LazyRegistryWithDCL.getInstance();

        System.out.println(registryWithDCL == registryWithDCL1);

        LazyRegistryIODH registryIODH;
        registryIODH = LazyRegistryIODH.getInstance();
        registryIODH = LazyRegistryIODH.getInstance();
        registryIODH = LazyRegistryIODH.getInstance();
        registryIODH = LazyRegistryIODH.getInstance();
    }
}
