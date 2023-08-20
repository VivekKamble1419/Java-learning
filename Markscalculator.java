import java.util.Scanner;

class Markscalculator{
    public static void main(String[] args){

        System.out.println("This Program is For Marks to Percentage for 5 Subjects ");

        System.out.println("Enter Your Marks");

        Scanner marks=new Scanner(System.in);
        
        System.out.println("Subject 1 :");
        float s1=marks.nextInt();

        System.out.println("Subject 2 :");
        float s2=marks.nextInt();

        System.out.println("Subject 3 :");
        float s3=marks.nextInt();

        System.out.println("Subject 4 :");
        float s4=marks.nextInt();

        System.out.println("Subject 5 :");
        float s5=marks.nextInt();

        float Sum= s1 + s2 + s3 + s4 + s5;
        float per= Sum/5;
        float cgpa=Sum/50;
 
        System.out.println("Sum of Five Subjects is : " + Sum);
                System.out.println("Percentage of Five Subjects is : " + per);
                System.out.println("CGPA of Five Subjects is : " + cgpa);
    }
}
