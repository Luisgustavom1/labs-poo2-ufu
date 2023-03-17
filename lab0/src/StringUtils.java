import java.util.HashMap;
import java.util.Map;

public class StringUtils {
  static boolean ifStringEndIsEqualToString(String firstString, String secondString) {
    String[] firstStringLetters = firstString.split("");
    String[] secondStringLetters = secondString.split("");
    int fistStringLength = firstString.length() - 1;

    for (int c = secondString.length() - 1; c >= 0; c--) {
      if (!secondStringLetters[c].equals(firstStringLetters[fistStringLength])) return false;
      fistStringLength--;
    }

    return true;
  }

  static Map<String, Integer> groupStringByChars(String string) {
    Map <String, Integer> stringGroup = new HashMap <String, Integer>();
    String[] letters = string.split("");

    for (String letter: letters) {
      Integer charQuantity = stringGroup.get(letter);
      if (charQuantity != null) {
        stringGroup.put(letter, charQuantity + 1);
        continue;
      }
      stringGroup.put(letter, 1);
    }

    return stringGroup;
  }
}