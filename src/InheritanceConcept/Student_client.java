package InheritanceConcept;

public class Student_client {
    public static void main(String[] args) {
        Student s = new Student("Ram Lal", 78);
        // Object b = new Object();
        System.out.println(s);
        Student s1 = new Student("Ram Lali", 56);
        System.out.println(Student.count);
        Student.Hello();
    }
}
