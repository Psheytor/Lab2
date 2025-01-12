import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static <bool> void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean  flag=true;
        System.out.println("Введите строку, которая является шестизначным числом, записанным в десятичной системе счисления без нулей в старших разрядах.\n– пример правильных выражений: 123456, 234567.– пример неправильных выражений: 1234567, 12345.");

        while(flag){
            System.out.println("Введите строку:");
            String input = scanner.nextLine();

            if(input.isEmpty()) {
                System.out.println("Вы ввели пустую строку!");
                flag = true;
            }
            else
                flag=false;
        }

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        if (isSixDigitNumber(input)) {
            System.out.println("Строка является шестизначным числом без нулей в старших разрядах");
        } else {
            System.out.println("Строка не является шестизначным числом без нулей в старших разрядах");
        }
        scanner.close();
    }

    public static boolean isSixDigitNumber(String input) {
        String regex = "^[1-9]\\d{5}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
}