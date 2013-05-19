package ru.mbragin.marketbidder.business.services;

import ru.mbragin.marketbidder.business.security.CustomUserAuthentication;
import ru.mbragin.marketbidder.model.Account;
import ru.mbragin.marketbidder.model.User;

import java.io.Serializable;

public interface SessionService {

    public CustomUserAuthentication getAuthentication();

    public void setAuthentication(CustomUserAuthentication authentication);

    public void setAccount(Account account);

    public User getUser();

    public Account getAccount();

    public boolean isAuthenticated();

    public void setAttribute(Serializable key, Serializable value);

    public Serializable getAttribute(Serializable key);

    public void removeAttribute(Serializable key);

    public boolean containsAttribute(Serializable key);

    public void logout();
}
