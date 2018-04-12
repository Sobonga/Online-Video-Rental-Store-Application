package online.rental.video.dto;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Users")
public class UserDTO extends Dto {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private String uname;
    private String pass;

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {

        this.uname = uname;
    }

    public String getPass() {

        return pass;
    }

    public void setPass(String pass) {

        this.pass = pass;
    }

//    public List<RoleDTO> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(List<RoleDTO> roles) {
//        this.roles = roles;
//    }

   // private List<RoleDTO> roles;

}
