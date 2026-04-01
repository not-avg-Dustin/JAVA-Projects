import java.util.Scanner;

public class floyds_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("In this program, you will be able to print Floyd's triangle with x rows.\nEnter the number of rows(x): ");
        int rows = sc.nextInt();
        int counter = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
