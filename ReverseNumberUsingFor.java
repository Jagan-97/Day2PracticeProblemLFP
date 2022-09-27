public class ReverseNumberUsingFor {
    public static void main(String args[]){
        int reverse=0 ,a,n=12345;
        for( ;n!=0;){
            a=n%10;
            reverse=(reverse*10)+a;
            n=n/10;
        }
        System.out.println("Reverse of number is= "+reverse);
    }
}
