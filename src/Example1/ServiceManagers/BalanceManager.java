package Example1.ServiceManagers;

import Example1.Services.BalanceService;

public class BalanceManager {

    int getBalance(String userId, BalanceService bs) {
        return bs.getBalance(userId);
    }

    boolean setBalance(String userId, int balance, BalanceService bs) {
        return bs.setBalance(userId, balance);
    }
}
