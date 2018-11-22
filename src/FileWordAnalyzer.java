import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileWordAnalyzer {


    public FileWordAnalyzer(FilePartReader filePartReader) {
    }

    public List getWordsOrderedAlphabetically(String filePath) throws IOException {
        // there was a task: 2018.11.19. returns the words ordered by alphabetically as an ArrayList

        ArrayList resultList = new ArrayList();

        String readedFile = FilePartReader.read(filePath);
        String[] splitedReadedFile = readedFile.split("\\s+");

        for (int i = 0; i < splitedReadedFile.length; i++) {
            resultList.add(splitedReadedFile[i]);
        }

        java.util.Collections.sort(resultList);


        return resultList;

    }

    public List getWordsContainingSubstring(String subString) {
        // TODO: 2018.11.19. returns the words which contains the subString
        //        FilePartReader.readLines();

        ArrayList resultList = new ArrayList();
        return resultList;
    }

    public List getStringsWhichPalindromes() {
        // TODO: 2018.11.19. returns the words from the String which are palindrome
        //        FilePartReader.readLines();

        ArrayList palindromeList = new ArrayList();
        return palindromeList;
    }


}
