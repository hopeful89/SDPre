import java.util.Scanner;

public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number: ");
      userNum = scanner.nextInt();
      if( userNum == 0 ){
        System.out.println("Your number is equal to 0");
      }else if( userNum < 0 ){
        System.out.println("Your number is negative");
      }else{
        System.out.println("Your number is positive");
      }

      scanner.close();
  }
}
