package Grupparbete2;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        int userChoice;
        Content c = new Content();
        c.setPage(new Loginpage(c));
        c.executepage();

    }
}
