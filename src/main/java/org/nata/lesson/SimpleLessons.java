package org.nata.lesson;

public class SimpleLessons {

    //возвращает 0, a должен возвращать сумму двух входящих аргументов
    //если x = 2 а y = 3, значит метод должен вернуть 5
    public static int solveMeFirst(int x, int y) {
        return 0;
    }

    //этот метод должен возвращать true есле аргумент нечетный и false если аргумент четный
    public static boolean isOdd(int number) {
        return false;
    }

    public static void main(String[] args) {
        int result = solveMeFirst(2, 3);
        //инструкция assert предназначена для отладки кода, если внутри нее false,
        //программа вылетает в этом месте с ошибкой и дальше вычисления не идут
        assert (result == 5);
        assert (isOdd(5));
        assert (!isOdd(4));
    }

}
