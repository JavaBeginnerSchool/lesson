package org.nata.lesson;

public class ArraysLessons {

    //В этот метод передается массив и целое положительное число n.
    //Нужно вернуть из массива значение по индексу n
    //А если n больше длины массива, вернуть -1.
    //Например массив array равен {0, 10, 20} а n равно 1,
    //тогда метод вернет 10
    //А если массив array равен {0, 10, 20} а n равно 3,
    //тогда метод вернет -1
    public static int findNumberByIndex(int[] array, int n) {
        return 0;
    }

    //В этот метод передается массив целых положительных чисел и целое положительное число,
    //нужно пройти по массиву и посмотреть, есть ли в нем это число.
    //И если есть, вернуть его номер т.е., вернуть его индекс в массиве.
    //А есле его там нет, вернуть -1
    //Например массив array равен {0, 10, 20} а n равно 20,
    //тогда метод вернет 2
    //А если массив array равен {0, 10, 20} а n равно 30,
    //тогда метод вернет -1
    public static int findIndexOfNumber(int[] array, int number) {
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {0, 10, 20};
        assert (10 == findNumberByIndex(array, 1));
        assert (-1 == findNumberByIndex(array, 3));
        assert (2 == findIndexOfNumber(array, 20));
        assert (-1 == findIndexOfNumber(array, 30));
    }
}
