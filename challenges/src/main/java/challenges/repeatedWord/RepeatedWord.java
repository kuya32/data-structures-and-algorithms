package challenges.repeatedWord;

import java.util.Arrays;

public class RepeatedWord {
    public String repeatedWord(String string) {
        string = string.toLowerCase();
        string = string.replace(",", "");
        String[] words = string.split(" ");

        for (int i = 0; i < words.length; i++) {
            for (int j = i - 1; j > -1; j--) {
                if (words[i].equals(words[j])) {
                    return words[i];
                }
            }
        }
        return null;
    }
}
