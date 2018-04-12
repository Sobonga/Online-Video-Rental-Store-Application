package online.rental.video.dto;

import org.hibernate.annotations.Cascade;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class CustomerDTO  {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    protected String fName;

    protected String lname;

    protected String email;

    protected String pnumber;
    @ManyToOne
    @JoinColumn(name = "Address_ID")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    protected AddressDTO address;

    @ManyToOne
    @JoinColumn(name = "User_ID")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    protected UserDTO user;

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public void setId(int id) {
        this.id = id;
    }
}
