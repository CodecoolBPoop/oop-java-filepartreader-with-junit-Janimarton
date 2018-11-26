import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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

    public List getWordsContainingSubstring(String subString, String filePath) throws IOException {
        // there was a task: 2018.11.19. returns the words which contains the subString

        ArrayList resultList = new ArrayList();

        String readedFile = FilePartReader.read(filePath);
        String[] splitedReadedFile = readedFile.split("\\s+");

        for (int i = 0; i < splitedReadedFile.length; i++) {
            if (splitedReadedFile[i].contains(subString)) {
                resultList.add(splitedReadedFile[i]);
            }
        }

        return resultList;
    }

    public List getStringsWhichPalindromes(String filePath) throws IOException {
        // there was a task: 2018.11.19. returns the words from the String which are palindrome

        ArrayList<String> palindromeList = new ArrayList<>();
        ArrayList<String> testList = new ArrayList<>();


        String rawReadedFile = FilePartReader.read(filePath);
        String readedFile = rawReadedFile.replaceAll("[-+.^:,]", "");
        String[] temporary = readedFile.split("\\s");
        for (String word : temporary) {
            palindromeList.add(word);
        }


        for (String word : palindromeList) {
            if ((word.equals(new StringBuffer(word).reverse().toString()))) {
                testList.add(word);
            }
        }

        return testList;
    }


}
