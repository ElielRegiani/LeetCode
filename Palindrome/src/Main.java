public class Main {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int resultado = 0;
        int y = x;

        while (y != 0) {
            resultado = resultado * 10 + y % 10;
            y = y / 10;
        }

        return x == resultado;
    }
}