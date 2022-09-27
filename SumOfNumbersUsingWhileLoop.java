import java.util.Scanner;

public class SumOfNumbersUsingWhileLoop {
    public static void main(String args[])
    {
        int x,i=1;
        int sum=0;
        System.out.println("Enter number=");
        Scanner s= new Scanner(System.in);
        x = s.nextInt();
        while(i<=x)
        {
           sum = sum+i;
           i++;
        }

    }
}
