package Day1_solutions;

public class Dinglemouse {
    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        int ownedCat = calculateCatYears(catYears);
        int ownedDog = calculateDogYears(dogYears);

        return new int[] {ownedCat, ownedDog};
    }

    private static int calculateCatYears(int catYears) {
        if (catYears < 15) {
            return 0;
        } else if (catYears < 24) {
            return 1;
        } else {
            return 2 + (catYears - 24) / 4;
        }
    }

    private static int calculateDogYears(int dogYears) {
        if (dogYears < 15) {
            return 0;
        } else if (dogYears < 24) {
            return 1;
        } else {
            return 2 + (dogYears - 24) / 5;
        }
    }
}
