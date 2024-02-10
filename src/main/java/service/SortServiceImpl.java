package service;

import util.CustomComparator;
import java.util.ArrayList;

public class SortServiceImpl implements SortService{

    @Override
    public void sortArray(ArrayList<String[]> arrayToSort) {
        CustomComparator comparator = new CustomComparator();
        arrayToSort.sort(comparator);
    }
}
