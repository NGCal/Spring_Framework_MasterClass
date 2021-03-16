package com.training.springbasics.springin10steps.Basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("Quick")
public class QuickSort implements SortAlgorithm {

    Logger LOG = LoggerFactory.getLogger(QuickSort.class);

    public int[] sort(int[] listOfNumbers) {
        //Sorting Magic
        return listOfNumbers;
    }

    public int[] sort2(int[] listOfNumbers) {
        //Sorting Magic
        return listOfNumbers;
    }

    @PostConstruct
    public void welcomeLog() {
        LOG.info("The QuickSort Bean has been created");
    }

    @PreDestroy
    public void goodbyeMessage() {
        LOG.info("The QuickSort bean will be destroy");
    }
}
