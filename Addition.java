import java.util.Scanner;

public class Addition {
    public static int CalculateSum(int a,int b){
        int sum= a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner Sc =new Scanner(System.in);
        int a=Sc.nextInt();
        int b = Sc.nextInt();
        int sum = CalculateSum(a,b);
        System.out.println("sum of 2 numbers is :"+ sum);
    }

}
