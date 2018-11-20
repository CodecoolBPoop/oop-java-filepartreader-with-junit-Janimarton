import java.io.*;


public class FilePartReader {

    public FilePartReader() {
    }

    public void setup(String filePath, Integer fromLine, Integer toLine) throws IOException {
        // there was a task: toLine is smaller than fromLine throw: IllegalArgumentException
        // there was a task: if fromLine is smaller than 1 throw: IllegalArgumentException


        if (toLine < fromLine) throw new IllegalArgumentException("toLine cannot be lower than fromLine");
        if (fromLine < 1) throw new IllegalArgumentException("fromLine cannot be lower than 1");


        File file = new File(filePath);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String line;
        int lineCounter = 0;
        while ((line = bufferedReader.readLine()) != null && toLine >= fromLine) {
            lineCounter++;
            if (lineCounter > fromLine) {
                System.out.println(line + "\n");
            }
        }


    }

    public String read(String filePath) throws IOException {
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

    public static String readLines() {

        /*
        TODO: 2018.11.19. reads the file with read ()
        TODO: 2018.11.19. it gives back every line from it's content between fromLine and toLine
        (both of them are included), and returns these lines as a String.
        Take care because if fromLine is 1, it means the very first row in the file.
        Also, if fromLine is 1 and toLine is 1 also, we will read only the very first line.
        */

        return "Something String to return";
    }


}
