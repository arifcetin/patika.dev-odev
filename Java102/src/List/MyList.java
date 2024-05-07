package List;

import java.util.Arrays;

public class MyList<T>{
    private int capacity;
    private int size = 0;
    private T[] list;

    public MyList() {
        capacity=10;
        this.list = (T[]) new Object[capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.list = (T[]) new Object[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public void add(T data){
        if (size == capacity){
            capacity*=2;
            this.list = Arrays.copyOf(this.list, capacity);
        }
        this.list[size]=data;
        this.size++;
    }

    public void get(int index){
        if(index<0 || index>=capacity){
            System.out.println("yanlış indis değeri girdiniz");
        }
        else {
            System.out.println(index+".eleman:"+list[index]);
        }
    }

    public void set(int index, T data){
        if(index<0 || index>=capacity){
            System.out.println("yanlış indis değeri girdiniz");
        }
        else {
            this.list[index] = data;
        }
    }

    public void remove(int index){
        if(index<0 || index>=capacity){
            System.out.println("yanlış indis değeri girdiniz");
        }
        else {
            this.list[index]=null;
            for(int i=index+1;i<capacity;i++){
                this.list[i-1] = this.list[i];
            }
        }
    }

    @Override
    public String toString() {
        return "MyList{" +
                "list=" + Arrays.toString(list) +
                '}';
    }
}
