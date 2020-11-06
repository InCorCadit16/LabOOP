package hospital.people.staff;

import java.util.Date;
import hospital.people.Person;

public abstract class Staff extends Person {
    public Date joined;
    public String[] education;
    public String[] certification;
    public String[] languages;
}
