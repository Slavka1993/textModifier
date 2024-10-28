public class StringUtil {
    public static String removeSpace(String input) {
        String str = input;
        str = str.trim();
        String[] words = str.split("\\s+");
        String cleaned = String.join(" ", words);
        return cleaned;
    }

    public static String replacePlusWithExclamation(String input) {
        String result = input.replace("+", "!");
        return result.toString();
    }
}
