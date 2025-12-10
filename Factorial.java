import java.util.Scanner;

public class Factorial {
    public static void printfactorial(int n) {
        //loop
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

            System.out.println(factorial);
        return;
        }
//        if (n < 0) {
//            System.out.println("invalid number");
//        }

        public static void main(String args[]){
            Scanner Sc = new Scanner(System.in);
          int n = Sc.nextInt();

            printfactorial(n);
        }

    }

