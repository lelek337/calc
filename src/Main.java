import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Input:");
            calc(String.valueOf(scan));
        }
    }

    public static String calc(String input) {
        ExceptionsText min = ExceptionsText.MIN;
        ExceptionsText max = ExceptionsText.MAX;
        ExceptionsText noOperator= ExceptionsText.OPERATOR;

        String term = scan.nextLine();
        String[] strings = term.split(" ");

       if (term.length() > 5) {
            System.out.println(max.getText());
        }

        int[] numbers = new int[2];
        numbers[0] = Integer.parseInt(strings[0]);
        try {
            numbers[1] = Integer.parseInt(strings[2]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(min.getText());
        }


        int rezult = 0;
        switch (strings[1]) {
            case "+":
                rezult = numbers[0] + numbers[1];
                break;
            case "-":
                rezult = numbers[0] - numbers[1];
                break;
            case "*":
                rezult = numbers[0] * numbers[1];
                break;
            case "/":
                rezult = numbers[0] / numbers[1];
                break;
            default:
                System.out.println(noOperator.getText());
                break;
        }
//        if (rezult == null) {
//
//        }
            System.out.println(rezult);
            return (String.valueOf(rezult));


    }
}