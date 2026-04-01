import java.util.*;

public class half_pyramid {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to print a half pyramid of stars or numbers?\nType 'stars' for stars and 'numbers' for numbers: ");
        String input = sc.nextLine();

        if (input.equalsIgnoreCase("stars")) {
            //Half pyramid of stars
            System.out.print("Enter the number of rows(x): ");
            int srows = sc.nextInt();
            if (srows <= 0 ) {
                System.out.println("Please Enter a valid Positive integer for rows");
            }
            else if (srows > 0) {
                for (int i = 0; i < srows; i++) {
                     for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                     }
                        System.out.println();
                }
            }
            else {
                System.out.println("An unexpected error occurred. Please try again.");
            }
            
        }

        else if (input.equalsIgnoreCase("numbers")) {
            //Number half pyramid
            System.out.println("Now You will be able to print a half pyramid of numbers with x rows.");
            System.out.print("Enter the number of rows(x): ");
            int nrows = sc.nextInt();
            if (nrows <= 0) {
                System.out.println("Please Enter a valid Positive integer for rows");
            }
            else if (nrows >= 0) {
                for (int i = 0; i < nrows; i++) {
                    for (int j = 1; j <= i+1; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            }
            else {
                System.out.println("An unexpected error occurred. Please try again.");
            }
        }
        else {
            System.out.println("Please enter a valid input. Type 'stars' for stars and 'numbers' for numbers.");
        }
    }
}
        
        
        
        
        
        
        
