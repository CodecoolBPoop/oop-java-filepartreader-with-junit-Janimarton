import java.io.*;
import java.util.ArrayList;


public class FilePartReader {

    public FilePartReader() {
    }

    public static void setup(String filePath, Integer fromLine, Integer toLine) throws IOException {
        // there was a task: toLine is smaller than fromLine throw: IllegalArgumentException
        // there was a task: if fromLine is smaller than 1 throw: IllegalArgumentException


        if (toLine < fromLine) throw new IllegalArgumentException("toLine cannot be lower than fromLine");
        if (fromLine < 1) throw new IllegalArgumentException("fromLine cannot be lower than 1");


    }

    public static String read(String filePath) throws IOException {
        // there was a task: 2018.11.19. opens the file on filePath , and gives back it's content as a String


        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");

        try {
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }

            return stringBuilder.toString();
        } finally {
            bufferedReader.close();
        }
    }

    public static String readLines(String filePath, Integer fromLine, Integer toLine) throws IOException {

        /*
        there was a task: 2018.11.19. reads the file with read ()
        there was a task: 2018.11.19. it gives back every line from it's content between fromLine and toLine
        (both of them are included), and returns these lines as a String.
        Take care because if fromLine is 1, it means the very first row in the file.
        Also, if fromLine is 1 and toLine is 1 also, we will read only the very first line.
        */

        String readedFile = FilePartReader.read(filePath);

        String[] fileInSentences = readedFile.split("\\.");
        ArrayList chosenPartOfTheFile = new ArrayList();

        for (int i = 0; i < fileInSentences.length; i++)
            if ((i + 1) >= fromLine && (i + 1) <= toLine) chosenPartOfTheFile.add(fileInSentences[i]);

        String listString = String.join(", ", chosenPartOfTheFile);

        return listString;
    }


}
