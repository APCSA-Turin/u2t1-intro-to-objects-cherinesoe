public class Student {

    // instance variables
    private String name;
    private int grade;
    
    // constructor
    public Student(String studentName, int studentGrade) {
        name = studentName;
        grade = studentGrade;
    }

    public void introduce() {
        System.out.println("Hello my name is " + name + " and I am in grade " + grade + ".");
    }

    public void information() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Grade: " + grade);
    }
}
