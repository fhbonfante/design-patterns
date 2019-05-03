package com.felipehb.designpatterns.behavioral.chainofresponsability;

public class InvalidProvider extends AuthenticationProvider {

    @Override
    public AuthenticationType getType() {
        return AuthenticationType.INVALID;
    }

}
