import java.time.LocalDate;

public class Person {
    private String FirstName;
    private String LastName;
    private LocalDate BirthDate;

    public Person(String FirstName, String LastName, LocalDate BirthDate){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.BirthDate = BirthDate;
    }

    public void setFirstName(String name){
        FirstName = name;
    }

    public void setLastName(String last){
        LastName = last;
    }

    public void setBirthDate(LocalDate date){
        BirthDate = date;
    }

    public String getFirstName(){
        return FirstName;
    }

    public String getLastName(){
        return LastName;
    }

    public LocalDate getBirthDate(){
        return BirthDate;
    }
}
