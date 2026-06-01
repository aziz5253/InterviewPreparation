import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordGrouping {
            public static void main(String[] args) {
                List<String> words = Arrays.asList("to","be","or","not","to","be");

                Map<Integer, List<String>> result = words.stream()
                        .collect(Collectors.groupingBy(
                                String::length,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream()
                                                .sorted()
                                                .collect(Collectors.toList())
                                )
                        ));

                System.out.println(result);
            }
}

