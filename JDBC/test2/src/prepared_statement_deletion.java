import java.sql.*;
import java.util.*;
import java.sql.PreparedStatement;

/**
 * prepared_statement_deletion
 */

public class prepared_statement_deletion {

    public static void main(String[] args) {
        

        // deleting data in db using prepared statement 
        Connection connect;
        PreparedStatement statement;
        try
        {
            connect=jdbc_utility.get_connection();


            String sql="DELETE FROM studentinfo WHERE id=?";
            statement=connect.prepareStatement(sql);

            Scanner sc=new Scanner(System.in);
            System.out.println("enter id whose data is to be deleted");
            int id=sc.nextInt();

            statement.setInt(1, id);
            int rows_affected=statement.executeUpdate();
            System.out.println("affected row : "+rows_affected);
            sc.close();
            jdbc_utility.close_connection(connect, statement);

        }
        catch(SQLException ee)
        {
            ee.printStackTrace();
        }

    }
}