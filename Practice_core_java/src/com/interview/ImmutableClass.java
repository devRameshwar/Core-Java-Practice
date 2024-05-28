package Practice_core_java.src.com.interview;

public final class ImmutableClass {

    private final String object;

    public ImmutableClass(String object) {
        this.object = object;
    }

    public String getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "object='" + object + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ImmutableClass object = new ImmutableClass("Hello");

        System.out.println(object);

    }

}
