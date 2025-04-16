import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("The story begins. Choose strength, agility, constitution, intelligence, wisdom, charisma (1-6).");
    String score = myObj.nextLine();
    System.out.println("There are many questions related to the crash landing which led to a sector civilization on an unexplored planet.");
    System.out.println("Mysterious legends exist, such as of a desert with a primitive charred wood enclosure.");
    System.out.println("Coastal lifeforms speak of nature disturbed by the mystery.");
    switch(score) {
      case "1":
          System.out.println("Melee & athletics.");
          break;
      case "2":
          System.out.println("Ranged & acrobatics");
          break;
      case "3":
          System.out.println("Kinetics & endurance");
          break;
      case "4":
          System.out.println("Magic & knowledge");
          break;
      case "5":
          System.out.println("Magic & oerception");
          break;
      case "6":
          System.out.println("Magic & diplomacy");
          break;
      default:
          System.out.println("Mixed approach.");
    }
  }
}
