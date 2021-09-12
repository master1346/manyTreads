package org.example;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Object> {

    @Override
    public Object call() throws Exception {
        return (Integer) 4;
    }
}
