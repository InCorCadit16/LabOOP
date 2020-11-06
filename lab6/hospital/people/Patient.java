package hospital.people;

import java.util.Date;
import java.util.List;
import hospital.utils.*;
import hospital.people.staff.operational.OperationsStaff;

public class Patient extends Person {
    public String id;
    public int age;
    public Date accepted;
    public History sickness;
    public String[] prescriptions;
    public String[] allergies;
    public String[] specialReqs;
    public List<OperationsStaff> operationsStaff; 
}
