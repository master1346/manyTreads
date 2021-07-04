package org.example;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {

    @Override
    public Object call() throws Exception {
        Thread.sleep(3000L);
       // System.out.println("Hello, I am " + Thread.currentThread().getName());
        return Thread.currentThread().getName();
    }
}
