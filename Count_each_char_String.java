import java.util.IdentityHashMap;
import java.util.Map;
// how many times each character appears in a string.
public class Count_each_char_String {

   public static void main(String[] args) {

       String name = "karthik";
       Map<Character, Integer> map = new IdentityHashMap<>();

       for (char ch:name.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);
       }
       for (Map.Entry<Character,Integer>entry:map.entrySet()){
           System.out.println(entry.getKey() + " occured " + entry.getValue() + " times ");

       }

    }
}