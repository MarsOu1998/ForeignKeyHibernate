package Test;

import PO.Header;
import PO.School;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Insert {
    public static void main(String[] args) {
        Session session=util.HibernateSessionFactory.getSession();
        School school=new School();
        school.setSchoolId(4);
        school.setSchoolName("同济大学");
        Header header=new Header();
        header.setHeaderName("章华");
        header.setHeaderId(7);
        header.setSchoolId(4);
        school.setHeader(header);
        Transaction transaction=session.beginTransaction();
        session.save(school);
        transaction.commit();
        util.HibernateSessionFactory.closeSession();
    }
}
