import java.util.function.Function;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Function<String,String> uppercase = str->str.toUpperCase();
        Scanner sc=new Scanner(System.in);
        String string1=sc.nextLine();
        String finstr= uppercase.apply(string1);
        System.out.println(finstr);
        sc.close();
    }
}