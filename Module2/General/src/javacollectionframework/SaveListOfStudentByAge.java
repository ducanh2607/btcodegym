package javacollectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SaveListOfStudentByAge {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nTHe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
