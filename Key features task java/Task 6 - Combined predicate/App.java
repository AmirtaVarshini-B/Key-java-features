import java.util.List;
import java.util.function.Predicate;
class App
{
    public static void main(String[] args) {
        List<Integer> numbers=List.of(10,25,67,82,24);
        Predicate<Integer> greater=n->n>10;
        Predicate<Integer> divisible= s->s%3==0;
        Predicate<Integer>result=greater.and(divisible);
        for(Integer num:numbers)
        {
            if(result.test(num))
            {
                System.out.println(num);
            }
        }

    }
}