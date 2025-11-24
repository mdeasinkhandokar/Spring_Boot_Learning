import org.hibernate.Session;

public class HibernateDemoMain {


    public static void main(String[] args) {

        Session session = HibernateUtil.getSession();


        try{
            UserClassHibernate user = new UserClassHibernate(1,"Alice");
            session.beginTransaction();
            session.persist(user);///save(user)
            session.getTransaction().commit();
            System.out.println("User Saved: " +user.getId());

        }catch(Exception e){
            e.printStackTrace();

        }finally{
            HibernateUtil.close();
        }



    }



}
