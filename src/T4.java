public class T4 {
    public static void main(String[] args) {

        int[] a = {3,4,5,2,6,2,0};

        System.out.printf("%2s%8s%n", "Index", "Scores");

        for(int counter = 0; counter < a.length; counter++)
            System.out.printf("%2d%8d%n", counter, a[counter]);
    }
}
