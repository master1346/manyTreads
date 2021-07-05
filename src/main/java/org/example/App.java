package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class App 
{
    public static void main( String[] args ) throws InterruptedException, ExecutionException {
        Callable<String> task = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000L);
                return Thread.currentThread().getName();
            }
        };

        MyCallable task1 = new MyCallable();
        MyCallable task2 = new MyCallable();
        MyCallable task3 = new MyCallable();
        MyCallable task4 = new MyCallable();

        List<Callable<Object>> listTask = new ArrayList<>();
        listTask.add(task4);
        listTask.add(task1);
        listTask.add(task2);
        listTask.add(task3);

        ExecutorService service = Executors.newFixedThreadPool(4);

        for(int i = 0; i < 4; i++ ) {
            Future result = service.submit(task);
            System.out.println(result.get());
        }

        System.out.println("Всего сообщений  " + service.invokeAny(listTask));

        service.shutdown();
    }
}
