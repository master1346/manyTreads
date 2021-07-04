package org.example;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main(String[] args) throws InterruptedException {
        //Создание группы
        ThreadGroup group1 = new ThreadGroup("groupFourThread");

        //Создание потоков
        MyThread myThread1 = new MyThread(group1, "thread1");
        MyThread myThread2 = new MyThread(group1, "thread2");
        MyThread myThread3 = new MyThread(group1, "thread3");
        MyThread myThread4 = new MyThread(group1, "thread4");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

        //Остановка текущего потока на 15 секунд
        Thread.sleep(15000L);

        //Прерывание Группы потоков group1
        group1.interrupt();

    }

}
