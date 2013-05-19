package ru.mbragin.marketbidder.dataaccess;

import org.springframework.dao.DataAccessException;
import ru.mbragin.marketbidder.model.Account;
import ru.mbragin.marketbidder.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {

    public User findUserByUsernameAndPassword(String username, String password);
    /*public List<User> findUsersByAccount(Account account);
    public void deleteUser(User user);
    public Long saveUser(User user);
    public void updateUser(User user);*/
}
