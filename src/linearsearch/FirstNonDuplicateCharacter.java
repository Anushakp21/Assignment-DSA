package linearsearch;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonDuplicateCharacter {
    public static char findFirstNonDuplicate(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c; 
            }
        }

        return '\0'; 
    }

    public static void main(String[] args) {
        String str = "swiss";
        char result = findFirstNonDuplicate(str);
        if (result != '\0') {
            System.out.println("First non-duplicate character is: " + result);
        } else {
            System.out.println("No non-duplicate character found.");
        }
    }
}
