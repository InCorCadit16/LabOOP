import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    static final String INPUT = "A theory is a contemplative and rational type of abstract or generalizing thinking about a phenomenon, "
            + "or the results of such thinking. The process of contemplative and rational thinking often is associated with such processes "
            + "like observational study, research. Theories may either be scientific or other than scientific (or scientific to less extent). "
            + "Depending on the context, the results might, for example, include generalized explanations of how nature works. The word has "
            + "its roots in ancient Greek, but in modern use it has taken on several related meanings. In modern science, the term \"theory\" "
            + "refers to scientific theories, a well-confirmed type of explanation of nature, made in a way consistent with scientific method, and "
            + "fulfilling the criteria required by modern science. Such theories are described in such a way that scientific tests should be able "
            + "to provide empirical support for it, or empirical contradiction (\"falsify\") of it. Scientific theories are the most reliable, "
            + "rigorous, and comprehensive form of scientific knowledge,[1] in contrast to more common uses of the word \"theory\" that imply that "
            + "something is unproven or speculative (which in formal terms is better characterized by the word hypothesis).[2] Scientific theories "
            + "are distinguished from hypotheses, which are individual empirically testable conjectures, and from scientific laws, which are "
            + "descriptive accounts of the way nature behaves under certain conditions.\n Theories guide the enterprise of finding facts rather "
            + "than of reaching goals, and are neutral concerning alternatives among values. A theory can be a body of knowledge, which may "
            + "or may not be associated with particular explanatory models. To theorize is to develop this body of knowledge.";

    // static final String INPUT = "test orE h tIme. qwd.";
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[.]");
        System.out.printf("Number of sentences: %d\n", p.matcher(INPUT).results().count());

        p = Pattern.compile("\s");
        System.out.printf("Number of words: %d\n", p.matcher(INPUT).results().count() + 1);

        p = Pattern.compile("[A-Z]|[a-z]");
        System.out.printf("Number of letters: %d\n", p.matcher(INPUT).results().count());

        p = Pattern.compile("[aeiouAEIOU]");
        System.out.printf("Number of vowels: %d\n", p.matcher(INPUT).results().count());

        p = Pattern.compile("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]");
        System.out.printf("Number of consonants: %d\n", p.matcher(INPUT).results().count());

        p = Pattern.compile("[A-Z]|[a-z]");
        StringBuilder onlyWords = new StringBuilder();
        for (Character c : INPUT.toCharArray()) {
            if (Character.isAlphabetic(c) || Character.isWhitespace(c)) {
                onlyWords.append(c);
            }
        }

        System.out.println("\nTop 5 most often words: ");
        String[] words = onlyWords.toString().split("\s");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
        list.stream()
            .collect(Collectors.groupingBy(word -> word))
            .entrySet()
            .stream()
            .sorted((pair1, pair2) -> pair2.getValue().size() - pair1.getValue().size())
            .limit(5)
            .forEach(value -> System.out.println(value.getKey() + " - " + value.getValue().size()));

        String longest = list.stream().max((w1, w2) -> w1.length() - w2.length()).get();
        System.out.printf("\nLongest word: %s", longest);
    }
}