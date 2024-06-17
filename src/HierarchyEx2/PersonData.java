package HierarchyEx2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PersonData {
    private final Person person;

    public PersonData(Person person){
        this.person = person;
    }

   public String getFullName(){
        return person.getFirstName() + " " + person.getLastName();
    }

   public Integer getAge() {
       return LocalDateTime.now().getYear() - person.getBirthday().getYear();

   }
}
