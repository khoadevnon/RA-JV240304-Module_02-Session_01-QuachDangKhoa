package Ra;

import java.util.Scanner;

public class Excercise_03 {
    public static void main(String[] args) {
/*
trong đó square là độ dài của một cạnh
perimeter là chu vi của hình vuông
area là diện tích của hình vuông
công thức
chu vi bằng 4*square
diện tích bằng square *square
 */
        float square, perimeter, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the square number: ");
        square = sc.nextFloat();
        perimeter = square * 2;
        area = perimeter * 2;
        System.out.println("Result:");
        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The area of the square is: " + area);

    }
}
