package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(5,0);
        } catch (Exception e) {
            System.out.println("exception!!!");
        } finally {
            System.out.println("task completed");
        }

    }
}

