package personel.prac.designpattern.singleton;

/**
 * Initialization-on-demand holder idiom
 * https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy
 * initialization without worrying about synchronization.
 *
 * JVM 클래스 로드 및 초기화 활용 -> 쓰레드 세이프!
 * JVM에서 클래스 로드 -> 클래스의 static 블록 실행하여 static 변수 초기화
 * static inner class는 실행됙기 전까지 로드하지 않음.
 */
public class LazyRegistryIODH {

    private LazyRegistryIODH() {
        System.out.println("In LazyRegistryIODH singleton");
    }

    private static class RegistryHolder {

        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }

}
