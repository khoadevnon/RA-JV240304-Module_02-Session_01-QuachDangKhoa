package Ra;

import java.util.Scanner;

public class Excercise_05 {
    public static void main(String[] args) {
        float permeter, area, radius;
        final float PI = 3.14f;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextFloat();
        permeter = 2 * PI *radius;
        area = PI * radius * radius;
        System.out.println(
                "Result"
        );
        System.out.println("Enter the perimeter of the circle: " + permeter);
        System.out.println("Enter the area of the circle: " +area);

    }
}
