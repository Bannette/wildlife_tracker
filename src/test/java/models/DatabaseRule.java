package models;

import org.junit.rules.ExternalResource;
import org.sql2o.*;





public class DatabaseRule extends ExternalResource {

    @Override
    protected void before() {
        Database.sql2otest = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "user","666Nikol-");
    }
    @Override
    protected void after(){
        try(Connection con=Database.sql2otest.open()){
            String deleteAnimalsQuery ="DELETE FROM animals *;";
            String deleteSightingsQuery="DELETE FROM sightings;";
            con.createQuery(deleteAnimalsQuery).executeUpdate();
//            con.createQuery(deleteSightingsQuery).executeUpdate();
        }
    }


}



