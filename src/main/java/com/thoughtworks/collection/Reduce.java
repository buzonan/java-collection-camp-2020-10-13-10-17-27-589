package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        List<Double> doubleArrayList = arrayList.stream().map(Double::valueOf).collect(Collectors.toList());
     return doubleArrayList.stream().reduce(Double::sum).map(total -> total / doubleArrayList.stream().count()).get();
    }


    public int getMaxValue() {
        return arrayList.stream().reduce(0, Integer::max);
    }

    public int getLastOdd() {
        return arrayList.stream().filter(integer -> integer%2 != 0).reduce((firstNum, secondNum) -> secondNum).get();
    }
}
