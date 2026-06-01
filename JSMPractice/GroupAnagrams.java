import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("eat","tea","tan","ate","nat","bat");

        Map<String, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(word -> {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars); // key
                }));

        List<List<String>> result = new ArrayList<>(grouped.values());

        System.out.println(result);
    }
}