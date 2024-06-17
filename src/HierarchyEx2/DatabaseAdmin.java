package HierarchyEx2;

import java.util.Date;

public class DatabaseAdmin extends Employee{

private final String dbTechnology;

    @Override
    public String getAddress() {

        return "db admin";
    }

    public DatabaseAdmin(Date dateOfEmployment, String position, String firstName,
                         String lastName, String birthday, String dbTechnology) {
        super(dateOfEmployment, position, firstName, lastName, birthday);
        this.dbTechnology = dbTechnology;
    }
}
