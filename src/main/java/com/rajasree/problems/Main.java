package com.rajasree.problems;

import com.rajasree.problems.set.iteration.SetsByIteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println(SetsByIteration.findSubSets(intList));
    }
}
