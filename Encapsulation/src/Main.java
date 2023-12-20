public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setStudent_id (1);
        student.setStudent_name ("Jahid");
        student.setGrades(50.00);

        student.addGrades(30.00);


        int student_id = student.getStudent_id();
        String student_name = student.getStudent_name();
        double grades = student.getGrades();





        System.out.println("Student ID: " + student_id);
        System.out.println("Student Name: " + student_name);
        System.out.println("Student Final Grade: " + grades);

    }
}