import java.util.Scanner;
public class IT24510004Lab7Q1A
{ 
    public static void main(String[] args)
    { 
        Scanner input = new Scanner(System.in);
        int[][] mark = new int[3][4];
        double average = 0;
        int total = 0;

        for(int i = 0; i < 3; i++)
        {
            total = 0; // Reset total for each student
            System.out.println("Student " + (i + 1));
            
            for (int x = 0; x < 4; x++)
            {
                System.out.print("Enter Subject Mark " + (x + 1) + ": ");
                mark[i][x] = input.nextInt();
                total += mark[i][x];
            }

            average = total / 4.0;
            System.out.println("Average is: " + average);

            if (average >= 75 && average <= 100)
            { 
                System.out.println("Overall Grade is: Distinction");
            }
            else if (average >= 50 && average < 75)
            {
                System.out.println("Overall Grade is: Credit");
            }
            else if (average >= 0 && average < 50)
            {
                System.out.println("Overall Grade is: Fail");
            }
        }
        input.close();
    }
}
