import java.util.ArrayList;
import java.util.List;

public class Main {

    public boolean isValid(String s) {

        List<Character> openBracketsList = new ArrayList<>();
        char[] charArray = s.toCharArray();

        for (char character : charArray) {
            if (isOpenBracket(character)) {
                openBracketsList.add(character);
            } else {
                if (openBracketsList.isEmpty()) return false;
                if (closeBracketHasCorrespondingOpenBracket(openBracketsList.get(openBracketsList.size() - 1), character)) {
                    openBracketsList.remove(openBracketsList.size() - 1);
                } else {
                    return false;
                }
            }
        }
        return openBracketsList.isEmpty();
    }

    private boolean closeBracketHasCorrespondingOpenBracket(Character character, char c) {
        return switch (character) {
            case '(' -> c == ')';
            case '{' -> c == '}';
            default -> c == ']';
        };
    }

    private boolean isOpenBracket(char character) {
        return character == '(' || character == '[' || character == '{';
    }
}