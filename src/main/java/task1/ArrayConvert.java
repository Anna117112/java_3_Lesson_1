package task1;

import java.util.Arrays;

public class ArrayConvert {

    public static void main(String[] args) {
        String[] strings = {"1", "2"};
        arrayConv(strings,0,1);
        System.out.println(Arrays.toString(strings));

    }
    public static <T> void arrayConv (T[] arr, int index1, int index2){
        T oject = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = oject;

    }
}
