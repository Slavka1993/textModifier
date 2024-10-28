public class SumNumbers {
    // Метод для суммирования цифр и удаления их из строки
    public static Result sumAndRemoveDigits(String input) {
        int totalSum = 0; // Переменная для хранения суммы цифр
        StringBuilder resultString = new StringBuilder(); // Строка для хранения результата без цифр

        // Проходим по каждому символу в строке
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                totalSum += Character.getNumericValue(ch); // Суммируем цифры
            } else {
                resultString.append(ch); // Добавляем нецифровые символы
            }
        }

        // Возвращаем сумму и изменённую строку
        return new Result(totalSum, resultString.toString());
    }
}