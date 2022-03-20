import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    // Данная реализация не предусматривает деление на 0 (выбрасывается исключение)
    BinaryOperator<Integer> divide = (x, y) -> x / y;

    // При делении на 0 возвращается null означающее ошибку
    BinaryOperator<Integer> divideByZero = (x, y) -> y != 0 ? x / y : null;

    UnaryOperator<Integer> pow = x -> x * x;

    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}
