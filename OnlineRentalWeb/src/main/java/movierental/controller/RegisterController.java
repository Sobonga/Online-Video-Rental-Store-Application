package movierental.controller;

import online.rental.video.dto.AddressDTO;
import online.rental.video.dto.CustomerDTO;
import online.rental.video.dto.UserDTO;
import online.rental.video.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class RegisterController {

    public static boolean Register(HttpServletRequest request, HttpServletResponse response){
    CustomerDTO customer = new CustomerDTO();
    customer.setEmail(request.getParameter("email"));
    customer.setfName(request.getParameter("name"));
    customer.setPnumber(request.getParameter("number"));
    customer.setLname(request.getParameter("lname"));
    AddressDTO addressDTO = new AddressDTO();
    addressDTO.setLine1(request.getParameter("line1"));
    addressDTO.setLine2(request.getParameter("line2"));
    addressDTO.setLine3(request.getParameter("line3"));
    addressDTO.setZipCode(Integer.parseInt(request.getParameter("zipcode")));
    UserDTO userDTO = new UserDTO();
    userDTO.setPass(request.getParameter("pass"));
    userDTO.setUname(request.getParameter("uname"));

    customer.setAddress(addressDTO);
    customer.setUser(userDTO);

    HibernateUtil.save(customer);
        if(customer!=null) {
            try{
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        } catch (Exception e){
            e.printStackTrace();
        }
        }else{

        }
    return false ;
    }
}
