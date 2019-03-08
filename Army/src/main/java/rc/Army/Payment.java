package rc.Army;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private double basicSalary;
    private  double rate;
    private String gradr;
    private String qualification;

    public Payment() {
    }

    public Payment(double rate, String gradr, String qualification) {
        this.rate = rate;
        this.gradr = gradr;
        this.qualification = qualification;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getRate() {
        return rate;
    }

    public String getGradr() {
        return gradr;
    }

    public String getQualification() {
        return qualification;
    }
}
