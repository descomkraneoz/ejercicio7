import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = args[0];
        List<String> output = captureItemsBetweenDashes(input);
        System.out.println(output);
    }
    static List<String> captureItemsBetweenDashes(String input) {
        List<String> captured = new ArrayList<String>();
        Matcher m = Pattern.compile("-([^-]+)-").matcher(input);
        while (m.find()) {
            captured.add(m.group(1));
        }
        return captured;
    }
}
