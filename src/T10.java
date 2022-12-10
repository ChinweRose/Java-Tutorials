import java.util.Random;

public class T10 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] a = new int[16];

        for(int student = 1; student <= 10; student++)
            ++a[1 + random.nextInt(15)];

        System.out.printf("%2s%19s%n", "Picks", "No of students");

        for (int pick = 1; pick < a.length; pick++)
            System.out.printf("%2s%20s%n", pick, a[pick] );
    }
}
