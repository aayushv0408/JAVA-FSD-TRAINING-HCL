package CollectionFramework;
import java.util.HashMap;
import java.util.Map;
public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Mohit", 90);
        marks.put("Vineet", 85);
        marks.put("Champak", 92);
        marks.put("Ravi", 80);
        System.out.println(marks);
        System.out.println("Ravi's marks: " + marks.get("Ravi"));
        marks.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}