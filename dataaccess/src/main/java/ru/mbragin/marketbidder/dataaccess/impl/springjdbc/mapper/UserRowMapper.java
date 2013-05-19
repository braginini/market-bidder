package ru.mbragin.marketbidder.dataaccess.impl.springjdbc.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.mbragin.marketbidder.model.Account;
import ru.mbragin.marketbidder.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();

        user.setId(new Long(resultSet.getLong("id")));
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
        user.setAccountId(resultSet.getLong("account_id"));

        user.setFirstName(resultSet.getString("first_name"));
        user.setLastName(resultSet.getString("last_name"));
        user.setToken(resultSet.getString("token"));
        Time time = resultSet.getTime("last_Logged");
        if (time != null)
            user.setLastLogged(new Date(time.getTime()));

        return user;
    }
}
