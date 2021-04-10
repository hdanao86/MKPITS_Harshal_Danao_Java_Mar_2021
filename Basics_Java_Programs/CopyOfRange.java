// wap to use copyofrange method of array class to copy some characters from one array to another
import java.util.*;
public class CopyOfRange {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e'};
        char[] copyTo =java.util.Arrays.copyOfRange(copyFrom,2,9);
        System.out.println(new String(copyTo));
    }
}