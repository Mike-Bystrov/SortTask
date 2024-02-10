import repository.FileProcessorImpl;
import service.SortService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileProcessorImpl fileProcessor = new FileProcessorImpl();
        ArrayList<String[]> arr = fileProcessor.readArrayFromFile("in.txt");
        SortService.sortArray(arr);
        fileProcessor.writeInfo(arr, "out.txt");
    }
}
