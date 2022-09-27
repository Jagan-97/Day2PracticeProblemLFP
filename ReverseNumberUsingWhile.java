public class ReverseNumberUsingWhile {
    public static void main(String args[])
    {
      int number =12345, r=0;
      while(number!=0)
      {
          int remainder = number%10;
          r=r*10+remainder;
          number=number/10;
      }
      System.out.println("The reverse of given number is:"+r);
    }
}
