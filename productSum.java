//Subtract the product and sum of digits of an integer
import java.util.*;
public class productSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        int sum = 0;

        while(n>0){
            int lastDigit = n%10;
            product = product*lastDigit;
            sum = sum+lastDigit;
            n=n/10;
        }
        System.out.println(product-sum);
        sc.close();
    }
}
