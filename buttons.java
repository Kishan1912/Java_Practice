import java.util.*;

public class buttons {
    static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int button = Sc.nextInt();

        if (button==1){
            System.out.println("hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if (button == 3) {
                System.out.println(" bonjour");
        }
        else {
            System.out.println("Invalid button");
        }
    }
}