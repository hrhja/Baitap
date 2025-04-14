package BAI42;

public class TEST {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main St");
        System.out.println(person);

        Student student = new Student("Alice", "456 University Rd", "Computer Science", 2023, 15000.0);
        System.out.println(student);

        Staff staff = new Staff("Bob", "789 School Ave", "High School", 3500.0);
        System.out.println(staff);
    }
}

