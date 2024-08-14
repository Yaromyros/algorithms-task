package Day4_solutions;

public class Square {
    public int squareDigits(int n) {
        StringBuilder result = new StringBuilder();
        char[] number = String.valueOf(n).toCharArray();

        for (char c : number) {
            int digit = Character.getNumericValue(c);
            result.append(digit * digit);
        }

        return Integer.parseInt(result.toString());
    }
}
