package ru.mbragin.marketbidder.dataaccess.impl.springjdbc.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.mbragin.marketbidder.model.Account;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRowMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();

        account.setId(new Long(resultSet.getLong("id")));
        account.setEmail(resultSet.getString("email"));

        return account;
    }
}
