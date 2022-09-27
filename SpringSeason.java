import java.util.Scanner;

public class SpringSeason {
    public static void main(String args[]){
        Scanner object= new Scanner(System.in);
        System.out.println("enter day and month");
        int day= object.nextInt();
        int mon= object.nextInt();
        if((mon==3 && day>=20 && day<=31))
            System.out.println("True");
        else if((mon==4 && day>=1 && day<=30))
            System.out.println("True");
        else if((mon==5 && day>=1 && day<=31))
            System.out.println("True");
        else if((mon==6 && day>=1 && day<=20))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
