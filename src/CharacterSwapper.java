public class CharacterSwapper {
    public static String swapCharacters(String input) {
        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length; i++) {
            if (chars[i] == '-') {
                // Проверим, чтобы найти символы слева и справа от '-'
                if (i > 0 && i < length - 1) {
                    // Меняем местами символ слева и справа от '-'
                    result.setCharAt(result.length() - 1, chars[i + 1]); // Символ справа
                    result.append(chars[i - 1]); // Символ слева
                } else if (i > 0) {
                    // Если '-' находится в начале, просто добавляем символ слева
                    result.append(chars[i - 1]);
                } // Если '-' в самом конце, ничего не добавляем
                // Пропускаем следующий символ, поскольку это '-'
                i++;
            } else {
                // Добавляем без изменений, если это не '-'
                result.append(chars[i]);
            }
        }

        return result.toString();
    }
}
