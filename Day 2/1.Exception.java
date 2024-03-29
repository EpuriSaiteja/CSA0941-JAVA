public class ExceptionExample {
  public static void main(String[] args) {
    try {
      int a = 10, b = 0;
      int result = a / b;
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }

    try {
      int[] arr = {1, 2, 3};
      int value = arr[3];
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}