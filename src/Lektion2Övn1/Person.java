package Lektion2Övn1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    private String firstName = "kALLE";
    private String lastName = "JOHANSSON";
    private String datOfBirth;
    private double height;
    private double weight;


    public Person(String firstName, String lastName, String datOfBirth, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.datOfBirth = datOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public Person(){}

    public static String getName(Person p){
        return p.firstName + " " + p.lastName;
    }

    public static int getAge(Person p){
//        String str = p.datOfBirth;
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate birthdate = LocalDate.parse(str, formatter);
//
//        return Period.between(birthdate,LocalDate.now());
        return 73;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Peter", "Issasson", "1923-12-07", 173, 23);
        Person p2 = new Person("Venus", "Poon", "1989-01-01", 153, 40);
        Person p3 = new Person();
        System.out.println(getName(p1)); //p2 getName
        System.out.println(getName(p2)); //p1 getName
        System.out.println(getName(p3));

//        System.out.println(getAge(p));
//        System.out.println(getAge(p1));
    }
}
