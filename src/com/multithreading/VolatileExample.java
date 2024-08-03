package com.multithreading;

public class VolatileExample {
	
	private volatile boolean flag = false;

    public void writerThread() {
        flag = true; // Write to the volatile variable
    }

    public void readerThread() {
        if (flag) {
            // Read from the volatile variable
            System.out.println("Flag is set to true");
        }
    }

    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();

        Thread writer = new Thread(() -> example.writerThread());
        Thread reader = new Thread(() -> example.readerThread());

        writer.start();
        reader.start();
    }
}
