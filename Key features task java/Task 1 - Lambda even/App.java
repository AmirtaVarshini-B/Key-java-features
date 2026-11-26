import java.util.List;
import java.util.ArrayList;
public class App{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(null);
        numbers.add(-4);
        numbers.add(0);
        if (numbers == null || numbers.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        numbers.removeIf(num -> num == null || num % 2 != 0);
        System.out.println("Even numbers: " + numbers);

    }
}