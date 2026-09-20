import java.sql.*;
import java.util.*;
public class prepared_statement_updation {
    public static void main(String[] args) {
        

        //updating a db using prepared statement

        Connection connect=null;
        PreparedStatement statement=null;

        connect=jdbc_utility.get_connection();

        try
        {
            String sql="UPDATE studentinfo SET SAGE=? WHERE ID=?";
            statement=connect.prepareStatement(sql);
            System.out.println("update the  age ");
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the id: ");
            int id=sc.nextInt();
            System.out.println("Enter the updated age");
            int age=sc.nextInt();
            statement.setInt(1,age);
            statement.setInt(2,id);
            int rows_affected=statement.executeUpdate();
            System.out.println("row affected"+rows_affected);
            sc.close();

            jdbc_utility.close_connection(connect, statement);
        }
        catch(SQLException ee)
        {
            ee.printStackTrace();
        }
        
    }
    
}
