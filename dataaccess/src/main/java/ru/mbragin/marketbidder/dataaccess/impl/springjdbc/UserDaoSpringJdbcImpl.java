package ru.mbragin.marketbidder.dataaccess.impl.springjdbc;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.mbragin.marketbidder.dataaccess.UserDao;
import ru.mbragin.marketbidder.dataaccess.impl.springjdbc.mapper.UserRowMapper;
import ru.mbragin.marketbidder.model.User;

@Repository
public class UserDaoSpringJdbcImpl extends AbstractSpringJdbc implements UserDao {

    private static final String TABLE_NAME = "users";
    private static final String userStatusesTableName = "user_statuses";
    private static final String tableSequence = "user_id_seq";

    public User findUserByUsernameAndPassword(String username, String password) {
        try {
            return getNamedJdbcTemplate().queryForObject("SELECT * FROM " + SCHEMA_NAME + TABLE_NAME +
                    " WHERE email = :email AND password = :password", new MapSqlParameterSource()
                    .addValue("email", username)
                    .addValue("password", password),
                    new UserRowMapper());
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void deleteUser(User user) {
        //TODO delete cascade
        getNamedJdbcTemplate().update("DELETE FROM " + TABLE_NAME + " WHERE id = :id",
                new MapSqlParameterSource("id", user.getId()));
    }


    /*public Long saveUser(User user) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        if (user.getId() == null) {
            getNamedJdbcTemplate().update("INSERT INTO " + TABLE_NAME + " (id, created, username, password" +
                    "last_logged, account_id, status_id )" +
                    "VALUES (nextval(" + tableSequence + "), " +     //id from sequence
                    ":created, " +
                    ":username," +
                    ":password," +
                    ":lastLogged," +
                    ":accountId," +
                    ":statusId)",
                    new MapSqlParameterSource()
                            .addValue("created", user.getCreated())
                            .addValue("username", user.getUsername())
                            .addValue("password", user.getPassword())
                            .addValue("lastLogged", user.getLastLogged())
                            .addValue("accountId", user.getAccount().getId())
                            .addValue("statusId", user.getStatus().getId()));
            user.setId(keyHolder.getKey().longValue());
        } else {
            updateUser(user);
        }
        return user.getId();
    }

    @Override
    public void updateUser(User user) {
        getNamedJdbcTemplate().update("UPDATE " + TABLE_NAME + " SET " +
                "created = :created, " +
                "username = :username, " +
                "password = :password, " +
                "last_logged = :lastLogged, " +
                "account_id = :accountId, " +
                "status_id = :statusId " +
                "WHERE id = :id",
                new MapSqlParameterSource()
                            .addValue("id", user.getId())
                            .addValue("created", user.getCreated())
                            .addValue("username", user.getUsername())
                            .addValue("password", user.getPassword())
                            .addValue("lastLogged", user.getLastLogged())
                            .addValue("accountId", user.getAccount().getId())
                            .addValue("statusId", user.getStatus().getId()));
    }*/
}
