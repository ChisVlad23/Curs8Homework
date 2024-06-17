package HierarchyEx2;

import java.util.Date;

public class Employee implements Person{
    private final String firstName;
    private final String lastName;
    private final Date dateOfEmployment;
    public String position;
    public Date birthday;


    public Employee(Date dateOfEmployment, String position, String firstName, String lastName, String birthday) {
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getAddress() {
        return "";
    }

    @Override
    public Date getBirthday() {
        return birthday;
    }



}
