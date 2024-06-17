package HierarchyEx2;

import java.time.LocalDate;

public class PersonData {
    private final Person person;

    public PersonData(Person person){
        this.person = person;
    }

   public String getFullName(){
        return person.getFirstName() + " " + person.getLastName();
    }

 //   public int getAge(){
 //       LocalDate today = LocalDate.now();

    //}
}
