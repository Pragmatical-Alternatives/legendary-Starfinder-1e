import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("The story begins. Choose strength, agility, constitution, intelligence, wisdom, charisma (1-6).");

    String score = myObj.nextLine();
    System.out.println("Username is: " + score);
  }
}
