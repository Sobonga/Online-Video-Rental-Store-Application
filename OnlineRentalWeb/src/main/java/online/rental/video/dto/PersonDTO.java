package online.rental.video.dto;


import javax.persistence.*;


public class PersonDTO extends Dto {

    //protected int id;
    @Column
    protected String fName;
    @Column
    protected String lname;
    @Column
    protected String email;
    @Column
    protected String pnumber;
    @Column
    protected AddressDTO address;
    protected UserDTO user;

    //public int getId() {
        //return id;
   // }

   // public void setId(int id) {
        //this.id = id;
    //}

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

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
}
