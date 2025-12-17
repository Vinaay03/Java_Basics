import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rupees = sc.nextDouble();
        double exchangeRate  = 83.0;
        double dollars = rupees/exchangeRate;
        System.out.println(dollars);
    }
}
