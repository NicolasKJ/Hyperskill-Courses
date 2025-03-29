public class WordCutter
{
    // Method that returns the first half of the input string
    public static String cutInHalf(String word) {

        int halfLength = word.length() / 2;
        return word.substring(0, halfLength);
    }
}