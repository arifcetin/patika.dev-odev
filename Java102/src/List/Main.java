package List;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();
        System.out.println("listenin kapasitesi:"+list.getCapacity());
        System.out.println("listenin eleman sayısı:"+list.getSize());
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("listenin kapasitesi:"+list.getCapacity());
        System.out.println("listenin eleman sayısı:"+list.getSize());
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        list.add(120);
        System.out.println("listenin kapasitesi:"+list.getCapacity());
        System.out.println("listenin eleman sayısı:"+list.getSize());
        list.get(5);
        System.out.println(list.toString());
        list.remove(5);
        System.out.println(list.toString());
        list.set(5, 25);
        System.out.println(list.toString());
    }
}
