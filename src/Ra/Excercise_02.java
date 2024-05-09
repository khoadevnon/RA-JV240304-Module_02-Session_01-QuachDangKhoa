package Ra;

import java.util.Scanner;

public class Excercise_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the USD amount: ");
        int usd = sc.nextInt();
        final int rates = 25114;
        int vnd = usd*rates;
        System.out.println("The amount of USD converted to VND is " + vnd + " Vietnamdong");


    }
}
