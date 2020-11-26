package TD.TD;

public class TestsTime {
  public static void main(String[] args) {
    TD.iTime babs = new TD.iTime(23, 59, 0);
    for (int i = 0; i < 60; i++) {
      babs.nextSecond();
    }
    System.out.println(babs);
  }
}
