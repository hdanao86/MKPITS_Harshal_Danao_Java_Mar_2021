//How to convert Array to List

import java.lang.reflect.Array;
import java.util.*;

public class ArraytoListConvertEx {
    public static void main(String[] args) {
        //creating array
        String[] array={"java","python","PHP","c++"};
        System.out.println("printing array : " + Arrays.toString(array));
        //converting array to list
        List<String > list=new ArrayList<String >();
        for (String s : array){
            list.add(s);//calling this method
        }
        System.out.println("printing list : " + list);

    }
}
