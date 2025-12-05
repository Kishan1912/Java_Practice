import java.util.*;

public class Conditions {
    static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();

        if (a==b){
            System.out.println("Equal");
        } else if (a>b) {
            System.out.println("a is greater");

        }
        else {
            System.out.println("a is lesser");
        }
    }
}