package com.felipehb.designpatterns.behavioral.chainofresponsability;

public abstract class AuthenticationProcessor {

    protected AuthenticationProcessor nextProcessor;

    public AuthenticationProcessor(AuthenticationProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract boolean isAuthorized(AuthenticationProvider provider);
}
