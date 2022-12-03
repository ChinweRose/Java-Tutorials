public class T5 {

    public static void main(String[] args) {

        final int c = 10;
        int[] a = new int[10];

        System.out.printf("%2s%8s%n", "Index", "Values");
        
        for (int counter = 0; counter < a.length; counter++)
            a[counter] = counter * 2 + 2;

        for (int counter = 0; counter < a.length; counter++)
            System.out.printf("%2d%8d%n", counter, a[counter]);

    }
}
