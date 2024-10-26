public class Main {
    public static void main (String [] args){
        Student st1 = new Student("James", "Goslin", "0987654");
        st1.setGrade(18);
        st1.printStudentInfo();
        Student st2 = new Student("Dennis","Richie", "1234567");
        st2.setGrade(17.5);
        Lab lab1 = new Lab("Mr.Smith", "Monday", 30);
        lab1.enrollStudent(st1);
        lab1.enrollStudent(st2);
        lab1.printLabInfo();
    }
}
