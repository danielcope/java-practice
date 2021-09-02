public class SwappingVari {
  public static void main(String [] args) {

    String x = "x";
    String y = "y";
    String temp;

    temp = x;
    x=y;
    y=temp;

    System.out.println(x);
    System.out.println(y);

  }
}
