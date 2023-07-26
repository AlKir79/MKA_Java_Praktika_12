import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = MyArrOper.arrInit(20);
        MyArrOper.arrPrint(arr);
        // сумма элементов массива
        System.out.println(MyArrOper.summa(arr));
        // максимум в массиве
        System.out.println(MyArrOper.maxVal(arr));
        // количество положительныъх, отрицательных, четных и нечетных элементов массива
        MyArrOper.chetArr(arr);
        // сортировка массива по возрастанию/убыванию
        System.out.println("Сортировка по возрастанию - 1, убыванию -2");
        Scanner in = new Scanner(System.in);
        MyArrOper.sortArr(arr,in);
        MyArrOper.arrPrint(arr);
        // переворот содержимого массива
        arr = MyArrOper.mirrorArr(arr);
        MyArrOper.arrPrint(arr);
    }
}