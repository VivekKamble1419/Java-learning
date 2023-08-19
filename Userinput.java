import java.util.Scanner;

public class Userinput {
    public static void main(String[] args){

        System.out.println("This is For User Input");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two numbers for addition : \n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum =a+b;
        System.out.println("Sum of "+ a + " & "+ b + " is :" + sum);
        
    }
}
