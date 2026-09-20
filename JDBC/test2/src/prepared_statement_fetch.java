
import java.sql.*;
import java.util.*;

public class prepared_statement_fetch {
    public static void main(String[] args) {

        // fetching data through prepared statement 

        Connection connect=null;
        PreparedStatement statement=null;
        ResultSet rs=null;

        try
        {
            connect=jdbc_utility.get_connection();
            String sql="SELECT * FROM studentinfo WHERE ID=?";
            statement=connect.prepareStatement(sql);

            Scanner sc= new Scanner(System.in);
            System.out.println("fetching data");
            System.out.print("Enter ID:");
            int id=sc.nextInt();

            statement.setInt(1, id);
            rs=statement.executeQuery();

            if(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
            }
         sc.close();
         jdbc_utility.close_connection(connect, statement,rs);
        }
        catch(SQLException es)
        {
            es.printStackTrace();
        }
        
    }
}
