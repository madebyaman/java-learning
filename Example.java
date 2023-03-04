public class Example {
  public static void main(String[] args) {
    System.out.println("We are making PEZ Dispenser");
    PezDispenser dispenser = new PezDispenser("Yoda");
    System.out.printf("The dispenser is %s \n", dispenser.getCharacterName());
    // Array declaration
    int[] scores;
    scores = new int[] { 1, 2, 3, 4 };
    System.out.printf("FIrst item: %d", scores[0]);
    try {
      dispenser.fill(400);
    } catch (IllegalArgumentException iae) {
      System.out.printf("Error: %s %n", iae.getMessage());
    }
  }
}
