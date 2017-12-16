package com.kodilla.good.patterns.challenges;

public class MailService implements InfoServ {

    @Override
    public void inform(User user) {
        System.out.println("Mail was sent to" + user);
    }
}


