package Example1.Entities;

public class UserDetails {

    private String userId;
    private int balance;


    public String getUserId() {
        return this.userId;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //we don't want to change userId in the application, so no setter method for userId
}
