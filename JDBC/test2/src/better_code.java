import java.sql.*;
public class better_code {
    public static void main(String[] args) 
    {

        Connection connect=null;
        Statement statement=null;
        
        try
        {
            connect=jdbc_utility.get_connection();
            statement=connect.createStatement();
            String sql="SELECT * FROM studentinfo";
       
          boolean stats=statement.execute(sql);

            if(stats)
            {
            ResultSet rs=statement.getResultSet();
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" ");
            }
            }
            else
            {
            //non select query
            System.out.println(statement.getUpdateCount()); 
            }

        }
        catch (SQLException es)
        {
            es.printStackTrace();
        }
        finally
        {
            System.out.println("JOB ENDED");
            try 
            {
                jdbc_utility.close_connection(connect, statement);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
       
                
           
            
        


    }
}
