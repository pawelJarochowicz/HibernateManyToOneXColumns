package columns.extra.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Application {

    public static void main(String[] args) {


        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory=configuration.buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();

        NFL_team nfl1=new NFL_team();
        nfl1.setName("Carolina Panthers");
        session.save(nfl1);

        NFL_team nfl2=new NFL_team();
        nfl2.setName("Arizona Cardinals");
        session.save(nfl2);

        NBA_team nba1=new NBA_team();
        nba1.setName("Utah Jazz");
        session.save(nba1);

        NHL_team nhl1=new NHL_team();
        nhl1.setName("Anaheim Ducks");
        session.save(nhl1);

        State state=new State();
        state.setName("Kansas");
        state.setNba_team(nba1);
        state.setNfl_team(nfl2);
        state.setNhl_team(nhl1);
        state.setCity("Boston");
        state.setRegistered_date(new Date());
        session.save(state);

        transaction.commit();
        session.close();
        System.out.println("NBA, NFL, NHL.....God Bless USA");

    }
}
