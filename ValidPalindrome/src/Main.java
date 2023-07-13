public class Main {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return false;

        String onlyLetters = s.trim().toUpperCase().replaceAll("[^a-zA-Z0-9]", "");
        String newString = "";
        for (int index = onlyLetters.length() - 1; index >= 0; index--) {
            newString = newString + onlyLetters.charAt(index);
        }
        return newString.equals(onlyLetters);
    }
}