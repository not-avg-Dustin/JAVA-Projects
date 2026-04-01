import java.util.*;

public class rectangle_stars {
    public static void main(String[] args) {
        System.out.println("In this program, you will be able to print a rectangle of stars with x srows and y columns.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of srows(x): ");
        int srows = sc.nextInt();
        System.out.print("Enter the number of columns(y): ");
        int columns = sc.nextInt();

        if (srows <= 0 || columns <= 0) {
            System.out.println("Please enter valid positive integers for srows and columns.");
        }
        else if (srows > 0 && columns > 0) {
            for (int i = 0; i < srows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("An unexpected error occurred. Please try again.");
        }
    }
}
