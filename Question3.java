import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {
      Scanner scan1 = new Scanner(System.in);
      boolean Q1;
      Scanner scan2 = new Scanner(System.in);
      boolean Q2;
      Scanner scan3 = new Scanner(System.in);
      boolean Q3;
      System.out.println("Is the earth a sphere?");
      Q1 = scan1.nextBoolean();
      System.out.println("Are swords sharp?");
      Q2 = scan2.nextBoolean();
      System.out.println("Can all brids fly?");
      Q3 = scan3.nextBoolean();
      System.out.println("Your Answer: " + Q1 + " Correct Answer: True");
      System.out.println("Your Answer: " + Q2 + " Correct Answer: True");
      System.out.println("Your Answer: " + Q3 + " Correct Answer: False");

        /* Write your code here */

    }
}