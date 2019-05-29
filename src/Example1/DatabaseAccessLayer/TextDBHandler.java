package Example1.DatabaseAccessLayer;

public class TextDBHandler extends DBHandler {

    TextDBHandler(String dbName) {
        super(dbName);
    }

    @Override
    public String read() {
        return "{Sushma,1000000},{Alok,2000000}";
    }
    @Override
    //ideally it should throw notImplementedException
    public boolean write(String record) {
        //It should use logger to log the message
        System.out.println("As of now it is read only database, you don't have permission to write");
        return false;
    }
    @Override
    public boolean close() {
        return true;
    }
}
