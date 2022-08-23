package com.nseit.springExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    private SortAlg sortAlg;
    public int binarySearch(int[] numbers, int numberToSearch) {
        int sortedNumbers = sortAlg.sort(numbers);
        return numberToSearch;
    }
}
