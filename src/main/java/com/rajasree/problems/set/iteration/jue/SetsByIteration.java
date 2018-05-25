package com.rajasree.problems.set.iteration.jue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SetsByIteration {

    /**
     * @param inputList a non-null list for which the sublists to be found
     * @param <T>       Any Class of type T
     * @return List of subsets (which is a list). So, returns a list of lists
     */
    public static <T> List<List<T>>  getSubset(List<T> inputList) {
        List<List<T>> result = Collections.emptyList();
        for(T element : inputList) {
            result = merge2(element, result);
        }
        return result;
    }

    public static <T> List<List<T>> merge2(T element, List<List<T>> output ) {
        List<List<T>> outputFinal = new ArrayList<>(output);

        //merge given lists
        outputFinal.add(Arrays.asList(element));

        // cross merges with each elements
        for(List<T> item: output) {
            List<T> newItem =  new ArrayList<>(item);
            newItem.add(element);
            outputFinal.add(newItem);
        }
        return outputFinal;
    }
}
