public class Student {
    private int student_id;
    private String student_name;
    private double grades;



    public void setStudent_id(int student_id){
        this.student_id =student_id;
    }
    public int getStudent_id(){
        return student_id;
    }

    public void setStudent_name(String student_name){
        this.student_name = student_name;

    }
    public String getStudent_name(){
        return student_name;
    }

    public void setGrades(double grades){
        this.grades = grades;
    }

    public double getGrades (){
        return grades;
    }

    public double addGrades(double xtraGrade){
        if(grades >0){
            this.grades +=xtraGrade;
            return this.grades;
        }
        else{
            return -1;
        }
    }
}
