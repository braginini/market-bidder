package ru.mbragin.marketbidder.dataaccess;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import ru.mbragin.marketbidder.model.Account;

public interface AccountDao {

    public Account findAccount(long accountId);
}
