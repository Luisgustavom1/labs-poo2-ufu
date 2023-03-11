import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList; 
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String args[]) throws IOException {
        Path rootDir = Paths.get("..");
        File[] files = new File(rootDir.toAbsolutePath() + "/files").listFiles();
        ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(files.length);
        ArrayList<LinesCounter> linesCounters = new ArrayList<LinesCounter>();

        for(File file:files) {
            FileReader fileReader = new FileReader(new File(rootDir.toAbsolutePath() + "/files/" + file.getName()));
            LinesCounter linesCounter = new LinesCounter(new LineNumberReader(fileReader));

            linesCounters.add(linesCounter);
            poolExecutor.execute(linesCounter);
        }

        poolExecutor.shutdown();
        try {
            poolExecutor.awaitTermination(50, TimeUnit.SECONDS);
        } catch (InterruptedException error) {
            System.out.println(error.getMessage());
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