import java.util.Scanner;

class Markscalculator{
    public static void main(String[] args){

        System.out.println("This Program is For Marks to Percentage for 5 Subjects ");

        System.out.println("Enter Your Marks");

        Scanner marks=new Scanner(System.in);
        
        System.out.println("Subject 1 :");
        int s1=marks.nextInt();

        System.out.println("Subject 2 :");
        int s2=marks.nextInt();

        System.out.println("Subject 3 :");
        int s3=marks.nextInt();

        System.out.println("Subject 4 :");
        int s4=marks.nextInt();

        System.out.println("Subject 5 :");
        int s5=marks.nextInt();

        int Sum= s1 + s2 + s3 + s4 + s5;
        int per= Sum/5;
 
        System.out.println("Sum of Five Subjects is : " + Sum);
        System.out.println("Percentage of Five Subjects is : " + per);
    }
}
