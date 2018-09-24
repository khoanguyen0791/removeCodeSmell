package movies;

public enum Genre {
  CHILREN(2), ACTION(3), HORROR(4), ROMANCE(5);

  private int numVal;

  Genre(int numVal) {
    this.numVal = numVal;
  }

  public int getNumVal() {
    return numVal;
  }
}
