import java.util.*;
import java.sql.*;
public class prepare_statement_insertion {
    public static void main(String[] args) {
        
        Connection connect=jdbc_utility.get_connection();
        String sql;
        try{
            sql="INSERT INTO studentinfo(id,sname,sage,scity) VALUES(?,?,?,?)";
            PreparedStatement statement = connect.prepareStatement(sql);

            Scanner sc= new Scanner(System.in);
            System.out.println("Enter values to be inserted in the database");
            System.out.print("Enter ID:");
            int id=sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter name");
            String name=sc.nextLine();
            System.out.print("Enter age");
            int age=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter city");
            String city=sc.nextLine();

            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setInt(3, age);
            statement.setString(4, city); 
  
            int rows_affected=statement.executeUpdate();
            System.out.println("affected rows:"+rows_affected);
            sc.close();

            jdbc_utility.close_connection(connect, statement);

        }               

        catch(SQLException e)
        {
            e.printStackTrace();
        }
     
        
    }
}
