import java.util.Scanner;
import java.time.LocalDate;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;
    LocalDate date = LocalDate.now();
    currentYear = date.getYear();

    birthYear = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");

    age = input.nextInt();
    birthYear = currentYear - age;
    //without a month this is bound to be incorrect

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
