import online.rental.video.dto.AddressDTO;
import online.rental.video.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MyServlet")
public class WelcomeServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        try (PrintWriter writer =response.getWriter()){
            Session session = HibernateUtil.getSession();
            Transaction txt= session.beginTransaction();
            AddressDTO addressDTO =(AddressDTO)session.get(AddressDTO.class,1);
            writer.println(addressDTO.getId());

            txt.commit();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }



    }


}