package arrays;

import java.util.ArrayList;
import java.util.List;

public class ListObjectFillingWithArrayList {
    // Write a cycle that would fill 'list' object with 'array' list

    public static void main(String args[]) {
        String array[] = {"a","b","c","d"};

        List<String> list = getListFromStringArray(array);
        System.out.println(list);

        for (int i=0; i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<String> getListFromStringArray(String[] array2) {
        List<String> list2 = new ArrayList<String>();
        for (int i=0; i<array2.length; i++) {
            list2.add(array2[i]);
        }
        return list2;
    }
}
