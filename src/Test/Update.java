package Test;


import PO.School;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Update {
    public static void main(String[] args) {
        Session session=util.HibernateSessionFactory.getSession();
        School school=(School)session.get(School.class,3);
        school.getHeader().setHeaderName("欧世乐");
        Transaction transaction=session.beginTransaction();
        session.update(school);
        transaction.commit();

        util.HibernateSessionFactory.closeSession();
    }
}
