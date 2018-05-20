package com.rajasree.problems.set.iteration;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class SetsByIteration {

    /**
     * @param inputList a non-null list for which the sublists to be found
     * @param <T>       Any Class of type T
     * @return List of subsets (which is a list). So, returns a list of lists
     */
    public static <T> List<List<T>> findSubSets(@NotNull List<T> inputList) {
        List<List<T>> outputList = Collections.emptyList();
        for (T element : inputList) {
            outputList = merge(element, outputList);
        }
        return outputList;
    }

    private static <T> List<List<T>> merge(T element, List<List<T>> outputList) {
        List<List<T>> finalOutputList = new ArrayList<>(outputList);
        finalOutputList.add(Arrays.asList(element));
        for (List<T> subSet : outputList) {
            List<T> newSets = Arrays.asList(element);
            newSets.addAll(subSet);
            finalOutputList.add(newSets);
        }
        return finalOutputList;
    }
}
