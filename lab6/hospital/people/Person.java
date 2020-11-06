package hospital.people;

import java.util.Date;
import java.util.List;
import hospital.utils.*;
import hospital.Hospital;



public abstract class Person {
    public String title;
    public String givenName; 
    public String middleName;
    public String lastName;
    public FullName name;
    public Date birthDate;
    public Gender gender;
    public Address homeAddress;
    public Phone phone;
    public List<Hospital> hospitals;
}

