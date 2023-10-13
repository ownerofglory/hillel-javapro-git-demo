package ua.ithillel.git.service;

public class StringServiceDefault implements StringService {
    @Override
    public String upperCase(String s) {
        return s.toUpperCase();
    }
}
