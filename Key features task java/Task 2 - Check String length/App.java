import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class App {
    public static void main(String[] args) {
        List<String> str=new ArrayList<>(List.of("John","Anu","Joe","Priyaaa","Amirtaaa"));
        if (str == null || str.isEmpty()) {
            System.out.println("List is null or empty");
            return;
        }
        Predicate<String> checkLength =
            s -> s != null &&
                 !s.trim().isEmpty() &&
                 s.length() >= 5;
        List<String> result=new ArrayList<>();
        for(String n:str)
        {
            if(checkLength.test(n))
            {
                result.add(n);
            }
        }
        System.out.println("Original list: "+str);
        System.out.println("Modified list: "+result);
    }
}
