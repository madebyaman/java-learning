class PezDispenser {
  public static final int MAX_PEZ = 12;
  // static = available to class before initialization. Like Integer.parseInt()
  final private String characterName;
  // Final = assign once only
  private int pezCount;

  // Constructor class
  public PezDispenser(String characterName) {
    this.characterName = characterName;
    pezCount = 0;
  }

  public void fill() {
    this.fill(MAX_PEZ);
  }

  public void fill(int amount) {
    int totalAmount = this.pezCount + amount;
    if (totalAmount > MAX_PEZ) {
      throw new IllegalArgumentException("Whoa too many PEZ!!!");
    }
    this.pezCount = totalAmount;
  }

  public boolean isEmpty() {
    return pezCount == 0;
  }

  public boolean dispense() {
    if (isEmpty()) {
      pezCount--;
      return true;
    } else
      return false;
  }

  public String getCharacterName() {
    return characterName;
  }
}
