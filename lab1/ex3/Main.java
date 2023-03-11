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
    public static void main(String args[]) {
        linesCounterWithMetrics(false);
        linesCounterWithMetrics(true);
    }

    public static void linesCounterWithMetrics(boolean withThread) {
        Path rootDir = Paths.get(".."); 
        File[] files = new File(rootDir.toAbsolutePath() + "/files").listFiles();

        try {
            long startTime = System.currentTimeMillis();

            if (withThread) {
                System.out.println("\nTotal number of lines with thread -> " + linesCounterWithThread(files, rootDir));
            } else {
                System.out.println("\nTotal number of lines without thread -> " + linesCounterWithoutThread(files, rootDir));
            }

            long endTime = System.currentTimeMillis();
        
            System.out.println("Time to read the files " + (endTime - startTime) + " milliseconds");
        } catch (IOException error) {
            System.out.println(error.getMessage());
        }
    }

    // Media foi feita com 3 resultados
    // Média de 96 milisegundos -> 10 arquivos
    // Média de 273 milisegundos -> 100 arquivos 
    // Média de 1750,33 milisegundos -> 1000 arquivos
    public static int linesCounterWithoutThread(File[] files, Path rootDir) throws IOException {
        int allLinesNumber = 0;

        for(File file:files) {
            FileReader fileReader = new FileReader(new File(rootDir.toAbsolutePath() + "/files/" + file.getName()));
            LinesCounter linesCounter = new LinesCounter(new LineNumberReader(fileReader));

            linesCounter.run();
            allLinesNumber += linesCounter.getLinesNumber();
        }

        return allLinesNumber;
    }

    // Media foi feita com 3 resultados
    // Média de 19,33 -> 10 arquivos 
    // Média de 88,33 -> 100 arquivos 
    // Média de 688.67 -> 1000 arquivos
    public static int linesCounterWithThread(File[] files, Path rootDir) throws IOException {
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

        return allLinesNumber;
    }
}