import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FilePartReaderTest {

    private final String theLettersTestFilePath = "/home/jani/Dokumentumok/codecool/OOP/5.SI Week/testTxt.txt";
    private final String theTestingTestFilePath = "/home/jani/Dokumentumok/codecool/OOP/5.SI Week/example_document.txt";


    @Test
    public void testFilePathIsNotFound() {
    }


    @Test
    public void testFilePartReaderSetup() throws IOException {
        FilePartReader.setup(theLettersTestFilePath, 1, 5);
        assertThrows(IllegalArgumentException.class, () -> {
            FilePartReader.setup(theLettersTestFilePath, 3, 2);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            FilePartReader.setup(theLettersTestFilePath, 0, 4);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            FilePartReader.setup(theLettersTestFilePath, 1, 0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            FilePartReader.setup(theLettersTestFilePath, 0, -1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            FilePartReader.setup(theLettersTestFilePath, -5, -2);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            FilePartReader.setup(theLettersTestFilePath, 0, -2);
        });
    }


    @Test
    public void testReadIsReadWell() throws IOException {
        System.out.println("The file's content:");
        System.out.println(FilePartReader.read(theLettersTestFilePath));

    }

    @Test
    public void testReadLinesWorkingWell() throws IOException {
        FilePartReader.setup(theLettersTestFilePath, 1, 3);
        System.out.println(FilePartReader.readLines(theLettersTestFilePath, 1, 3));
        FilePartReader.setup(theLettersTestFilePath, 1, 1);
        System.out.println(FilePartReader.readLines(theLettersTestFilePath, 1, 1));
        FilePartReader.setup(theLettersTestFilePath, 1, 2);
        System.out.println(FilePartReader.readLines(theLettersTestFilePath, 1, 2));
        FilePartReader.setup(theLettersTestFilePath, 1, 5);
        System.out.println(FilePartReader.readLines(theLettersTestFilePath, 1, 5));
    }


}