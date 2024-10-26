import java.util.ArrayList;

public class Lab {
    private Student[] students;
    private String teacherName;
    private String dayOfWeek;
    private int maxSize;
    private int currentSize = 0;
    private int avgGrade;
    public Lab (String teacherName, String dayOfWeek, int maxSize){
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        students = new Student[maxSize];
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacheranme) {
        if (!teacheranme.matches("[a-zA-Z]")){
            System.out.println("Invalid Teacher Name");
        }
        this.teacherName = teacherName;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        ArrayList<String> days = new ArrayList<String>();
        days.add("monday");
        days.add("tuesday");
        days.add("wednesday");
        days.add("thursday");
        days.add("friday");
        days.add("saturday");
        days.add("sunday");

        while (!(days.contains(dayOfWeek.toLowerCase()))){
            System.out.println("Invalid day");
        }
        this.dayOfWeek = dayOfWeek;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public int getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(int avgGrade) {


        this.avgGrade = avgGrade;
    }
    public double calAvg(){
        int sum = 0;
        for (int i = 0; i < currentSize; i++){
            sum += students[i].getGrade();
        }
       return avgGrade = sum / currentSize;
    }
    public void enrollStudent(Student student){
        for (int i = 0; i < students.length; i++){
            students [i] = new Student(student.getFirstname(), student.getLastname(), student.getId());
            currentSize++;
        }
    }
    public void printLabInfo(){
        System.out.println(teacherName + " " + dayOfWeek + " " + students + " " + avgGrade + " ");
    }
}
