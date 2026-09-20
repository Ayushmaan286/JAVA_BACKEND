import java.sql.*;
public class data_deletion {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        //loading the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //establishing connection
        String url="jdbc:mysql://localhost:3306/jdbc_learning";
        String user="root";
        String passcode="Ahg@286!#$&";
        Connection connect=DriverManager.getConnection(url,user,passcode);

        //creating statement
        Statement statement=connect.createStatement();

        //executing query
        String sql="DELETE FROM studentinfo WHERE ID=1";
        int rowsaffected=statement.executeUpdate(sql);

        //processing data
        System.out.println(rowsaffected);
        
        
        //closing resources
        statement.close();
        connect.close();
        
    }
}
