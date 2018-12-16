package com.him;

import java.util.function.Function;

public class MyThreadDemo {
    public static void main(String args[]) {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println(" Hello from thread");
            }
        });
        
        Runnable run = ()->{
        	System.out.println(" Hello from thread lamda");
        };
        //Function t1 = (()-> System.out.println(" Hello from thread"));
        Thread t2 = new Thread(run);
        
        Thread t3 = new Thread(()-> {
        	System.out.println(" Hello from thread lamda2");
        });
        t3.start();
    }
}