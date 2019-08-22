package Test;

import PO.School;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Delete {
    public static void main(String[] args) {
        Session session=util.HibernateSessionFactory.getSession();
        School school=(School)session.get(School.class,2);
        session.delete(school);
        Transaction transaction=session.beginTransaction();
        transaction.commit();

        util.HibernateSessionFactory.closeSession();
    }
}
