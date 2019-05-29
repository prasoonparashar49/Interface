package Example1.DatabaseAccessLayer;

public interface DBConnector {

    DBHandler open(String dbName);

    //ideally it should throw exception
    boolean close(DBHandler dbHandler);
}
