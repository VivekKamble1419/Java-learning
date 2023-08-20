import java.util.Scanner;

public class Hello {
    public static void main(String[] args){

        System.out.println("This is Hellow program for Inputing name and Display it in Syntax");

        Scanner name=new Scanner(System.in);

        System.out.println("Enter Your Name: \n");
        String a=name.nextLine();

        System.out.println("Hello " + a + " Have a Greate day..!");
    }
}
