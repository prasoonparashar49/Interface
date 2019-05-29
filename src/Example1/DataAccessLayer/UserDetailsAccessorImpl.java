package Example1.DataAccessLayer;

import Example1.Entities.UserDetails;
import java.util.List;
import Example1.DatabaseAccessLayer.*;

//it is not responsible for opening and closing the database i.e it is not responsible for calling connector.close method. It is only responsible for reading and writing into database
public class UserDetailsAccessorImpl implements UserDetailsAccessor {

    DBConnector connector;
    DBHandler   handler;

    UserDetailsAccessorImpl(DBConnector connector, DBHandler handler) {
        this.connector = connector;
        this.handler = handler;
    }
    //return the list of user details
    public List<UserDetails> getUserDetails(){
        //DBConnector connector = new TextDBConnector();
        //DBHandler handler = connector.open(null);
        String text = handler.read();
        //code to convert the text into list
        return null;
    }
    //boolean states the status of success
    public boolean setUserDetails(UserDetails userDetails){
        String content = "{" + userDetails.getUserId() + "," + userDetails.getBalance() + "}";
        if(!handler.write(content)){
            System.out.println("As of now wrtie operation on database is disabled, hence cannot set user details...");
            return false;
        }
        else {
            return true;
        }
    }
}
