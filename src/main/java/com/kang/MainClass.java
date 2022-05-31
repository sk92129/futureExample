package com.kang;

import java.util.concurrent.Future;

public class MainClass {

    public static void main (String [] argus ){
        Future<Integer> future = new SquareCalculator().calculate(10);

        while(!future.isDone()) {
            System.out.println("Calculating...");
            try {
                System.out.println("sleep for 300 miliseonds");
                Thread.sleep(300);
            } catch (Exception ex){
                ex.printStackTrace();
            }

        }

        try {
            Integer result = future.get();
            System.out.println(result);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("done");
    }
}
