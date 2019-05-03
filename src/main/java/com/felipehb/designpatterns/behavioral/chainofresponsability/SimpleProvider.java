package com.felipehb.designpatterns.behavioral.chainofresponsability;

public class SimpleProvider extends AuthenticationProvider {

    @Override
    public AuthenticationType getType() {
        return AuthenticationType.SIMPLE;
    }

}
