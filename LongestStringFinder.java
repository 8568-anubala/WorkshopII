import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringFinder {
    public static void main(String[]args) {
        List<String> strings = Arrays.asList("Pune", "hydrabad", "Jalandhar", "Ludhania");
        Optional<String> longestString = strings.stream().max(Comparator.comparingInt(String::length));
        longestString.ifPresent(s -> System.out.println("Longest string: " + s));
    }
    }

