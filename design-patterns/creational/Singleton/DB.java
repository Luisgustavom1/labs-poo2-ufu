public class DB {
    private static DB instance;
    public static String connection;

    private DB(String conn) {
        this.connection = conn;
    }

    private DB(String user, String password, String netloc, String port, String dbname) {
        this.connection = "postgresql://" + user + ":" + password + "@" + netloc + ":" + port + "/" + dbname;
    }

    public static DB getInstance() {
        if (instance == null) {
            instance = new DB(connection);
        }

        return instance;
    }
}