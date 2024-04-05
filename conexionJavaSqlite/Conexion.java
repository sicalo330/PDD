import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:\\SQLITE\\sqlite-tools-win-x64-3450200\\usersdb.db";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            // Crear una consulta
            String query = "SELECT * FROM users";

            // Ejecutar la consulta y obtener los resultados
            try (ResultSet rs = stmt.executeQuery(query)) {
                while (rs.next()) {
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    System.out.println("Nombre: " + name + ", Email: " + email);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }
}