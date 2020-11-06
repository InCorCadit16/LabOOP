
import java.util.ArrayList;
import hospital.*;
import hospital.people.Patient;
import hospital.people.staff.operational.Nurse;
import hospital.people.staff.operational.Surgeon;

public class MainHospital {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.name = "My hospital";
        System.out.println(hospital.name);

        hospital.departments = new ArrayList<>();

        var dep = new Department();
        dep.staff = new ArrayList<>();
        dep.staff.add(new Nurse());
        dep.staff.add(new Nurse());
        dep.staff.add(new Surgeon());

        hospital.departments.add(dep);

        hospital.persons = new ArrayList<>();
        hospital.persons.add(new Patient());
        hospital.persons.add(new Patient());
    }
}
