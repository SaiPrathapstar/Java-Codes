import java.sql.*;
class ConnectSQL
{
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/saiprathap","root","5798saip"
        );
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from student");
        while(rs.next())
        {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            con.close();
        }
    }catch(Exception e ){System.out.println(e);}
    }
}