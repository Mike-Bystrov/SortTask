package repository;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileProcessorImpl implements FileProcessor {

    PrintWriter printWriter;
    @Override
    public ArrayList<String[]> readArrayFromFile(String path) {
        ArrayList<String[]> arrayList = new ArrayList<>();

        try {
            Scanner sc = new Scanner(new File("in.txt"));
            while (sc.hasNextLine()) {
                arrayList.add(sc.nextLine().split("\t"));
            }
        } catch (FileNotFoundException e) {
            //TODO logi
            System.out.println("проверьте папку с исходниками");
        }
        return arrayList;
    }

    @Override
    public void writeInfo(ArrayList<String[]> info, String path) {
        try {
            printWriter = new PrintWriter(path);

            for (String[] el: info) {
                printWriter.println(Arrays.toString(el));
            }
            printWriter.close();
        } catch (IOException e) {
            System.out.println("sad((");
        }
    }
}
