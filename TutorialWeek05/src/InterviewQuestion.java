public class InterviewQuestion {
    public static boolean areAllCharsUnique(String text) {
        char[] letters = text.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            for (int j = i + 1; j < letters.length; j++) {
                if (letters[i] == letters[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
