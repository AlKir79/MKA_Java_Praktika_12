import java.util.Scanner;

public class MyArrOper {
    public static int[] arrInit(int size){
     int arr[] = new int [size];
        for (int i=0;i<size;i++){
         arr[i]=(int) ((Math.random()*100)-50);
     }
        return arr;
    }
    public static void arrPrint(int arr[]){
        for (int val:arr){
            System.out.print(" "+val);
        }
        System.out.println();
    }
    public static int summa(int arr[]){
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int maxVal(int arr[]){
        int max = arr[0];
        for (int  i=1;i<arr.length;i++){
            if (arr[i]>max) max=arr[i];
        }
        return max;
    }
    public static void chetArr(int arr[]){
        int chetCount = 0;
        int posCount = 0;
        for (int val:arr){
            if (val>0) posCount++;
            if (val%2==0) chetCount++;
        }
        System.out.println("Количество четных элементов массива "+ chetCount);
        System.out.println("Количество нечетных элементов массива "+ (arr.length-chetCount));
        System.out.println("Количество положительных элементов массива "+ posCount);
        System.out.println("Количество отрицательных элементов массива "+ (arr.length-posCount));
    }
    public static void sortArr(int arr[], Scanner in){
        boolean isSorted = false;
        int buf;
        int toMax = in.nextInt();
        if (toMax==1) {
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        isSorted = false;

                        buf = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = buf;
                    }
                }
            }
        }
        else{
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] < arr[i + 1]) {
                        isSorted = false;

                        buf = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = buf;
                    }
                }
            }
        }

    }
    public static int[] mirrorArr(int arr[]){
        int temp[] = new int [arr.length];
        int j=0;
        for (int i=arr.length-1;i>-1;i--){
            temp[j]=arr[i];
            j++;
        }
        return temp;
    }
    public static boolean findEl(int arr[],int digit){
        if()
        return ;
    }

}
