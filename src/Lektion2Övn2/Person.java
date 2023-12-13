package Lektion2Övn2;

public class Person {
    private String firstName = "Elias";
    private String lastName = "Elamir";
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

    public String getName(){
        return firstName + " " + lastName;
    }

    public int getAge(){
//        String str = p.datOfBirth;
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
//
//        return dateTime.compareTo(LocalDateTime.now());
        return 73;
    }

    public static void main(String[] args) {
        Person p = new Person("Peter", "Issasson", "1923-12-07", 173, 23);
        Person p1 = new Person("Venus", "Poon", "1989-01-01", 153, 40);
        Person p3 = new Person();
        System.out.println(p.getName());
        System.out.println(p1.getName());
        System.out.println(p3.getName());

        System.out.println(p.getAge());
        System.out.println(p1.getAge());
    }
}
