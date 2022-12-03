public class T7 {

    public static void main(String[] args) {

        int [] a = {2,3,6,2,3,1,2};

        System.out.println("Grade");

        for (int counter = 0 ; counter < a.length ; counter ++){

            if (counter == 6)
                System.out.printf("%2d:" , 60);
            else
                System.out.printf("%2d-%2d:" , counter * 10 , counter * 10 + 9);

            for (int star = 0; star < a[counter]; star++)
                System.out.print("*");
            System.out.println();
        }
    }
}
