package com.felipehb.designpatterns.behavioral.chainofresponsability;

public class OAuthProcessor extends AuthenticationProcessor {

    public OAuthProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider provider) {
        if (provider.getType().equals(AuthenticationType.OAUTH)) {
            return true;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(provider);
        }

        return false;
    }

}
