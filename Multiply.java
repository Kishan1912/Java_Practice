import java.util.Scanner;

public class Multiply {
    public static int Calculateproduct(int a,int b){
        return  a*b;
    }
    public static void main(String args[]){
        Scanner Sc =new Scanner(System.in);
        int a=Sc.nextInt();
        int b = Sc.nextInt();

        System.out.println("multiplication of 2 numbers is :"+ Calculateproduct(a,b));
    }

}
