package online.rental.video.util;

import online.rental.video.dto.UserDTO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

   private static SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

   public static Session getSession(){
       return sessionFactory.getCurrentSession();
   }

   public static void save(Object video){
       try {
           Session session = HibernateUtil.getSession();
           Transaction txt= session.beginTransaction();
           session.save(video);
           txt.commit();
       }catch (Exception e){
           e.printStackTrace(System.out);
       }
   }
   public static UserDTO findUserByUsernameAndPassword(String Username, String Password){
       try {
           Session session = HibernateUtil.getSession();
           Transaction txt= session.beginTransaction();
          Query qLog =  session.createQuery("from UserDTO j where  j.uname = ? and j.pass = ?" );
          qLog.setString(0,Username);
          qLog.setString(1,Password);
          return (UserDTO)qLog.uniqueResult();
       }catch (Exception e){
           e.printStackTrace(System.out);
           throw e;
       }
   }

}
