import java.sql.*;

/**
 * jdbc_utility
 */
public class jdbc_utility {

    static 
    {
        //will be invoked as soon as class is intialised
         try 
         {
            Class.forName("com.mysql.cj.jdbc.Driver");
         }
          catch (ClassNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
    }
    public static Connection get_connection() 
    {
        String url="jdbc:mysql://localhost:3306/jdbc_learning";
        String user="root";
        String pass="Ahg@286!#$&"; 
        try
        {
        return DriverManager.getConnection(url,user,pass);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    public static void close_connection(Connection connect ,Statement statement) throws SQLException
    {
        connect.close();
        statement.close();
    }
    public static void close_connection(Connection connect ,PreparedStatement statement) throws SQLException
    {
        connect.close();
        statement.close();
    }
    public static void close_connection(Connection connect ,PreparedStatement statement,ResultSet rs) throws SQLException
    {
        connect.close();
        statement.close();
        rs.close();
    }

}
