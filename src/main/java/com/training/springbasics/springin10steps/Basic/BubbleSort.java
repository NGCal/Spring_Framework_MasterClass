package com.training.springbasics.springin10steps.Basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
@Primary
public class BubbleSort implements SortAlgorithm {

    Logger LOG = LoggerFactory.getLogger(BubbleSort.class);

    public int[] sort(int[] listOfNumbers) {
        //Sorting Magic
        return listOfNumbers;
    }

    @PreDestroy
    public void goodbyeMessage() {
        LOG.info("The BubbleSort Bean will be destroy");
    }
}
