package HierarchyEx2;

import java.time.LocalDateTime;
import java.util.Date;

public class Employee implements Person{

    private final Date dateOfEmploment;
    public String position;

    public Employee(Date dateOfEmploment, String position) {
        this.dateOfEmploment = dateOfEmploment;
        this.position = position;
    }

    @Override
    public String getFirstName() {
        return "";
    }

    @Override
    public String getLastName() {
        return "";
    }

    @Override
    public String getAddress() {
        return "";
    }

    @Override
    public LocalDateTime getBirthday() {
        return null;
    }



}
