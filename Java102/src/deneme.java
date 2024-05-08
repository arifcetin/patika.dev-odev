import java.util.HashSet;
import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        for (int i=0;i<count;i++){
            String line = scanner.nextLine();
            hashSet.add(line);
            System.out.println(hashSet.size());
        }
    }
}
