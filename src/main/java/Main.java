import Day2_solutions.ValidAnagram;

public class Main {
    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        boolean result = validAnagram.isAnagram("cat", "act");
        System.out.println(result);
    }
}
