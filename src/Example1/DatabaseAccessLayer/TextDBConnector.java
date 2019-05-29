package Example1.DatabaseAccessLayer;

public class TextDBConnector implements DBConnector {

    @Override
    public DBHandler open(String dbName) {
        return new TextDBHandler(dbName);
    }

    @Override
    public boolean close(DBHandler dbHandler) {
        if (dbHandler.close()) return true;
        else return false;
    }
}
