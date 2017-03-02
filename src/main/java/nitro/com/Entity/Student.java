package nitro.com.Entity;


import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    StudentDetail studentDetails;

    String firstName, secondName;

    public Student() {
    }

    public Student(String firstName, String secondName ) {

        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String toString(){
        return "["+getFirstName()+" "+getSecondName()+"] ";
    }


    public void addPassport(String studentDetail) {
        StudentDetail studentDetail1= new StudentDetail(studentDetail);
    }
}

