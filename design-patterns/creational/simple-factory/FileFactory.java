public class FileFactory {
    public FileFactory () {}

    static File create(String extension) {
        switch (extension) {
            case "exe":
                return new EXEFile();
            case "pdf":
                return new PDFFile();
            default:
                return new File();
        }
    }
}