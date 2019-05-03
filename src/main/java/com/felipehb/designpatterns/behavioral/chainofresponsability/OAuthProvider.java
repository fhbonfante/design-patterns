package com.felipehb.designpatterns.behavioral.chainofresponsability;

public class OAuthProvider extends AuthenticationProvider {

    @Override
    public AuthenticationType getType() {
        return AuthenticationType.OAUTH;
    }

}
