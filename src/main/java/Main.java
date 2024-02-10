import repository.FileProcessorImpl;
import service.SortService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SortService service = new SortService();
        FileProcessorImpl fileProcessor = new FileProcessorImpl();

        ArrayList<String[]> arr = fileProcessor.readArrayFromFile("in.txt");
        service.sortArray(arr);
        fileProcessor.writeInfo(arr);
    }
}
