package movierental;


public class User {
    private String uname;
    private String pass;
    private String name;
    private String lname;
    private String email;
    private String address;
    private String pnumber;
    public String getUsername() {
        return uname;
    }
    public void setUsername(String uname) {
        this.uname = uname;
    }
    public String getPassword() {
        return pass;
    }
    public void setPassword(String pass) {
        this.pass = pass;
    }
    public String getFirstname() {
        return name;
    }
    public void setFirstname(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lname;
    }
    public void setLastname(String lname) {
        this.lname = lname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return pnumber;
    }
    public void setPhone(String pnumber) {
        this.pnumber = pnumber;
    }
}
