package com.felipehb.designpatterns.behavioral.chainofresponsability;

public class UserAuthenticationSample {

    public static void main(String[] args) {
        AuthenticationProcessor oAuthProcessor = new OAuthProcessor(null);
        AuthenticationProcessor simpleProcessor = new SimpleProcessor(null);
        AuthenticationProcessor simpleProcessorNestedWithOauthProcessor = new SimpleProcessor(oAuthProcessor);

        System.out.println(simpleProcessorNestedWithOauthProcessor.isAuthorized(new OAuthProvider()));
        System.out.println(simpleProcessorNestedWithOauthProcessor.isAuthorized(new SimpleProvider()));
        System.out.println(simpleProcessorNestedWithOauthProcessor.isAuthorized(new InvalidProvider()));
        System.out.println(simpleProcessor.isAuthorized(new OAuthProvider()));
        System.out.println(simpleProcessor.isAuthorized(new SimpleProvider()));
        System.out.println(simpleProcessor.isAuthorized(new InvalidProvider()));
        System.out.println(oAuthProcessor.isAuthorized(new OAuthProvider()));
        System.out.println(oAuthProcessor.isAuthorized(new SimpleProvider()));
        System.out.println(oAuthProcessor.isAuthorized(new InvalidProvider()));
    }

}
