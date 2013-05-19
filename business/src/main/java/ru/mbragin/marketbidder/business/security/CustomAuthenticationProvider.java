package ru.mbragin.marketbidder.business.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.SaltSource;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import ru.mbragin.marketbidder.business.services.AuthenticationService;

public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    AuthenticationService authenticationService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    SaltSource saltSource;

    public CustomAuthenticationProvider() {
    }

    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        if (authentication == null)
            return null;

        String login = (String) authentication.getPrincipal();
        String encryptedPassword = passwordEncoder.encodePassword((String) authentication.getCredentials(), saltSource);

        return authenticationService.authenticate(login, encryptedPassword);
    }

    public boolean supports(Class authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
