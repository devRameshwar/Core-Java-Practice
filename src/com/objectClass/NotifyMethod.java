package com.objectClass;

import java.util.LinkedList;
import java.util.Queue;

public class NotifyMethod {

    public static void main(String[] args) {
        System.out.println("Main class called....");
    }
}

class SharedResource {

    private final Integer LIMIT = 10;
    private final Queue<Integer> queue = new LinkedList<>();

    public synchronized void produced(int size) throws InterruptedException {
        while (queue.size() == LIMIT) {
            wait();//wait until queue is not full
        }
        queue.add(size);
        notify();//notify consumer that new Item is available
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();//wait queue is not empty
        }
        Integer integer = queue.poll();
        notify();
        return integer;
    }

}

class Producer implements Runnable {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        int value=0;

    }
}

class Consumer implements Runnable{
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {

    }
}