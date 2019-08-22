package Test;

import PO.School;
import org.hibernate.Session;

public class Query1 {
    public static void main(String[] args) {
        Session session=util.HibernateSessionFactory.getSession();
        School school=(School)session.get(School.class,1);
        System.out.println(school.getSchoolName());
        System.out.println(school.getHeader().getHeaderName());
        util.HibernateSessionFactory.closeSession();

    }
}
