package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>(sourceList);
        for (int num : sourceList) {
            if (num % 2 == 0) {
                while (num % 2 == 0) {
                    num /= 2;
                    result.add(num);
                }
            } else {
                result.add(num * 2);
            }
        }
        return result;
    }
}
