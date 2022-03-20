public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1,2);
        int b = calc.minus.apply(1,1);

        // Реализация лямбда-выражения в переменной divide приведёт к выбросу исключения ArithmeticException: / by zero
        // В данном случает происходит деление на ноль
        // int c = calc.divide.apply(a, b);

        // Применим другую реализацию с проверкой деления на ноль.
        // Примитивный тип int подразумевает хранение только целых чисел,
        // поэтому используем обёртку Integer для возможности хранения null в качестве ошибки
        Integer c = calc.divideByZero.apply(a, b);

        calc.println.accept(c);
    }
}
