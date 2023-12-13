package Grupparbete2;
public class User {
    public static void main(String[] args) {
        Content c = new Content();
        c.setPage(new Loginpage(c));
        c.executepage();
    }
}
