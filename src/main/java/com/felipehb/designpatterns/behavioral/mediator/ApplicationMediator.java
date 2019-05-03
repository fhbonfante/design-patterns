package com.felipehb.designpatterns.behavioral.mediator;

import java.util.ArrayList;

public class ApplicationMediator implements Mediator {

    private ArrayList<Colleague> colleagues;

    public ApplicationMediator() {
        colleagues = new ArrayList<>();
    }
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }
    public void send(String message, Colleague originator) {
        for(Colleague colleague: colleagues) {
            if(colleague != originator) {
                colleague.receive(message);
            }
        }
    }
}
