import java.sql.*;
public class batch_update {
    public static void main(String[] args) {
        
        /*execute a number of query at a single time
        100 queries individual = 100 hits to database 
        100 queries in a batch = 1 hit to database (comparatively more effecient)
        */ 

        Connection connect=null;
        PreparedStatement statement =null;

        try 
        {
            connect=jdbc_utility.get_connection();
            String sql="UPDATE studentinfo SET SAGE=? WHERE ID=? ";
            statement=connect.prepareStatement(sql);

            statement.setInt(1,69);
            statement.setInt(2,1);
            statement.addBatch();
            statement.setInt(1,69);
            statement.setInt(2,2);
            statement.addBatch();
            statement.setInt(1,69);
            statement.setInt(2,3);
            statement.addBatch();

            statement.executeBatch();
            System.out.println("batch updated");

        }
        catch(SQLException ee)
        {
            ee.printStackTrace();
        }


    }
}
