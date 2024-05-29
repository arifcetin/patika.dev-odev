package Threads;

import java.util.ArrayList;
import java.util.List;

public class Threads implements Runnable{
    private final List<Integer> list;
    private static final List<Integer> even = new ArrayList<>();
    private static final List<Integer> odd = new ArrayList<>();

    public Threads(List<Integer> list) {
        this.list = list;
    }
    @Override
    public void run() {
        check(list);
        System.out.println("even numbers:"+even.size()+" odd numbers:"+odd.size());
    }

    private synchronized void check(List<Integer> list){
        for(int i=0;i<list.size();i++){
            if (i%2==0){
                even.add(list.get(i));
            }
            else {
                odd.add(list.get(i));
            }
        }
    }

    public static void show(){
        System.out.println("even numbers:"+even.size());
        System.out.println("odd numbers:"+odd.size());
    }
}
