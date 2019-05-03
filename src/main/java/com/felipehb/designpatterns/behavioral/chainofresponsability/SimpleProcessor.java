package com.felipehb.designpatterns.behavioral.chainofresponsability;

public class SimpleProcessor extends AuthenticationProcessor {

    public SimpleProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider provider) {
        if (provider.getType().equals(AuthenticationType.SIMPLE)) {
            return true;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(provider);
        }

        return false;
    }
}
