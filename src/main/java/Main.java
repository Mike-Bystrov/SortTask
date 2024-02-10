import repository.FileProcessorImpl;
import service.SortService;
import service.SortServiceImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileProcessorImpl fileProcessor = new FileProcessorImpl();
        SortServiceImpl service = new SortServiceImpl();
        ArrayList<String[]> arr = fileProcessor.readArrayFromFile("in.txt");
        service.sortArray(arr);
        fileProcessor.writeInfo(arr, "out.txt");
    }
}
