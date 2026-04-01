import java.util.Scanner;

public class inverted_half_pyramid_180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\"In this program you can print stars or numbers like an half inverted pyramid\\nDo you want to print a half inverted pyramid of stars or numbers?\\nType 'stars' for stars and 'numbers' for numbers: ");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("stars")) {
            //Stars inverted pyaramid
            System.out.print("Enter the number of rows(x): ");
            int rows = sc.nextInt();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if (input.equalsIgnoreCase("numbers")){   
            //Numbers' inverted pyramid
            System.out.print("Enter the number of rows(x): ");
            int rows = sc.nextInt();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(j+1);
                }
            System.out.println();
            }
        }   
    }
}
