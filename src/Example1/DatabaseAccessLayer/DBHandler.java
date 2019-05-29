package Example1.DatabaseAccessLayer;

//Reason for making it an abstract class: A DBHandler must be associated with a particular DB
public abstract class DBHandler {

    String dbName;

    DBHandler(String dbName) {
        this.dbName = dbName;
    }
    //returns the content of entire daatabase as string. An entire tuple is enclosed in braces. Two tuples are seperated by comma.
    abstract public String read();
    //writes the record on to the respective database (to which it is associated). returns the status i.e if write succedds or not
    //ideally it should throw exception in case write faisl
    abstract public boolean write(String record);

    //ideally it shojuld throw exception if it fails
    abstract public boolean close();
}
