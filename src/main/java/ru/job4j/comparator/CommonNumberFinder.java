package ru.job4j.comparator;

import java.util.Comparator;
import java.util.List;

public class CommonNumberFinder {

    public int findCommonNumber(List<Integer> list1, List<Integer> list2, List<Integer> list3) {
        if (list1.size() > 1 && list2.size() > 1 && list3.size() > 1) {
            list1.sort(Comparator.reverseOrder());
            list2.sort(Comparator.reverseOrder());
            list3.sort(Comparator.reverseOrder());
            int i = 0, j = 0, k = 0;
            while (i < list1.size() && j < list2.size() && k < list3.size()) {
                int num1 = list1.get(i), num2 = list2.get(j), num3 = list3.get(k);
                if (num1 == num2 && num2 == num3) {
                    return num1;
                }
                if (num1 >= num2 && num1 >= num3) {
                    i++;
                } else if (num2 >= num1 && num2 >= num3) {
                    j++;
                } else {
                    k++;
                }
            }
        }
        return -1;
    }
}
