package online.rental.video.dto;


import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;


import javax.persistence.*;

@Entity
@Table(name = "Address")
public class AddressDTO extends Dto {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private String line1;
    private String line2;

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getLine3() {
        return line3;
    }

    public void setLine3(String line3) {
        this.line3 = line3;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    private String line3;
    private int zipCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
