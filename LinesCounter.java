import java.io.LineNumberReader;
import java.io.IOException;

public class LinesCounter implements Runnable {
    private LineNumberReader lineReader;
    private int linesNumber = 0;

    public LinesCounter (
        LineNumberReader lineReader
    ) {
        this.lineReader = lineReader;
    }

    public void run() {
        String line = "";

        while(line != null) {
            try {
                line = this.lineReader.readLine();

                if (line != null) {    
                    this.linesNumber++;
                }
            } catch(IOException error) {
                System.out.println(error.getMessage());
            }
        }

        System.out.println(this.getLinesNumber());
    }

    public int getLinesNumber() {
        return this.linesNumber;
    }
}