package HierarchyEx2;

import java.util.Date;

public class DatabaseAdmin extends Employee{

private final String dbTechnology;

    @Override
    public String getAddress() {

        return "db admin";
    }

    public DatabaseAdmin(Date dateOfEmploment, String position, String dbTechnology) {
        super(dateOfEmploment, position);
        this.dbTechnology = dbTechnology;
    }
}
