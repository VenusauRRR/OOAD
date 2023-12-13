package Grupparbete2;

import java.util.Scanner;

public class Logoutpage extends ExecutePageCreator{

    public Logoutpage(Content contentpage) {
        super(contentpage);
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}
