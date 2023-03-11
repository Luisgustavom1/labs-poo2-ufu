import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList; 

public class Main {
    public static void main(String args[]) throws IOException {
        Path rootDir = Paths.get("..");
        File[] files = new File(rootDir.toAbsolutePath() + "/files").listFiles();
        ArrayList<LinesCounter> linesCounters = new ArrayList<LinesCounter>();
        ArrayList<Thread> threads = new ArrayList<Thread>();

        for(File file:files) {
            FileReader fileReader = new FileReader(new File(rootDir.toAbsolutePath() + "/files/" + file.getName()));
            LinesCounter linesCounter = new LinesCounter(new LineNumberReader(fileReader));

            linesCounters.add(linesCounter);

            Thread thread = new Thread(linesCounter);
            thread.start();

            threads.add(thread);
        }

        for(Thread thread:threads) {
            try {
                thread.join();
            } catch(InterruptedException error) {
                System.out.println(error.getMessage());
            }
        }

        int allLinesNumber = linesCounters
            .stream()
            .map(LinesCounter::getLinesNumber)
            .reduce(
                0,
                (acc, current) -> acc + current
            );

        System.out.println("Total number of lines -> " + allLinesNumber);
    }
}