import java.sql.*;

public class Task2 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String username = "root";
        String password = "root";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username,password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("");



            connection.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
