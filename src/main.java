
public class main {

    public static void main(String[] args) {
        int index = 1;

        for (index = 1; index <= 100; index++) {
            
            if (index % 3 == 0 && index % 5 == 0) {
                System.out.println("fizzbuzz ");
            } else if (index % 3 == 0) {
                System.out.println("fizz ");
            } else if (index % 5 == 0) {
                System.out.println("buzz ");
            } else {
                System.out.println(index + " ");
            }
        }

    }

}
