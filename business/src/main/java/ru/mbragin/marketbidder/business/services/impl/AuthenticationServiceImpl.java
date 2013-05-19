package ru.mbragin.marketbidder.business.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mbragin.marketbidder.business.security.CustomUserAuthentication;
import ru.mbragin.marketbidder.dataaccess.AccountDao;
import ru.mbragin.marketbidder.dataaccess.UserDao;
import ru.mbragin.marketbidder.model.Account;
import ru.mbragin.marketbidder.model.User;
import ru.mbragin.marketbidder.business.services.AuthenticationService;
import ru.mbragin.marketbidder.business.services.SessionService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    SessionService sessionService;

    @Autowired
    AccountDao accountDao;

    @Autowired
    UserDao userDao;

    public CustomUserAuthentication authenticate(String username, String password) {
        sessionService.setAttribute("requestUsername", username);
        User user = userDao.findUserByUsernameAndPassword(username, password);
        CustomUserAuthentication authentication = null;
        sessionService.setAuthentication(authentication);
        boolean authenticated = false;
        if (user != null) {
            authenticated = true;
            authentication = new CustomUserAuthentication(user);
            Account account = accountDao.findAccount(user.getAccountId());
            sessionService.setAccount(account);
            authentication.setAuthenticated(authenticated);
        }
        return authentication;
    }

    public Account getAccount(long accountId) {
        return accountDao.findAccount(accountId);
    }
}
