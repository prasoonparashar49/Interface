package Example1.DataAccessLayer;

import Example1.Entities.UserDetails;
import java.util.List;

//classes in service layer will use this interface
public interface UserDetailsAccessor {

    //return the list of user details
    List<UserDetails> getUserDetails();
    //boolean states the status of sucess
    boolean setUserDetails(UserDetails userDetails);
}

//responsibility of classes in database connector is to connect to the database, read the data from the database
//classes in Data Access layer must use the classes in database access layer classes to connect to the database, fetch the result from the database, create user details and return it back
//similarly, classes in data access layer must use the classes in database access lauer to update the user details
//remember the scope of application: fetch the user details and update the user details
//lets say, in db, user_balance table stores user and its balance.
