package service;

import repository.FileProcessorImpl;
import util.CustomComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortService {
    public void sortArray(ArrayList<String[]> arrayToSort) {
        CustomComparator comparator = new CustomComparator();
        arrayToSort.sort(comparator);
    }
}
