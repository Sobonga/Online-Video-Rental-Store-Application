package online.rental.video.dto;


import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class AddressDTO extends Dto {

    @Generated(GenerationTime.INSERT)
    @Id
    private int id;
    private String line1;
    private String line2;
    private String line3;
    private int zipCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
