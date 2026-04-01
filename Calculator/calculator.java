import java.util.*;

public class calculator {
    public static void main(String[] args) {
        // int a = 100;
        // float b = 100;
        // boolean test = a==b;
        // System.out.println(test);
        System.out.println("This is my First Calculator in Java");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float fnum = sc.nextFloat();
        System.out.print("Which Calculation do you want to perform: ");
        String calc = sc.next();
        System.out.print("Now Enter Second Number: ");
        float snum = sc.nextFloat();
        switch (calc) {
            case "+": System.out.println(fnum+snum);
                break;
        
            case "-": System.out.println(fnum-snum);
                break;
        
            case "x": System.out.println(fnum*snum);
                break;

            case "/": 
                if(snum==0)
                    System.out.println("Not Defined");
                else
                    System.out.println(fnum/snum);
                break;
        
            case "%": System.out.println(((snum)/100)*fnum);
                break;
        
            case "**": System.out.println(Math.pow(fnum,snum));
                break;

            default: System.out.println("Please Enter Valid Symbol");
                break;
        }
    }
}
