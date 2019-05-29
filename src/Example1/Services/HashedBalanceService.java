package Example1.Services;

import Example1.Services.BalanceService;

public class HashedBalanceService implements BalanceService {

    @Override
    public int getBalance(String userId) {
        return 0;
    }

    @Override
    public boolean setBalance(String userId, int balance) {
        return false;
    }
}
