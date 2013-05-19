package ru.mbragin.marketbidder.business.services;


import ru.mbragin.marketbidder.business.security.CustomUserAuthentication;
import ru.mbragin.marketbidder.model.Account;

public interface AuthenticationService {

    public CustomUserAuthentication authenticate(String username, String password);

    public Account getAccount(long accountId);
}
