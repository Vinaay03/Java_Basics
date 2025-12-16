import java.util.*;
public class main1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float tempC = sc.nextInt();
        float tempF = (tempC*9/5) + 32;
        System.out.println(tempF);
        sc.close();
    }
}