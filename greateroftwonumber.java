import java.util.*;

public class greateroftwonumber {
   public static int getGreater(int a ,int b) {
        if (a>b){
            return a;
        }
        else {
            return b;
        }
    }

    static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        System.out.println( getGreater (a,b));
    }
    }