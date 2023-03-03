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
    this.pezCount = MAX_PEZ;
  }

  public String getCharacterName() {
    return characterName;
  }
}
