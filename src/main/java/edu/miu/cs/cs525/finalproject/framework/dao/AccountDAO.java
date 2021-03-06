package edu.miu.cs.cs525.finalproject.framework.dao;

import edu.miu.cs.cs525.finalproject.framework.domain.Account;
import edu.miu.cs.cs525.finalproject.framework.domain.Customer;

import java.util.Collection;

public interface AccountDAO {
    void saveAccount(Customer customer, Account account);
    void updateAccount(String customerName, Account account);
    Account loadAccount(String accountNumber);
    Collection<Account> getAccountsByCustomer(String customerName);
    Collection<Account> getAccounts();
}
