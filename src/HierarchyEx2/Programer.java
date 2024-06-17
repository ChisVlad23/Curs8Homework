package HierarchyEx2;

import java.util.Date;

public class Programer extends Employee{

private final String language;

    public Programer(Date dateOfEmployment, String position,
                     String firstName, String lastName, String birthday, String language) {
        super(dateOfEmployment, position, firstName, lastName, birthday);
        this.language = language;
    }

    public String getPosition(){
        position = "programmer";
        return position;
    }
}
