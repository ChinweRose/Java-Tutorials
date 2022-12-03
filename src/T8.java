import java.util.Random;

public class T8 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] c = new int[10];

        for(int roll = 1; roll < 15; roll++)
            ++c[1 + random.nextInt(8)];
        System.out.printf("%2s%8s%n", "face" , "frequency");

        for (int face = 1; face < c.length; face++)
            System.out.printf("%2s%8s%n", face, c[face]);

    }
}
