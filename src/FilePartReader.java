public class FilePartReader {

    public FilePartReader() {
    }

    public void setup(String filePath, Integer fromLine, Integer toLine) {

        // TODO: 2018.11.19. if: toLine is smaller than fromLine throw: IllegalArgumentException
        // TODO: 2018.11.19. if fromLine is smaller than 1 throw: IllegalArgumentException

    }

    public String read() {
        // TODO: 2018.11.19. opens the file on filePath , and gives back it's content as a String

        return "Something String to return";
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
