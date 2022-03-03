package task2;

import java.util.ArrayList;

public class ArrOfArrayList  {



    public static void main(String[] args) {
        Integer[] array = {1,2,3};
        convert(array);






    }
    public static <T> T convert( T[] arr){
        ArrayList<T> list = new ArrayList<>();
        for (int i =0; i<arr.length; i++) {
            list.add(arr[i]);
        }
            System.out.println(list);
        return (T) list;

        }




    }



