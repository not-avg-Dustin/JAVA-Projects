import java.util.Scanner;

public class triangle_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("In this program, you will be able to print a '0-1 triangle' with x rows.\nEnter the number of rows(x): ");
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j =0; j < i+1; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } 
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

