package Practice_core_java.src.com.java8.functionalInterface;

public class NormalThreadClass implements Runnable{
    public static void main(String[] args) {
        //normal thread generation
        NormalThreadClass obj=new NormalThreadClass();
        //passing a Runnable object into thread class
        Thread thread = new Thread(obj);
        //calling run method
        thread.start();
        //creating the main thread
        for (int i = 0; i < 9; i++) {
            System.out.println("main thread running: "+i);
        }

    }
    @Override
    public void run() {
        for (int i = 0; i < 9; i++) {
            System.out.println("child thread running: "+i);
        }
    }
}
