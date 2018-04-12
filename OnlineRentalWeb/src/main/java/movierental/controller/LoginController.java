package movierental.controller;

import online.rental.video.dto.UserDTO;
import online.rental.video.util.HibernateUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController {
    public static boolean Login(HttpServletRequest request, HttpServletResponse response){
        String userName = request.getParameter("uname");
        String password = request.getParameter("pass");

       UserDTO user = HibernateUtil.findUserByUsernameAndPassword(userName,password);
        if(user!=null){
            try {
                request.getSession().setAttribute("user", user);
                //(UserDTO)request.getSession().getAttribute("user");

                request.getRequestDispatcher("rentalPage.jsp").forward(request, response);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{

        }
        return false;
    }
}
