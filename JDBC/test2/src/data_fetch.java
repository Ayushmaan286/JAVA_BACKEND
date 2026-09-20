import java.sql.*;
public class data_fetch {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        //loading the driver 
        Class.forName("com.mysql.cj.jdbc.Driver");

        //establishing the connection
        String url="jdbc:mysql://localhost:3306/jdbc_learning";
        String usenrame="root";
        String passcode="Ahg@286!#$&";
        Connection connect = DriverManager.getConnection(url,usenrame,passcode);
        
        //creating the statement 
        Statement statement = connect.createStatement();

        //execute query 
        String sql="SELECT * FROM studentinfo";
        ResultSet rs=statement.executeQuery(sql);

        //process result
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" ");  
        }
        
        rs.close();
        statement.close();
        connect.close();




    }
    
}