package nitro.com.Entity;


import javax.persistence.*;

@Entity
public class StudentDetail {

    @Id
    @GeneratedValue
    private long id;

    String passport;

    public StudentDetail() {
    }

    public StudentDetail(String passport) {
        this.passport = passport;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
    public String toString(){
        return getPassport();
    }

}
