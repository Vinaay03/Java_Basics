import java.util.*;
public class rupeestodollars {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in rupees");
        double rupees = sc.nextDouble();
        double exchangeRate = 83.0;
        double dollars = rupees/exchangeRate;
        System.out.println("Amount in dollars: "+dollars);
        sc.close();

    }
    
}
