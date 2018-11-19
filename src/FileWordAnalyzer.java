import java.util.ArrayList;
import java.util.List;

public class FileWordAnalyzer {


    public FileWordAnalyzer(FilePartReader object) {
    }

    public List getWordsOrderedAlphabetically() {
        FilePartReader.readLines();
        // TODO: 2018.11.19. returns the words ordered by alphabetically as an ArrayList
        ArrayList resultList = new ArrayList();
        return resultList;

    }

    public List getWordsContainingSubstring(String subString) {
        FilePartReader.readLines();
        // TODO: 2018.11.19. returns the words which contains the subString
        ArrayList resultList = new ArrayList();
        return resultList;
    }

    public List getStringsWhichPalindromes() {
        FilePartReader.readLines();
        // TODO: 2018.11.19. returns the words from the String which are palindrome
        ArrayList palindromeList = new ArrayList();
        return palindromeList;
    }


}
