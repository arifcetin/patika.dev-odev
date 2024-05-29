package Threads;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i=1;i<=10000;i++){
            list.add(i);
        }

        List<Integer> list1 = list.subList(0,2500);
        List<Integer> list2 = list.subList(2500,5000);
        List<Integer> list3 = list.subList(5000,7500);
        List<Integer> list4 = list.subList(7500,10000);

        Thread t1 = new Thread(new Threads(list1));
        Thread t2 = new Thread(new Threads(list2));
        Thread t3 = new Thread(new Threads(list3));
        Thread t4 = new Thread(new Threads(list4));
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
