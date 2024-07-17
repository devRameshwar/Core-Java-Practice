package com.interview;

abstract class AbstractClass {
    private static String message="good noon";
    int x;

   // public static final int=100;
    String string;

    //public final int=123;
    private final int y;

    public AbstractClass(int x, String string, int y) {
        this.x = x;
        this.string = string;
        this.y = y;
    }

    public static final String getMessage() {
        return "Hi good morning...";
    }

    public abstract void setMessage(String message);

    abstract void show();
}

public class AbstractClassTest extends AbstractClass {

    int x;
    int y;
    String message;

    public AbstractClassTest(int x, String string, int y, int x1, int y1, String message) {
        super(x, string, y);
        this.x = x1;
        this.y = y1;
        this.message = message;
    }

    public static void main(String[] args) {

        AbstractClassTest test = new AbstractClassTest(101, "Good Evening", 200, 300, 900, "Good bye..");
        test.show();
        test.setMessage("Hi how are You...");
    }

    @Override
    public void setMessage(String message) {
        System.out.println(message);
    }

    @Override
    void show() {
        System.out.println("show method is called...");
    }
}
