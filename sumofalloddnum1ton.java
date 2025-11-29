import java.util.*;

public class sumofalloddnum1ton {
    static void printsum(int n) {
        int sum =0;
        for (int i=1; i<=n;i++){
            if (i%2 !=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }

    static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        printsum(n);
    }
}