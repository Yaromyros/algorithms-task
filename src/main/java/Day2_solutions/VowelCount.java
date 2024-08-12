package Day2_solutions;

public class VowelCount {
    private static final String VOWELS = "aeiou";

    public static int getCount(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (VOWELS.contains(String.valueOf(chars[i]))) {
                count++;
            }
        }
        return count;
    }
}
