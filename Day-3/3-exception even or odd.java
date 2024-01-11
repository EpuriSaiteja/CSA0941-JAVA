import java.util.Scanner;
class Exception {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        try {
            checkEvenNumber(number);
            System.out.println(number + " is even.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); 
        }
    }

    static void checkEvenNumber(int number) throws IllegalArgumentException {
        if (number % 2 != 0) {
            throw new IllegalArgumentException(number + " is odd.");
        }
    }
}
