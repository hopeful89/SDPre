import java.util.Scanner;

public class Objective5Lab4{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.println("Please choose a whole number");
    userNum = scanner.nextInt();

    if(userNum % 2 == 0) {
      System.out.println("Your number is even");
    }else{
      System.out.println("Your number is odd");
    }

  }
}
