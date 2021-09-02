import java.util.Scanner;

public class FindHypotenuse {
  
  public static void main( String[] args) {
    
    double x;
    double y;
    double result;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter side x: ");
    x = scanner.nextDouble();
    
    System.out.println("Enter side y: ");
    y = scanner.nextDouble();

    result = Math.sqrt((x*x)+(y*y));

    System.out.println("The hypotenuse is "+result);


    scanner.close();

  }

}
