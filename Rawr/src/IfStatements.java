import java.util.Scanner;

public class IfStatements {
  
  public static void main(String[] args) {
    

      int age;
      
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter your age: ");
      age = scanner.nextInt();

      if(age >= 18){
        System.out.println("You are an adult.");
      } else {
        System.out.println("You are not an adult.");
      }

  }

}
