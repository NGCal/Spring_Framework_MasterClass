package com.training.springbasics.springin10steps.Basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgorithm {
    public int[] sort(int[] listOfNumbers) {
        //Sorting Magic
        return listOfNumbers;
    }
}
