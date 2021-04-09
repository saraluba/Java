import java.time.LocalDate;

public class Student extends Person {
    private String Faculty;
    private int GraduateYear;

    public Student(String FirstName, String LastName, LocalDate BirthDate, String Faculty, int GraduateYear) {
        super(FirstName, LastName, BirthDate);
        this.Faculty = Faculty;
        this.GraduateYear = GraduateYear;
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

    public void setFaculty(String f){
        Faculty = f;
    }

    public void setGraduateYear(int graduate){
        GraduateYear = graduate;
    }

    public String getFaculty(){
        return Faculty;
    }

    public int getGraduateYear(){
        return GraduateYear;
    }
}
