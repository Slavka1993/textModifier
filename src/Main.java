import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            System.out.println(input);// Пример входной строки

            // Вызываем метод для удаления пробелов
            String delSpace = StringUtil.removeSpace(input);
            System.out.println("Строка без пробелов:" + delSpace);

            String swapChar = CharacterSwapper.swapCharacters(delSpace);
            System.out.println("Строка с заменой символов:" + swapChar);

            String remChar = StringUtil.replacePlusWithExclamation(swapChar);
            System.out.println("Замена + на !:" + remChar);

            Result result = SumNumbers.sumAndRemoveDigits(remChar);
            System.out.println(result.getProcessedString());
        }
    }