public class helloNumbers {

  public static void main(String[] args) {
    int result = 0;
    int x = 0;
    while (x < 9) {
      System.out.print(result + " ");
      x++;
      result += x;
    }
    System.out.print("\n" + result);
  }
}
