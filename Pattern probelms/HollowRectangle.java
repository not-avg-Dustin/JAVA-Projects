import java.util.*;

public class HollowRectangle {
    public static void main(String[] args) {
        System.out.println("In this program you will be able to print a hollow rectangle of stars with x length and y breadth.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle (x): ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle (y): ");   
        int breadth = sc.nextInt();
        for (int i = 0; i < breadth; i++) {
            for (int j = 0; j < length; j++) {
                if (j == 0 || j == length - 1) {
                    System.out.print(" * ");
                }
                else if (i == 0 || i == breadth - 1) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }     
}