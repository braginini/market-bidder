package ru.mbragin.marketbidder.dataaccess.impl.springjdbc;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.mbragin.marketbidder.dataaccess.AccountDao;
import ru.mbragin.marketbidder.dataaccess.impl.springjdbc.mapper.AccountRowMapper;
import ru.mbragin.marketbidder.model.Account;

@Repository
public class AccountDaoSpringJdbcImpl extends AbstractSpringJdbc implements AccountDao {

    private String TABLE_NAME = "accounts";
    private String tableSequence = "account_id_seq";

    public Account findAccount(long accountId) {
        try {
            return getNamedJdbcTemplate().queryForObject("SELECT * FROM " + SCHEMA_NAME + TABLE_NAME +
                    " WHERE id = :accountId", new MapSqlParameterSource("accountId", accountId),
                    new AccountRowMapper());
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
