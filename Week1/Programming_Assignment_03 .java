import java.util.Scanner;

public class Exercise1_1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double radius = s.nextDouble();
    double perimeter;
    double area;
    // Calculate the perimeter
    // Calculate the area
    {
      if (radius <= 0)
        System.out.print("please enter non zero positive number ");
    }

    // Calculate the perimeter
    perimeter = 2 * Math.PI * radius;
    // Calculate the area
    area = (Math.PI) * radius * radius;

    System.out.print(perimeter + "\n" + area);
  }
}