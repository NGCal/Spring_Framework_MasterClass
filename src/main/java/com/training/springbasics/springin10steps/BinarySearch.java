package com.training.springbasics.springin10steps;

public class BinarySearch {

    /*MOCK CLASS WITH NOT ACTUAL IMPLEMENTATION*/
    public int search(int[] listOfNumbers, int number) {

        /*
        This method will return the index of the search number within the provided array, if the number it's not
        present the method will return -1.
        THe steps are:
        *   1. Sort the array
        *   2. Search the array
        *   3. Return the index */

        int response = -1;
        //1:
        BubbleSort sorter = new BubbleSort();
        int[] sortedArray = sorter.sort(listOfNumbers);

        //2: Magic search
        response = 3;

        return response;

    }
}
