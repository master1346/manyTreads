package org.example;

import javax.swing.text.ChangedCharSetException;

public class MyThread extends Thread{


    public MyThread(ThreadGroup group, String threadName) {
       super(group,threadName);
    }

    @Override
    public void run(){
        try{
            while (!isInterrupted()){
                Thread.sleep(2000);
                System.out.println("Hello, I am " + Thread.currentThread().getName());
            }
        }catch(InterruptedException err) {
        } finally {
            System.out.printf("%s завершен\n", getName());
        }

    }
}
