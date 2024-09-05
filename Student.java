public class Student {
private int studentID;
private String studentName;
private int studentAge;
private String studentGender;

public Student(int studentID, String studentName, int studentAge, String studentGender) {
    this.studentID = studentID;
    this.studentName = studentName;
    this.studentAge = studentAge;
    this.studentGender = studentGender;
}

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
    public String getStudentGender() {
    return studentGender;
    }
    public void setStudentGender(String studentGender) {
    this.studentGender = studentGender;
    }


}
