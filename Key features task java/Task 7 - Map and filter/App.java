import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(20,22,13,16,67);
        int result=numbers.stream()
            .map(n->n*n)
            .reduce(0,(a,b)->a+b);
        System.out.println(result);
    }
}
