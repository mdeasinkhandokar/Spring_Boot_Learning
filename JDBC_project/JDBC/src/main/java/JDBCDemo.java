import java.sql.*;

public class JDBCDemo {


    public static final String URL = "jdbc:mysql://localhost:3306/demo_db";
    public static final String USER = "root";
    public static final String PASSWORD = "MyPassword";
    private static String sql;
    private static Connection conn;


    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);) {
            System.out.println("Connected to the Database!");
//           insertStudent(conn, "Easin", "easin@gmail.com");
            updateStudent(conn,1, "Bob","bob@gmail.com");
            selectStudents(conn);
            deleteStudent(conn, 1);


        } catch (SQLException e) {
            e.printStackTrace();


//       Connection conn = null;
//        try {
//            conn = DriverManager.getConnection(URL, USER, PASSWORD);
//            System.out.println("Connected to the Database!");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                conn.close();
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
        }

    }


    private static void insertStudent(Connection conn, String name, String email) {
        String sql = "INSERT INTO student(name,email) VALUES('" + name + "',' " + email + "')";

        try (Statement stmt = conn.createStatement()) {
            int rows = stmt.executeUpdate(sql);
            System.out.println("INSERTRD:" + rows);

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    private static void selectStudents(Connection conn) {

        String sql = "SELECT * FROM student";


        try (Statement stmt = conn.createStatement()) {
          
            ResultSet resultSet = stmt.executeQuery(sql);
            System.out.println("Student List: ");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println(id + " : " + name + ":" + email);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


public static void updateStudent(Connection conn, int id,String name , String email){
        String sql = "UPDATE student SET name = '" + name + "',email='" +email +"' WHERE id="+id;


    try (Statement stmt = conn.createStatement()) {
        int rows = stmt.executeUpdate(sql);
        System.out.println("UPDATED:" + rows);

    } catch (SQLException e) {
        e.printStackTrace();
    }




}



private static void deleteStudent(Connection conn, int id){
        String sql ="DELETE FROM student WHERE id = "+id;
     try (Statement stmt = conn.createStatement()) {
        int rows = stmt.executeUpdate(sql);
        System.out.println("DELETED:" + rows);

    } catch (SQLException e) {
        e.printStackTrace();
    }
}






}




