package HierarchyEx2;

import java.util.Date;

public class Programer extends Employee{

private final String language;

    public Programer(Date dateOfEmploment, String position, String language) {
        super(dateOfEmploment, position);
        this.language = language;
    }

    public String getPosition(){
        position = "programmer";
        return position;
    }
}
