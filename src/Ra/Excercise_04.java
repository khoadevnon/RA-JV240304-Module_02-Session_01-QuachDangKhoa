package Ra;

import java.util.Scanner;

public class Excercise_04 {
    public static void main(String[] args) {
        float markMath, markLiterature, markEnglish, avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Math mark: ");
        markMath = sc.nextFloat();
        System.out.println("Please enter your Literature mark: ");
        markLiterature = sc.nextFloat();
        System.out.println("Please enter your English mark: ");
        markEnglish = sc.nextFloat();
        avg = (markMath + markLiterature + markEnglish) / 3;
        System.out.println("Your average mark is: " + avg);


    }
}
