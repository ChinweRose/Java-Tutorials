import java.util.Random;

public class T9 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] c = new int [6];

        for(int student = 1; student <= 20; student++)
            ++c[1 + random.nextInt(5)];

        System.out.printf("%2s%19s%n", "Food grading", "No of students");

        for(int Food_grading = 1; Food_grading < c.length; Food_grading++ )
            System.out.printf("%2s%18s%n", Food_grading, c[Food_grading]);
    }
}
