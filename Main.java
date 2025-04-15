import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("The story begins. Choose strength, agility, constitution, intelligence, wisdom, charisma (1-6).");
    String score = myObj.nextLine();
    System.out.println("Score: " + score);
    System.out.println("There are many questions related to the crash landing which led to a sector civilization on an unexplored planet.");
    System.out.println("Mysterious legends exist, such as of a desert with a primitive charred wood enclosure.");
  }
}
