package repository;

import java.util.ArrayList;

public interface FileProcessor {
    ArrayList<String[]> readArrayFromFile(String path);

    void writeInfo(ArrayList<String[]> info);
}
