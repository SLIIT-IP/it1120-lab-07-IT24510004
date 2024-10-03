import java .util.Scanner;
public class IT24510004Lab7Q1B
{ 
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double mark1,mark2,mark3,mark4,total,average;
      int student=1;
	

      for(student=1; student<=3;student++)
      {
        System.out.println("student" + student);

        System.out.print("Enter mark:");
        mark1=input.nextDouble();
        mark2=input.nextDouble();
        mark3=input.nextDouble();
        mark4=input.nextDouble();

        total = mark1+mark2+mark3+mark4;
        average = total/4;

        System.out.println("Average is:"+average);

        if(average<=100 && average>=75)
        {
            System.out.println("Overall Grade is: Distinction");

        }
        else if(average<=74 && average>=50)
        { 
            System.out.println("Overall Grade is:Credit");

        }
        else if(average<=49 && average>=0)
        {
            System.out.println("Overall Grade is:Fail");
        }
        
      }
   }
}