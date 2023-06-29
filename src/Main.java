import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static boolean exit = true;

    public static void main(String[] args) {
        while (exit) {
            System.out.println("Input:");
            String term = scan.nextLine();
            try {
                String result = calc(term);
                System.out.println("Output: \n" + result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String calc(String input) throws Exception {
        String[] strings = input.split(" ");
        if (strings.length != 3) {
            throw new Exception(ExceptionsText.FORMAT_ERROR.getText());
        }

        int num1 = parseNumber(strings, 0);
        int num2 = parseNumber(strings, 2);

        OperatorType operator = OperatorType.findOperationType(strings[1]);
        return String.valueOf(operator.calculate(num1, num2));
    }

    private static int parseNumber(String[] strings, int index) throws Exception {
        try {
            int result = Integer.parseInt(strings[index]);
            if (result < 0 || result > 10) {
                exit = false;
                throw new Exception(ExceptionsText.RANGE_ERROR.getText());
            }
            return result;
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new Exception(ExceptionsText.MIN.getText());
        } catch (NumberFormatException e) {
            throw new Exception(ExceptionsText.NO_VALID.getText());
        }
    }
}
