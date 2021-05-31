package org.zgkaii.collection;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/05/27 01:05
 * @Description: Arrays.asList() 测试
 **/
public class ArraysAsList {
    public static void main(String[] args) {
        String[] myArray = {"Apple", "Banana", "Orange"};
        List<String> myList = Arrays.asList(myArray);
        // 上面两个语句等价于下面一条语句
        List<String> myList1 = Arrays.asList("Apple", "Banana", "Orange");
        System.out.println(myList);
        System.out.println(myList1);

        int[] myArray1 = {1, 2, 3};
        List myList2 = Arrays.asList(myArray1);
        System.out.println(myList2.size()); // 1
        System.out.println(myList2.get(0)); // 数组地址值
        System.out.println(myList2.get(1)); // 报错：ArrayIndexOutOfBoundsException
        int[] array = (int[]) myList2.get(0);
        System.out.println(array[0]); // 1
    }
}
