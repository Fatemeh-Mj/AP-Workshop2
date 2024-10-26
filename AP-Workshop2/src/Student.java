public class Student {
    private String firstname;
    private String lastname;
    private String id;
    private double grade;
    public Student(String firstname, String lastname, String id){
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        grade = 0;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if (!firstname.matches("[a-zA-Z]")){
            System.out.println("Invalid Firstname");
        }
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        if (!firstname.matches("[a-zA-Z]")){
            System.out.println("Invalid Lastname");
        }
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() != 7 || !id.matches("[0-9]")){
            System.out.println("Invalid Id");
        }
        this.id = id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printStudentInfo(){
        // printing student information
        System.out.println(firstname + " "+ lastname + " \nGRADE: " + grade);
    }

}
