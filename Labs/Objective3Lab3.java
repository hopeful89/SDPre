public class Objective3Lab3{
  public static void main(String[] args){
    int first = 1 + (int)(Math.random() * 6);
    int second = 1 + (int)(Math.random() * 6);
    int third = 1 + (int)(Math.random() * 6);
    int average = (first + second + third ) / 3;
    //expected >> 3 + 6 + 2 = 11

    System.out.println(String.format("%s + %s + %s = %s",first, second, third, average));
  }
}
