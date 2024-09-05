public class Section {
    private Student[] students;
    private int counter;

    public Section(int size) {
        students = new Student[10];
        counter = 0;
    }
    //add student method
    public boolean addStudent(Student student) {
        if (counter < students.length) {
            students[counter] = student;
            counter++;
        return true;
        }
        else {
            return false;
        }
    }
    //search student method
    public int searchStudent(Student student) {
        for (int i = 0; i < counter; i++) {
            if (students[i].equals(student)) {
                return i;
            }
        }
        return -1;
    }
    //calculate total ages method
    public int calculateTotalAges() {
        int totalAge = 0;
        for (int i = 0; i < counter; i++) {

        }
        return totalAge;
    }
    //calculate total avreg ages method
    public double calculateAverageAges() {
        double sum = 0;
        for (int i = 0; i < counter; i++) {

        }
        return sum;
    }
    //print student data
    public void printStudentsData(int studentId) {
        for (int i = 0; i < counter; i++) {

        }
    }
    //deleat method
    public boolean deleteStudent(Student student) {
        int index = searchStudent(student);
        if (index != -1) {
            students[index] = null;
            counter--;
        }
        return true;
    }


}
