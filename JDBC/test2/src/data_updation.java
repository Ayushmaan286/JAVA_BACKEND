import java.sql.*;

public class data_updation {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        //load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //establish the connection
        String url="jdbc:mysql://localhost:3306/jdbc_learning";
        String user="root";
        String password="Ahg@286!#$&";
        Connection connect = DriverManager.getConnection(url, user , password);

        // creating statement
        Statement statement = connect.createStatement();
        
        //exceute the query
        String sql=" UPDATE studentinfo SET sage=52 WHERE id=3";
        int rowsaffected=statement.executeUpdate(sql);
        if(rowsaffected==0)
        {
            System.out.println("Unable to insert data");
        }
        else
        {
            System.out.println("data updated succesfully");
        }
        // process the result

        //close the resources
        statement.close();
        connect.close();


    }
    
}
