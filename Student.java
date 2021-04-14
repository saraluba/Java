import java.time.LocalDate;

public class Student extends Person {
    private String faculty;
    private int graduateYear;

    public Student(String FirstName, String LastName, LocalDate BirthDate, String faculty, int graduateYear) {
        super(FirstName, LastName, BirthDate);
        this.faculty = faculty;
        this.graduateYear = graduateYear;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public LocalDate getBirthDate() {
        return super.getBirthDate();
    }

    @Override
    public void setFirstName(String name) {
        super.setFirstName(name);
    }

    @Override
    public void setLastName(String last) {
        super.setLastName(last);
    }

    @Override
    public void setBirthDate(LocalDate date) {
        super.setBirthDate(date);
    }

    public void setfaculty(String f){
        faculty = f;
    }

    public void setgraduateYear(int graduate){
        graduateYear = graduate;
    }

    public String getfaculty(){
        return faculty;
    }

    public int getgraduateYear(){
        return graduateYear;
    }
}
