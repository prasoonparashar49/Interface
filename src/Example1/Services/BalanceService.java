package Example1.Services;

public interface BalanceService {

    int getBalance(String userId);
    boolean setBalance(String userId, int balance);
}
