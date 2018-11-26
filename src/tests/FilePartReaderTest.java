import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FilePartReaderTest {

    // T F P Stands for: Test File Path

    private final String lettersTFP = "/home/jani/Dokumentumok/codecool/OOP/5.SI Week/testTxt.txt";
    private final String testingTFP = "/home/jani/Dokumentumok/codecool/OOP/5.SI Week/example_document.txt";
    private final String filWordAnalyerTFP =
            "/home/jani/Dokumentumok/codecool/OOP/5.SI Week/file_word_analyzer_test.txt";


    @Test
    public void testFilePathIsNotFound() {
    }


    @Test
    public void testFilePartReaderSetup() throws IOException {
        FilePartReader.setup(lettersTFP, 1, 5);
        assertThrows(IllegalArgumentException.class, () -> {
            FilePartReader.setup(lettersTFP, 3, 2);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            FilePartReader.setup(lettersTFP, 0, 4);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            FilePartReader.setup(lettersTFP, 1, 0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            FilePartReader.setup(lettersTFP, 0, -1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            FilePartReader.setup(lettersTFP, -5, -2);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            FilePartReader.setup(lettersTFP, 0, -2);
        });
    }


    @Test
    public void testReadIsReadWell() throws IOException {
        System.out.println("The file's content:");
        System.out.println(FilePartReader.read(lettersTFP));

    }

    @Test
    public void testReadLinesWorkingWell() throws IOException {
        FilePartReader.setup(lettersTFP, 1, 3);
        System.out.println(FilePartReader.readLines(lettersTFP, 1, 3));
        FilePartReader.setup(lettersTFP, 1, 1);
        System.out.println(FilePartReader.readLines(lettersTFP, 1, 1));
        FilePartReader.setup(lettersTFP, 1, 2);
        System.out.println(FilePartReader.readLines(lettersTFP, 1, 2));
        FilePartReader.setup(lettersTFP, 1, 5);
        System.out.println(FilePartReader.readLines(lettersTFP, 1, 5));
    }

    @Test
    public void testReadReturnedString() throws IOException {

        assertTrue(FilePartReader.read(lettersTFP).getClass().getName().equals("java.lang.String"));
        assertFalse(!(FilePartReader.read(lettersTFP).getClass().getName().equals("java.lang.String")));
    }

    @Test
    public void testAlphabeticallyOrderingWordsReturnedArrayList() throws IOException {
        FilePartReader filePartReader = new FilePartReader();
        FileWordAnalyzer fileWordAnalyzer = new FileWordAnalyzer(filePartReader);
        ArrayList wordsOrderedAlphabetically = new ArrayList();
        wordsOrderedAlphabetically.add(fileWordAnalyzer.getWordsOrderedAlphabetically(filWordAnalyerTFP));

        System.out.println(fileWordAnalyzer.getWordsOrderedAlphabetically(filWordAnalyerTFP));
        // if the returned type is an ArrayList pass else: fail it


    }

    @Test
    public void testGetWordsContainingSubstring() throws IOException {
        FilePartReader filePartReader = new FilePartReader();
        FileWordAnalyzer fileWordAnalyzer = new FileWordAnalyzer(filePartReader);
        ArrayList wordsContainingSubstring = new ArrayList();
        wordsContainingSubstring.add(fileWordAnalyzer.getWordsContainingSubstring("dal", filWordAnalyerTFP));

        System.out.println(fileWordAnalyzer.getWordsContainingSubstring("dal", filWordAnalyerTFP));


    }

    @Test
    public void testGetWordsWhichPalindromes() throws IOException {
        FilePartReader filePartReader = new FilePartReader();
        FileWordAnalyzer fileWordAnalyzer = new FileWordAnalyzer(filePartReader);

        System.out.println(fileWordAnalyzer.getStringsWhichPalindromes(filWordAnalyerTFP));

    }


}